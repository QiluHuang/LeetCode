package dLinkedList;

public class Reorder {
    /** 61. Rotate List */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (head.next == null) return head;

        // close the linked list into the ring
        ListNode oldTail = head;
        int numNodes = 0;
        for (numNodes = 1; oldTail.next != null; numNodes++) {
            oldTail = oldTail.next;
        }
        oldTail.next = head;

        // find new tail : (n - k % n - 1)th node
        // and new head : (n - k % n)th node
        ListNode newTail = head;
        for (int i = 0; i < numNodes - k % numNodes - 1; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;

        // break the ring
        newTail.next = null;

        return newHead;
    }

    /**  92. Reverse Linked List II */
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

    /** 206. Reverse Linked List */
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



}
