package dArray;

public class NonDecreasingArray {
    public static boolean checkPossibility(int[] nums) {
        int count = 1;
        int i = 2;


        // corner case
        if (nums.length == 2 || nums.length == 1) return true;
        if (nums[2] < nums[1] && nums[1] < nums[0]) return false;
        if (nums[0] > nums[1]) {
            count--;
            nums[1] = nums[0];
        }

        while (i < nums.length && count >= 0) {
            if (nums[i - 1] > nums[i]) {
                if (nums[i - 2] < nums[i]) nums[i - 1] = nums[i];
                else if (nums[i - 2] >  nums[i]) nums[i] = nums[i - 1];
                count--;
            }
            i++;
        }

        if (i != nums.length || count < 0) return false;

        else return true;
    }
}
