package aBacktracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CombinationArray {
    /**
     * 39. Combination Sum
     */
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        combinationSumHelper(candidates, target, 0, list, subList);
        return list;
    }

    private static void combinationSumHelper(int[] candidates, int target, int index,
                                             List<List<Integer>> list, List<Integer> subList) {
        if (target < 0) return;

        if (target == 0) {
            list.add(new ArrayList(subList));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            int val = candidates[i];
            subList.add(val);
            combinationSumHelper(candidates, target - val, i, list, subList);
            subList.remove(subList.size() - 1);
        }
    }
}
