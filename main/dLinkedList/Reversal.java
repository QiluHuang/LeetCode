package dLinkedList;

public class Reversal {
    /**
     * 206. Reverse Linked List
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode pre = null;
        ListNode curr = head;

        while (curr != null) {
            // mark the next node of curr node
            ListNode next = curr.next;

            // reverse
            curr.next = pre;

            // move
            pre = curr;
            curr = next;
        }

        return pre;
    }

//    public static ListNode reverseList(ListNode head) {
//        if (head == null) return null;
//
//        ListNode prev = null;
//        ListNode curr = head;
//        ListNode next = head.next;
//
//        while (curr != null) {
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//            if (next != null) next = next.next;
//        }
//
//        return prev;
//    }


    /**
     * 92. Reverse Linked List II
     */
    public static ListNode reverseBetween(ListNode head, int m, int n) {

        int count = 1;
        ListNode prev = head;
        ListNode curr = prev.next;
        ListNode tail = null;
        ListNode resHead = null;


        while (curr.next != null) {
            ListNode next = curr.next;

            if (count == m) {
                tail = prev;
            } else if (count < m) {
                resHead = prev;
            }

            if (count >= m && count < n) {
                curr.next = prev;
            }

            if (count == n - 1) {
                if (resHead != null) resHead.next = curr;
                resHead = curr;
                tail.next = next;
            }

            prev = curr;
            curr = next;
            count++;
        }


        return m != 1 ? head : resHead;

    }
}
