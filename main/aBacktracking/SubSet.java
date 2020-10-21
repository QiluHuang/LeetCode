package aBacktracking;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> subList = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i <= nums.length; i++) {
            backtrack(nums, 0, i, subList, list);
        }

        return list;
    }

    private static void backtrack(int[] nums, int index, int count,
                           List<Integer> subList, List<List<Integer>> list) {
        if (subList.size() == count) {
            list.add(new ArrayList(subList));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            subList.add(nums[i]);
            backtrack(nums, i + 1, count, subList, list);
            subList.remove(subList.size() - 1);
        }
    }
}
