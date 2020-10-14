package aTwoPointers;

import java.util.Arrays;

public class TwoSum {
    /** Two Sum - Less than or equal to target */
    public static int twoSumLessThanOrEqualTo(int[] nums, int target) {
        if (nums.length < 2) return 0;
        int res = 0;
        int left = 0, right = nums.length - 1;

        Arrays.sort(nums);

        while (left < right) {
            if (nums[left] + nums[right] <= target) {
                res += right - left;
                left++;
            } else {
                right--;
            }
        }
        return res;
    }

    /** Two Sum - Greater than target */
    public static int twoSumGreaterThan(int[] nums, int target) {
        if (nums.length < 2) return 0;
        int res = 0;
        int left = 0, right = nums.length - 1;

        Arrays.sort(nums);

        while (left < right) {
            if (nums[left] + nums[right] > target) {
                res += right - left;
                right--;
            } else {
                left++;
            }
        }

        return res;
    }

    /** Two Sum - Closest to target */
    public static int[] twoSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int largeSum = 0, smallSum = 0;
        int[] largeNum = new int[2];
        int[] smallNum = new int[2];
        int left = 0, right = nums.length - 1;

        while (left < right) {
            if (nums[left] + nums[right] > target) {
                largeSum = nums[left] + nums[right];
                largeNum = new int[]{nums[left], nums[right]};
                right--;
            } else {
                smallSum = nums[left] + nums[right];
                smallNum = new int[]{nums[left], nums[right]};
                left++;
            }
        }

        return Math.abs(largeSum - target) > Math.abs(smallSum - target) ? smallNum : largeNum;
    }

    /** Two Sum - Difference equals to target */
//    public static int[] twoSumDifference(int [] nums, int target) {
//
//    }
}
