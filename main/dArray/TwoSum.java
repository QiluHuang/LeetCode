package dArray;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    /**
     * easy的 array summation，给两个array，第一个array两个数和可以在第二个数列找到，为true
     * Given an array of inputs and an array of summation results. return if the sum of any two inputs exists in the summation result array.
     * */
    public static boolean findTwoSum(int[] srcArr, int[] dstArr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < srcArr.length; i++) {
            for (int j = i + 1; j < srcArr.length; j++) {
                int num = srcArr[i] + srcArr[j];
                if (!list.contains(num)) list.add(num);
            }
        }

        for (int i = 0; i < dstArr.length; i++) {
            if (list.contains(dstArr[i])) return true;
        }

        return false;
    }

    public static boolean arraySum(List<Integer> inputs, List<Integer> tests) {
        for (Integer sum : tests) {
            for (Integer num : inputs) {
                if (inputs.contains(sum - num)) return true;
            }
        }

        return false;
    }
}
