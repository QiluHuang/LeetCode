package dLinkedList;

public class Merger {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        dummy.next = l1;
        ListNode next;
        ListNode prev = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                next = l1.next;
                l1.next = l2;
                prev = l2;
                l1 = next;
                l2 = l2.next;
            } else if (l2.val < l1.val) {
                prev.next = l2;
                next = l2.next;
                l2.next = l1;
                prev = l1;
                l1 = l1.next;
                l2 = next;
            }
        }

        if (l1 != null) {
            prev.next = l1;
        } else if (l2 != null) {
            prev.next = l2;
        }

        return dummy.next;
    }
}
