package dLinkedList;

public class SwapNodes {
    /** 24 Swap Nodes in Pairs */
    public static ListNode swapPairs(ListNode head) {
        if (head == null) return null;

        ListNode dummy = null;
        dummy.next = head;
        ListNode tail = dummy;
        ListNode prev = head;

        while (prev != null && prev.next != null) {
            ListNode curr = prev.next;
            ListNode next = curr.next;

            curr.next = prev;
            prev.next = tail;

            tail = curr;
            prev = next;
        }

        return prev == null ? prev.next : prev;
    }

}
