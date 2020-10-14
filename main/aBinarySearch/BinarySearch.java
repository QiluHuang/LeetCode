package aBinarySearch;

public class BinarySearch {
    /** 704 Binary Search */
    public static int search(int[] nums, int target) {
        int res = -1;

        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + ((right - left) >> 2);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }

        return res;
    }


    /** 167. Two Sum II - Input array is sorted */
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int low = i + 1;
            int high = numbers.length - 1;

            while (low < high) {
                int mid = low + ((high - low) >> 1);
                if (numbers[i] + numbers[mid] == target) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[i] + numbers[mid] > target) {
                    high = mid;
                } else {
                    low = mid;
                }
            }
        }
        return new int[]{-1, -1};
    }

}
