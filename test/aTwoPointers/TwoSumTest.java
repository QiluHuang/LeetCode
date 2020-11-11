package aTwoPointers;

import aTwoPointers.TwoSum;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {
    @Test
    public void lessThanOrEqualToTest() {
        //int[] nums = {3, 1, 19, 10, 5, 8, 6};  // 1, 3, 5, 6, 8, 10, 19  res = 6
        int[] nums = {2};

        int res = TwoSum.twoSumLessThanOrEqualTo(nums, 10);
        assertEquals(0, res);
    }

    @Test
    public void GreaterThanTest() {
        int[] nums = {3, 1, 19, 10, 5, 8, 6};  // 1, 3, 5, 6, 8, 10, 19  res = 6

        int res = TwoSum.twoSumGreaterThan(nums, 16);
        assertEquals(7, res);
    }

    @Test
    public void CloestTest() {
        int[] nums = {1, 2, 3, 4, 5};
        int[] res = TwoSum.twoSumClosest(nums, 10);
        assertArrayEquals(new int[]{4,5}, res);
    }
}
