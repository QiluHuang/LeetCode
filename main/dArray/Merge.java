package dArray;

public class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m - 1, y = n - 1, i = m + n - 1;

        while (i >= 0) {
            if (nums1[x] >= nums2[y]) {
                nums1[i] = nums1[x--];
            } else if (nums1[x] < nums2[y] ) {
                nums1[i] = nums2[y--];
            }
            i--;

            if (y < 0) break;
        }
    }
}
