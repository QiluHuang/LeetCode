package dLinkedList;

public class IntersectionOfTwoLinkedLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = (a.next != null) ? a.next : headB;
            b = (b.next != null) ? b.next : headA;
        }

        return a;
    }
}
