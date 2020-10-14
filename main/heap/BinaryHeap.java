package heap;

public class BinaryHeap {
    private static int[] array;    // 数组，从下标1开始存储数据 The heap array
    private static int capacity;   // heap可以存储的最大数据个数
    private static int currentSize;      // heap中已经存储的数据个数 Number of elements in heap

    public BinaryHeap() {}

    public BinaryHeap(int capacity) {
        array = new int[capacity + 1];
        this.capacity = capacity;
        currentSize = 0;
    }

    public BinaryHeap(int[] nums) {
        currentSize = nums.length;
        array = new int[(currentSize + 2) * 11 / 10];

        int i = 1;
        for (int num : nums) {
            array[i++] = num;
        }

        buildMinHeap();
    }


    public static void buildMinHeap() {
        for (int i = array.length / 2 - 1; i > 0; i--) {
            swiftDown(i);
        }
    }

    public static void swiftDown(int i) {
        int child;
        int tmp = array[i];

        for ( ; i * 2 <= currentSize; i = child) {
            child = i * 2;
            if (child != currentSize && array[child + 1] < array[child]) {
                child ++;
            }
            if (array[child] < tmp) {
                array[i] = array[child];
            } else {
                break;
            }
        }
        
        array[i] = tmp;
    }


    public void insert(int x) {

    }

    // Test
    public static void main(String[] arg) {
        int[] nums = {7, 5, 19, 8, 4, 1, 20, 13, 16};
        BinaryHeap heap = new BinaryHeap(nums);

    }

}
