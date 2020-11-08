package aSlidingWindow;

/*
    Given an array of integers of size ¡®n¡¯.
    Our aim is to calculate the maximum sum of ¡®k¡¯
    consecutive elements in the array.

    Input  : arr[] = {100, 200, 300, 400}
             k = 2
    Output : 700

    Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}
             k = 4
    Output : 39
    We get maximum sum by adding subarray {4, 2, 10, 23}
    of size 4.

    Input  : arr[] = {2, 3}
             k = 3
    Output : Invalid
    There is no subarray of size 3 as size of whole
    array is 2.
 */

public class MaxSum {
    // Method 1 : Brute Force
    public static int getMaxSumBruteForce(int[] nums, int k) {
        if (k > nums.length) return -1;
        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < nums.length - k + 1; start++) {
            int sum = 0;
            for (int i = start; i < start + k; i++) {
                sum += nums[i];
            }
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
}
