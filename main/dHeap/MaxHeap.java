package dHeap;

public class MaxHeap {
    private static int[] array;     // 数组，从下标1开始存储数据 The heap array
    private static int capacity;    // heap可以存储的最大数据个数
    private static int currSize;    // heap中已经存储的数据个数 Number of elements in heap

    public MaxHeap() {}

    public MaxHeap(int capacity) {
        array = new int[capacity + 1];
        this.capacity = capacity;
        currSize = 0;
    }

    public boolean isEmpty() {
        return currSize == 0;
    }

    public int getSize() {
        return currSize;
    }

    public void insert(int num) {
        array[++currSize] = num;
        swiftUp(currSize);
    }

    public int deleteMax() {
        int max = array[1];

        exchange(1, currSize);
        array[currSize--] = 0; // = null
        swiftDown(1);

        return max;
    }

    public int getMax() {
        return array[1];
    }

    private void swiftUp(int currIdx) {
        // parentIdx = currIdx / 2;
        while (currIdx > 1 && isGreaterThanParent(currIdx / 2, currIdx)) {
            exchange(currIdx / 2, currIdx);
            currIdx = currIdx / 2;
        }
    }

    private void swiftDown(int currIdx) {
        while (2 * currIdx <= currSize) {
            int childIdx = 2 * currIdx;
            if (childIdx < currSize && isLessThanChild(childIdx, childIdx + 1)) childIdx++;
            if (!isLessThanChild(currIdx, childIdx)) break;
            exchange(currIdx, childIdx);
            currIdx = childIdx;
        }
    }

    private boolean isGreaterThanParent(int parentIdx, int currIdx) {
        return array[parentIdx] < array[currIdx];
    }

    private boolean isLessThanChild(int currIdx, int childIdx) {
        return array[currIdx] < array[childIdx];
    }

    private void exchange(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
