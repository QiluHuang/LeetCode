package dQueue;


/**
 * 622. Design Circular Queue
 * */
class MyCircularQueue {
    int[] arr;
    int startIdx;
    int size;
    int currSize;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.arr = new int[k];
        this.size = k;
        this.currSize = 0;
        this.startIdx = 0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (currSize >= size) return false;

        int endIdx = (startIdx + currSize) % size;
        arr[endIdx] = value;
        currSize++;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (currSize < 1) return false;

        startIdx = (startIdx + 1) % size;
        currSize--;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (currSize < 1) return -1;

        return arr[startIdx];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (currSize < 1) return -1;

        int endIdx = (startIdx + currSize - 1) % size;
        return arr[endIdx];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return currSize == 0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return currSize == size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */