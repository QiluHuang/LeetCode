package dLinkedList;

public class Removal {
    /** 19. Remove Nth Node From End of List */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        int count = n;
        while (count > 0) {
            fast = fast.next;
            count--;
        }

        ListNode slow = dummy;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }


        slow.next = slow.next.next;

        return dummy.next;
    }
}
