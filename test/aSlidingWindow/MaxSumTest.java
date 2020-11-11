package aSlidingWindow;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumTest {
    @Test
    public void bruteForceTest() {
        int[] nums1 = {1, 4, 2, 10, 23, 3, 1, 0, 20}; // k 4, output 39
        int[] nums2 = {2, 3}; // k 3 output -1
        int[] nums3 = {100, 200, 300, 400};  // k 2, output 700

        assertEquals(39, MaxSum.getMaxSumBruteForce(nums1, 4));
        assertEquals(-1, MaxSum.getMaxSumBruteForce(nums2, 3));
        assertEquals(700, MaxSum.getMaxSumBruteForce(nums3, 2));

    }
}