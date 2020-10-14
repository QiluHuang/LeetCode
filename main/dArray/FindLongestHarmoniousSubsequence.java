package dArray;

import java.util.HashMap;
import java.util.Map;

public class FindLongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            int x = 0;
            int y = 0;
            if (map.containsKey(nums[i] - 1)) x = map.get(nums[i] - 1);
            if (map.containsKey(nums[i] + 1)) y = map.get(nums[i] + 1);
            if (map.containsKey(nums[i])) {
                count = map.get(nums[i]) + count;
            }
            map.put(nums[i], count);

            res = Math.max(x + count, y + count);
        }

        return res;
    }
}
