package aSorting;

import dLinkedList.ListNode;
import org.junit.BeforeClass;
import org.junit.Test;

public class InsertionSortTest {
    private static ListNode head;
    @BeforeClass
    public static void setUp() {
        head = new ListNode(1);
        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(1);
//        ListNode node3 = new ListNode(3);

        head.next = node1;
//        node1.next = node2;
//        node2.next = node3;
    }

    @Test
    public void generalTest() {
//        int[] nums = {4,2,1,3};
//        ListNode head = ConstructionToLinkedList.constructFromArray(nums);

        InsertionSort.insertionSortList(head);

        ListNode curr = head;
        while (curr != null) {
            System.out.println(curr.val);
        }
    }
}
