package dLinkedList;


class LinkedList {
    int size;
    ListNode dummy;

    /** Initialize your data structure here. */
    public LinkedList() {
        int size = 0;
        dummy = new ListNode(0);
    }

    public int getSize() {
        return this.size;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index >= size) return -1;

        ListNode curr = dummy.next;
        while (index > 0) {
            curr = curr.next;
            index--;
        }
        return curr.val;
    }

    public boolean contains (int val) {
        ListNode curr = dummy;
        while (curr != null) {
            if (curr.val == val) {
                return true;
            }
            curr = curr.next;
        }

        return false;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode next = dummy.next;
        dummy.next = new ListNode(val, next);
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode curr = dummy;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new ListNode(val);
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index == size) {
            addAtTail(val);
            return;
        }

        // find the position
        ListNode curr = dummy;
        while (index > 0) {
            curr = curr.next;
            index--;
        }

        ListNode node = new ListNode(val, curr.next);
        curr.next = node;
        size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index >= size) {
            return;
        }

        ListNode curr = dummy;
        while (index > 0) {
            curr = curr.next;
            index--;
        }
        curr.next = curr.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */