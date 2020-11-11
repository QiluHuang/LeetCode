package dQueue;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyCircularQueueTest {
    @Test
    public void myCircularQueueTest() {
        /*
        ["MyCircularQueue","enQueue","enQueue","enQueue","enQueue","Rear","isFull","deQueue","enQueue","Rear"]
        [[3],[1],[2],[3],[4],[],[],[],[4],[]]
         */
        MyCircularQueue queue = new MyCircularQueue(3);
        assertEquals(true, queue.enQueue(1));
        assertEquals(true, queue.enQueue(2));
        assertEquals(true, queue.enQueue(3));
        assertEquals(false, queue.enQueue(4));
        assertEquals(3, queue.Rear());
        assertEquals(true, queue.isFull());
        assertEquals(true, queue.deQueue());
        assertEquals(true, queue.enQueue(4));
        assertEquals(4, queue.Rear());
    }

    @Test
    public void test2() {
        /*
        ["MyCircularQueue","enQueue","enQueue","enQueue","enQueue","Rear","isFull","deQueue","enQueue","Rear"]
        [[3],[1],[2],[3],[4],[],[],[],[4],[]]
         */
        MyCircularQueue queue = new MyCircularQueue(8);
        assertEquals(true, queue.enQueue(3));
        assertEquals(true, queue.enQueue(9));
        assertEquals(true, queue.enQueue(5));
        assertEquals(true, queue.enQueue(0));
        assertEquals(false, queue.isEmpty());
        assertEquals(false, queue.isEmpty());
        assertEquals(true, queue.deQueue());
        assertEquals(true, queue.deQueue());
        assertEquals(0, queue.Rear());
        assertEquals(0, queue.Rear());
    }
}