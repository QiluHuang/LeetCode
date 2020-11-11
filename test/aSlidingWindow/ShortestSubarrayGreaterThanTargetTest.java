package aSlidingWindow;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShortestSubarrayGreaterThanTargetTest {
    @Test
    public void generalTest() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        assertEquals(2, ShortestSubarrayGreaterThanTarget.getShortestLen(nums, 7));
    }
}