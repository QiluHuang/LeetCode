package dLinkedList;

import java.util.Stack;

public class Caculation {
    /** 2. Add Two Numbers */
    public static ListNode addTwoNumbersReversely(ListNode l1, ListNode l2) {
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

    /** 369. Plus One Linked List */


    /** 445. Add Two Numbers II */
    // Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
     // Output: 7 -> 8 -> 0 -> 7
    public ListNode addTwoNumbersForwardly(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // get two number reversely with stack
        putIntIntoStack(stack1, l1);
        putIntIntoStack(stack2, l2);

        // calculate
        ListNode curr = new ListNode();
        int sum = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (!stack1.isEmpty()) sum += stack1.pop();
            if (!stack2.isEmpty()) sum += stack2.pop();

            curr.val = sum % 10;
            ListNode head = new ListNode(sum / 10);

            // insert node in the front of the list
            head.next = curr;
            curr = head;


            // update
            sum /= 10;
        }

        return curr.val == 0 ? curr.next : curr;
    }

    private void putIntIntoStack(Stack<Integer> stack, ListNode pointer) {
        while (pointer != null) {
            stack.push(pointer.val);
            pointer = pointer.next;
        }
    }
}
