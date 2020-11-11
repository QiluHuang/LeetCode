package aSorting;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SortColorsTest {
    @Test
    public void generalTest() {
        int[] nums = {2,0,1};
        //int[] nums = {2,0,2,1,1,0};
        SortColors.sortColors(nums);
        assertArrayEquals(new int[]{0, 1, 2},nums);
    }
}
