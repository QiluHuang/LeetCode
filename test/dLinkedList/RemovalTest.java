package dLinkedList;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemovalTest {
    private static ListNode head1;
    private static ListNode head2;
    private ListNode head3;

    @BeforeClass
    public static void setUp() {
        int[] nums1 = {1,2,3,4,5};
        head1 = Construction.constructFromArray(nums1);

        int[] nums2 = {1,2};
        head2 = Construction.constructFromArray(nums2);
    }

    @Test
    public void removeNthFromEndTest() {
        ListNode res1 = Removal.removeNthFromEnd(head1, 2);
        List<Integer> list1 = Traversal.traverseLinkedList(res1);
        assertEquals(List.of(1,2,3,5), list1);

        ListNode res2 = Removal.removeNthFromEnd(head2,2);
        List<Integer> list2 = Traversal.traverseLinkedList(res2);
        assertEquals(List.of(2), list2);
    }
}
