package dArray;

public class RotatedArray {
    // 189. Rotate Array 法一 recursion
    public static void rotateRecursively(int[] nums, int k) {
        if (k == 0) return;

        int len = nums.length;
        int temp = nums[len - 1];
        for (int i = len - 1; i >= 0; i--) {
            if (i == 0) nums[i] = temp;
            else nums[i] = nums[i - 1];
        }

        rotateRecursively(nums, k - 1);
    }

    // 189. Rotate Array 法二 reverse
    public void rotateReversely(int[] nums, int k) {
        k %= nums.length;
        Reversal.reverse(nums, 0, nums.length - 1);
        Reversal.reverse(nums, 0, k - 1);
        Reversal.reverse(nums, k, nums.length - 1);
    }

    /*
     给一串长度为n的数组，看是否由 1, 2, 3, ... n-1 或者 n-1, n-2, n-3, ... ,3, 2, 1 组成
     */
    public static boolean isRotatedArray(int[] nums) {
        // 1. find the shift point == nums.length-1 => cannot find it => false
        int shiftIdx = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (Math.abs(nums[i + 1] - nums[i]) == nums.length - 1) shiftIdx = i;
        }
        if (shiftIdx == -1) return false;

        Reversal.reverse(nums, 0, shiftIdx);
        Reversal.reverse(nums,shiftIdx + 1, nums.length - 1);

        // check
        if (nums[1] - nums[0] > 0) {
            return isAscendingArray(nums);
        } else {
            Reversal.reverse(nums, 0, nums.length - 1);
            return isAscendingArray(nums);
        }
    }

    private static boolean isAscendingArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] != 1) return false;
        }
        return true;
    }
}
