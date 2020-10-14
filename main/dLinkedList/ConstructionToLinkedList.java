package dLinkedList;

public class ConstructionToLinkedList {

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
}
