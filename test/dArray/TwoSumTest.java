package dArray;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {
    @Test
    public void findTwoSumTest() {
//        int[] srcArr = {-1, 8, 3};
//        int[] dstArr = {3, 7, 2};
//        boolean res = TwoSum.findTwoSum(srcArr, dstArr);
//        assertEquals(true, res);


        int[] srcArr = {9, 6, 12};
        int[] dstArr = {1, 2, 3};
        boolean res = TwoSum.findTwoSum(srcArr, dstArr);
        assertEquals(false, res);
    }

    @Test
    public void arraySumTest() {
        List<Integer> inputs = Arrays.asList(-1, 8, 3);
        List<Integer> tests = Arrays.asList(3, 7, 2);
        assertEquals(true, TwoSum.arraySum(inputs, tests));
    }
}
