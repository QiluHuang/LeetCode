package dLinkedList;

import java.util.ArrayList;
import java.util.List;

public class Construction {

    // Array to LinkedList
    public static ListNode constructFromArray(int[] nums) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int num : nums) {
            ListNode node = new ListNode(num);
            curr.next = node;
            curr = curr.next;
        }

        return dummy.next;
    }


    // LinkedList to Array
    public static int[] contructFromLinkedList(ListNode head) {
        ListNode curr = head;
        int size = 0;
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        int[] res = new int[size];
        curr = head;
        for (int i = 0; i < size; i++) {
            res[i] = curr.val;
            curr = curr.next;
        }

        return res;
    }
}
