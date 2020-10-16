package dLinkedList;

public class ListNode {
    public int val;         //如果要封装就加private
    public ListNode next;   //如果要封装就加private

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return this.val;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getNext() {
        return this.next;
    }
}
