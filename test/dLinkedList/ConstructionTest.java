package dLinkedList;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ConstructionTest {
    @Test
    public void generalTest() {
        int[] nums = {1,2,3};
        ListNode l1 = Construction.constructFromArray(nums);
    }

    @Test
    public void contructFromLinkedList() {
        int[] nums = {5,4,3,2,1};
        ListNode head = Construction.constructFromArray(nums);
        int[] res = Construction.contructFromLinkedList(head);
        assertArrayEquals(nums,res);
    }
}
