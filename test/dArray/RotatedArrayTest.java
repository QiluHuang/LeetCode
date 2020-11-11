package dArray;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class RotatedArrayTest {
    @Test
    public void rotateTest() {
        int[] nums = {1,2,3,4,5,6,7};
        RotatedArray.rotateRecursively(nums, 3);
        int[] expect = {5,6,7,1,2,3,4};
        assertEquals(Arrays.toString(expect),Arrays.toString(nums));
    }

    @Test
    public void isRotatedArrayTest() {
        int[] nums = {3,2,0,1};
        boolean res = RotatedArray.isRotatedArray(nums);
        assertEquals(false, res);
    }
}
