package aBacktracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    // 46. Permutations
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        int[] visited = new int[nums.length];

        permuteBacktrack(nums, visited, list, subList);

        return list;
    }

    // 0: unvisited; 1: visited
    private static void permuteBacktrack(int[] nums, int[] visited, List<List<Integer>> list, List<Integer> subList) {
        if (subList.size() == nums.length) {
            list.add(new ArrayList(subList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                subList.add(nums[i]);

                permuteBacktrack(nums, visited, list, subList);

                subList.remove(subList.size() - 1);
                visited[i] = 0;
            }
        }
    }
}
