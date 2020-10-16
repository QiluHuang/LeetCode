package dArray;

public class FindDuplicateNumber {
    /**
     * 287. Find the Duplicate Number
     */
    public static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) return Math.abs(nums[i]);
            else nums[index] = - nums[index];
        }

        return -1;
    }
}
