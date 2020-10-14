package aSorting;

import dLinkedList.ListNode;

public class InsertionSort {
    public static ListNode insertionSortList(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode preCurr = head;

        while (preCurr.next != null) {
            ListNode prev = dummy;
            ListNode curr = preCurr.next;
            ListNode next = curr.next;


            while (prev.next.val <= curr.val) {
                prev = prev.next;
            }

            if (prev.next != curr) {
                curr.next = prev.next;
                prev.next = curr;
                preCurr.next = next;
            }

            preCurr = curr;
        }

        return dummy.next;
    }
}
