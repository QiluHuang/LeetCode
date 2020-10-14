package heap;

public class Heap {



    public Heap() {
        
    }

    /** Build Heap */
    public static void maxHeapify(int[] nums) {
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            maxSiftDown(nums, i);
        }
    }

    private static void maxSiftDown(int[] nums, int parentIdx) {
        int childIdx;
        for (; parentIdx * 2 <= nums.length; parentIdx = childIdx) {
            childIdx = parentIdx * 2 + 1;
            if (childIdx + 1 < nums.length && nums[childIdx] < nums[childIdx + 1]) {
                childIdx++;
            }
            if (nums[parentIdx] < nums[childIdx]) {
                int temp = nums[parentIdx];
                nums[parentIdx] = nums[childIdx];
                nums[childIdx] = temp;
            } else {
                break;
            }
        }

    }

    public static void minHeapify(int[] nums) {
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            minSiftDown(nums, i);
        }
    }

    private static void minSiftDown(int[] nums, int parentIdx) {
        int childIdx;
        for ( ;parentIdx * 2 + 1 < nums.length; parentIdx = childIdx) {
            childIdx = parentIdx * 2 + 1;
            if (nums[childIdx] > nums[childIdx + 1]) {
                childIdx++;
            }
            if (nums[childIdx] < nums[parentIdx]) {
                int temp = nums[parentIdx];
                nums[parentIdx] = nums[childIdx];
                nums[childIdx] = temp;
            } else {
                break;
            }
        }
    }

    private static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }





    public static int[] insertToMinHeap(int[] nums, int x) {
        int[] res = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
        res[res.length - 1] = x;

        int childIdx = res.length - 1;
        while ((childIdx - 1) / 2 >= 0) {
            int parentIdx = (childIdx - 1) / 2;
            if (nums[childIdx] < nums[parentIdx]) {
                int temp = nums[childIdx];
                nums[childIdx] = nums[parentIdx];
                nums[parentIdx] = temp;
            } else {
                break;
            }
            childIdx = parentIdx;
        }

        return res;
    }

    public static int findMin(int[] nums) {
        minHeapify(nums);
        return nums[0];
    }

}
