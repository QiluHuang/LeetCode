package dLinkedList;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReversalTest {
    private static ListNode head1;
    private static ListNode head2;

    @BeforeClass
    public static void setUp() {
        int[] nums1 = {1,2,3,4,5};
        head1 = Construction.constructFromArray(nums1);

        int[] nums2 = {3,5,2,1,9,11,13};
        head2 = Construction.constructFromArray(nums2);
    }

    @Test
    public void reverseListTest() {
        ListNode resHead1 = Reversal.reverseList(head1);
        List<Integer> res1 = Traversal.traverseLinkedList(resHead1);
        assertEquals(List.of(5,4,3,2,1), res1);


        ListNode resHead2 = Reversal.reverseList(head2);
        List<Integer> res2 = Traversal.traverseLinkedList(resHead2);
        assertEquals(List.of(13,11,9,1,2,5,3), res2);
    }


    @Test
    public void reverseBetweenTest() {
        ListNode resHead = Reversal.reverseBetween(head1, 1, 5);

        List<Integer> res = Traversal.traverseLinkedList(resHead);

        assertEquals(List.of(5,4,3,2,1), res);
    }
}
