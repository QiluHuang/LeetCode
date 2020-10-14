package aBinarySearch;

public class CapacityToShipPackagesWithinDDays {
    public static int shipWithinDays(int[] weights, int D) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < weights.length; i++) {
            right += weights[i];
            left = Math.max(left, weights[i]);
            System.out.println("arr:" + right);
        }

        int mid = right;
//        System.out.println("left " + left + " right " + right);
        while (left < right) {
            mid = left + (right - left) / 2;
            int days = calShippedDay(weights, mid);
            System.out.println("cap: " + mid + " " + "days:" + days);
            if (days == D) {
                return mid;
            } else if (days > D) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return mid;
    }

    private static int calShippedDay(int[] weights, int capacity) {
        int sum = 0;
        int days = 0;
        for (int i = 0; i < weights.length; i++) {
            if (sum + weights[i] > capacity) {
                sum = weights[i];
                days++;
            } else {
                sum += weights[i];
            }
        }
        return days + (capacity > 0 ? 1 : 0);
    }
}
