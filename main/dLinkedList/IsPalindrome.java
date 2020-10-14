package dLinkedList;

import java.util.Stack;

public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        boolean res = true;

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            stack.push(slow);
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast != null && fast.next == null) slow = slow.next;

        while (!stack.isEmpty()) {
            ListNode curr = stack.pop();
            if (slow.val != curr.val) {
                res = false;
            } else {
                slow = slow.next;
            }
        }

        return res;
    }
}
