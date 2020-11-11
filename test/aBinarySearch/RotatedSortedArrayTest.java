package aBinarySearch;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RotatedSortedArrayTest {
    @Test
    public void findMinTest() {
        int[] nums = {1,2,3};
        int res = RotatedSortedArray.findMin(nums);
        assertEquals(1, res);
    }
}
