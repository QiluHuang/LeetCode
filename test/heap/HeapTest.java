package heap;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HeapTest {
    private static int[] nums;
    private static int[] insertNums;

    @BeforeClass
    public static void setUp() {
        nums = new int[]{7, 5, 19, 8, 4, 1, 20, 13, 16};
        insertNums = new int[]{13,21,16,24,31,19,68,65,26,32};
    }

    @Test
    public void buildMaxHeap() {
        Heap.maxHeapify(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }

        int[] expected = {20, 16, 19, 13, 4, 1, 7, 5, 8};

        assertArrayEquals(expected, nums);
    }

    @Test
    public void buildMinHeap() {
        Heap.minHeapify(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }

        int[] expected = {1, 4, 7, 8, 5, 19, 20, 13, 16};

        assertArrayEquals(expected, nums);

    }

    @Test
    public void findMinTest() {
        int res = Heap.findMin(nums);

        int expected = 1;

        System.out.println(res);

        assertEquals(expected, res);
    }

    @Test
    public void insertToMinTest() {
        Heap.insertToMinHeap(insertNums, 14);

        int[] expected = new int[]{13,14,16,25,21,19,68,65,26,32,31};

        assertArrayEquals(expected, insertNums);
    }
}
