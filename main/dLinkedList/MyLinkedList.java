package dLinkedList;


class AListNode {
    int val;
    AListNode next;

    public AListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MyLinkedList {
    AListNode head;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        AListNode curr = head;
        int count = 0;

        while (curr != null) {
            if (count == index) {
                return curr.val;
            }
            curr = curr.next;
            count++;
        }

        return -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
//        AListNode dummy = new AListNode(0);
//        dummy.next = head;

        AListNode node = new AListNode(val);
        node.next = head;
        //dummy.next = node;
        head = node;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        AListNode curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        AListNode node = new AListNode(val);
        curr.next = node;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        AListNode dummy = new AListNode(0);
        dummy.next = head;
        AListNode pre = dummy;
        AListNode node = new AListNode(val);

        int count = 0;
        while (pre != null) {
            if (count == index) {
                node.next = pre.next;
                pre.next = node;
                if (index == 0) head = pre.next;
            }
            pre = pre.next;
            count++;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        AListNode dummy = new AListNode(0);
        dummy.next = head;
        AListNode pre = dummy;

        int count = 0;
        while (pre != null) {
            if (count == index) {
                pre.next = pre.next.next;
            }
            pre = pre.next;
            count++;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtTail(1);
        list.get(0);
        System.out.println(list.get(0));



//      ["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
//      [[],[1],[3],[1,2],[1],[0],[0]]

//        ["MyLinkedList","addAtIndex","addAtIndex","addAtIndex","get"]
//        [[],[0,10],[0,20],[1,30],[0]]

        //["MyLinkedList","addAtTail","get"]
        //[[],[1],[0]]
    }
}
