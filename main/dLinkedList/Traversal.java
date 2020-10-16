package dLinkedList;

import java.util.ArrayList;
import java.util.List;

public class Traversal {
    public static List<Integer> traverseLinkedList(ListNode head) {
        List<Integer> res = new ArrayList<>();

        ListNode curr = head;
        while (curr != null) {
            res.add(curr.val);
            curr = curr.next;
        }

        return res;
    }
}
