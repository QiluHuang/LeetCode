package aBinarySearch;

public class MySqrt {
    public static int sqrtWithoutUsingSqrt(int n ) {
        int low  = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                low = mid + 1;
            } else if (mid * mid > n) {
                high = mid - 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        System.out.println(sqrtWithoutUsingSqrt(17));
    }
}
