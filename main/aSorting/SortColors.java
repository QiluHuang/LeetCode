package aSorting;

public class SortColors {
    public static void sortColors(int[] nums) {
        int p0 = 0, p2 = nums.length - 1;
        int curr = 0;

        while (curr <= p2) {
            if (nums[curr] == 0) {
                swap(nums, curr, p0);
                curr++;
                p0++;
            } else if (nums[curr] == 1) {
                curr++;
            } else if (nums[curr] == 2) {
                swap(nums, curr, p2);
                p2--;
            }
        }
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
