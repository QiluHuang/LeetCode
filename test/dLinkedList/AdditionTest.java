package dLinkedList;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AdditionTest {
    private static ListNode l1;
    private static ListNode l2;

    @BeforeClass
    public static void setUp() {
//        l1 = new ListNode(2);
//        ListNode node11 = new ListNode(4);
//        ListNode node12 = new ListNode(3);
//
//        l2 = new ListNode(5);
//        ListNode node21 = new ListNode(6);
//        ListNode node22 = new ListNode(4);

        int[] nums1 = {2,4,3};
        l1 = Construction.constructFromArray(nums1);

        int[] nums2 = {5,6,4};
        l2 = Construction.constructFromArray(nums2);
    }

    @Test
    public void addTwoNumbersTest() {
        ListNode resHead = Addition.addTwoNumbers(l1, l2);
        List<Integer> res = Traversal.traverseLinkedList(resHead);
        assertEquals(List.of(7,0,8), res);
    }
}
