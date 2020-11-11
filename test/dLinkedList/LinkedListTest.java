package dLinkedList;

import org.junit.Test;

public class LinkedListTest {
    @Test
    public void generalTest() {
        LinkedList list = new LinkedList();
        list.addAtHead(7);
        System.out.println("index 0: " + list.get(0)); //7

        list.addAtHead(2);
        System.out.println("index 0: " + list.get(0)); //2

        list.addAtHead(1);
        System.out.println("index 0: " + list.get(0)); //1

        System.out.println("Does this linked list has value 2:" + list.contains(2)); //true

        list.addAtIndex(3, 0);
        System.out.println("index 3: " + list.get(3)); //0

        list.deleteAtIndex(2);
        list.addAtHead(6);
        list.addAtTail(4);
        // list.get(4);
        System.out.println("index 4: " + list.get(4)); //4
    }
}


//["MyLinkedList","addAtHead","addAtHead","addAtHead",       [],[7],[2],[1]
// "addAtIndex","deleteAtIndex","addAtHead","addAtTail",     [3,0],[2],[6],[4]
// "get","addAtHead","addAtIndex","addAtHead"]<br/>          [4],[4],[5,0],[6]
