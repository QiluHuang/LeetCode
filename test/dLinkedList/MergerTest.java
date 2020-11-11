package dLinkedList;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MergerTest {
    private static ListNode t1;
    private static ListNode t2;

    @BeforeClass
    public static void setUp() {
        t1 = new ListNode(5);



        t2 = new ListNode(1);
        ListNode node21 = new ListNode(2);
        ListNode node22 = new ListNode(4);

        t2.next = node21;
        node21.next = node22;
    }

    @Test
    public void mergerTwoListTest() {
        ListNode res = Merger.mergeTwoLists(t1, t2);

        ListNode expected = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(5);

        assertEquals(expected, res);
    }
}
