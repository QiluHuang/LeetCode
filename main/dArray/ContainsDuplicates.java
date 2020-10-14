package dArray;

public class ContainsDuplicates {
    // 217. Contains Duplicate


    // 219. Contains Duplicate II
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0, j = i + k; j < nums.length; i++) {
            if (nums[i] == nums[j]) return true;
        }

        return false;
    }

    // Contains Duplicate III
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; (j <= k) && (i + k < nums.length); j++) {
                long abs = Math.abs((long) nums[i] - (long) nums[i + j]);
                if (abs <= t)
                    return true;
            }
        }

        return false;
    }

}
