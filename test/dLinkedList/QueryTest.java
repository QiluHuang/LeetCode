package dLinkedList;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class QueryTest {
    private static ListNode head1;
    private static ListNode head2;

    @BeforeClass
    public static void setUp() {
        int[] nums1 = {1,2,3,4,5};
        head1 = Construction.constructFromArray(nums1);

        int[] nums2 = {1,2,3,4,5,6};
        head2 = Construction.constructFromArray(nums2);
    }
    @Test
    public void middleNodeTest() {
        ListNode res1 = Query.middleNode(head1);
        assertEquals(3,res1.val);

        ListNode res2 = Query.middleNode(head2);
        assertEquals(4,res2.val);
    }
}
