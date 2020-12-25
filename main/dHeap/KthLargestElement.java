package dHeap;


/**
 * 215. Kth Largest Element in an Array
 * */
public class KthLargestElement {
    private static int[] array;
    private static int capacity;
    private static int currSize;

    public static int findKthLargest(int[] nums, int k) {
        capacity = k + 2;
        array = new int[capacity];


        for (int num : nums) {
            insert(num);
        }

        return getMin();
    }

    private static void printCurrArray() {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void insert(int num) {
        array[++currSize] = num;
        swiftUp(currSize);
        if (currSize == (capacity - 1)) deleteMin();
    }

    private static void deleteMin() {
        exchange(1, currSize);
        currSize--;

        array[currSize + 1] = Integer.MAX_VALUE;
        swiftDown(1);

    }

    private static int getMin() {
        return array[1];
    }

    private static void swiftUp(int currIdx) {
        while (currIdx > 1 && isFirstLessThanSecond(currIdx, currIdx / 2)) {
            exchange(currIdx, currIdx / 2);
            currIdx = currIdx / 2;
        }
    }

    private static void swiftDown(int currIdx) {
        while (currIdx * 2 <= currSize) {
            int childIdx = currIdx * 2;
            if (isFirstLessThanSecond(childIdx + 1, childIdx)) childIdx++;
            if (!isFirstLessThanSecond(childIdx, currIdx)) break;
            exchange(currIdx, childIdx);
            currIdx = childIdx;
        }
    }

    private static boolean isFirstLessThanSecond(int first, int second) {
        return array[first] < array[second];
    }

    private static void exchange(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}


/*
3,2,1,5,6,4
    *
         0. 1. 2. 3
array:   0  2. 3  1

currSize 1  2  3
num      3  2  1

        1
      3.  2


// construct a fixed size minHeap
// get min



// insert
// deleteMin
// getMin

// boolean isGreaterThanParent
// boolean isLessThanChild
// exchange

// swiftUp
// swiftDown




*/
