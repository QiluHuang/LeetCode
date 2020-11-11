package dLinkedList;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntersectionOfTwoLinkedListsTest {
    private static ListNode headA;
    private static ListNode headB;

    @BeforeClass
    public static void setUp() {
        headA = new ListNode(2);
        ListNode a11 = new ListNode(6);
        ListNode a12 = new ListNode(4);


        headA.next = a11;
        a11.next = a12;


        headB = new ListNode(1);
        ListNode a21 = new ListNode(5);

        headB.next = a21;
    }

    @Test
    public void generalTest() {
        ListNode res = IntersectionOfTwoLinkedLists.getIntersectionNode(headA, headB);

        ListNode expected = null;

        assertEquals(expected, res);
    }
}
