package aBacktracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationInt {
    /**
     * 77. Combinations
     **/
    public static List<List<Integer>> combine(int n, int k) {
        List<Integer> subList = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();

        combinebacktrack(1, n, k, subList, list);

        return list;
    }

    private static void combinebacktrack(int start, int num, int count, List<Integer> subList, List<List<Integer>> list) {
        if (count == 0) {
            list.add(new ArrayList(subList));
            return;
        }

        for (int i = start; i <= num; i++) {
            subList.add(i);
            combinebacktrack(i + 1, num, count - 1, subList, list);
            subList.remove(subList.size() - 1);
        }
    }

    /**
     * 254 Factor Combinations
     **/
    public static List<List<Integer>> getFactors(int n) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();

        getFactorsBacktrack(n, n - 1, list, subList);

        return list;
    }

    private static  void getFactorsBacktrack(int num, int factor, List<List<Integer>> list, List<Integer> subList) {
        if (num == 1) {
            if(subList.size() > 1) list.add(new ArrayList(subList));
            return;
        }


        for (int i = factor; i > 1; i--) {
            if (num % i == 0) {
                subList.add(i);
                getFactorsBacktrack(num/i, i, list, subList);
                subList.remove(subList.size() - 1);
            }
        }

    }

}
