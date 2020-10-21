package aBacktracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Combination {
    /**
     * 77. Combinations
     **/
    public static List<List<Integer>> combine(int n, int k) {
        List<Integer> subList = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        combineBacktrack(nums, k, 0, subList, list);

        return list;

    }

    private static void combineBacktrack(int[] nums, int k, int index,
                                  List<Integer> subList, List<List<Integer>> list) {
        if (k == 0) {
            list.add(new ArrayList(subList));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            subList.add(nums[i]);
            combineBacktrack(nums, k - 1, i + 1, subList, list);
            subList.remove(subList.size() - 1);
        }
    }



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




    /**
     * 17. Letter Combinations of a Phone Number
     **/
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.length() == 0) return list;

        Map<Character, String> map = constructMap();
        StringBuilder builder = new StringBuilder();

        backtrack(0, digits, map, list, builder);

        return list;
    }

    private static void backtrack(int index, String digits, Map<Character, String> map, List<String> list, StringBuilder builder) {
        if (index == digits.length()) {
            list.add(builder.toString());
            return;
        }

        char c = digits.charAt(index);
        String str = map.get(c);
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            builder.append(str.charAt(i));
            backtrack(index + 1, digits, map, list, builder);
            builder.deleteCharAt(builder.length() - 1);
        }
    }

    private static Map<Character, String> constructMap() {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        return map;
    }
}
