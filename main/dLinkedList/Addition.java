package dLinkedList;

public class Addition {
    /** 2. Add Two Numbers */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int sum = 0;

        while (l1 != null && l2 != null) {
            sum = sum + l1.val + l2.val;
            ListNode node = new ListNode(sum % 10);
            sum /= 10;

            curr.next = node;
            curr = curr.next;
        }

        if (l1 != null) {
            curr.next = l1;
        } else if (l2 != null) {
            curr.next = l2;
        }

        return dummy.next;
    }
}
