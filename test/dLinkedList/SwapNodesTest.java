package dLinkedList;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import static org.junit.Assert.assertEquals;

public class SwapNodesTest {
    private static ListNode head;
    @BeforeClass
    public static void setUp() {
        int[] nums = {1,2,3,4};
        head = Construction.constructFromArray(nums);
    }

    @Test
    public void swapNodesInPairs() {
        ListNode resHead = SwapNodes.swapPairs(head);
        List<Integer> res = Traversal.traverseLinkedList(resHead);

        assertEquals(List.of(2,1,4,3), res);
    }

}
