package oaSnowflake;

import java.util.List;

public class ADiskSpaceAnalysis {
    /**
     *
     * @param x the length of analysis segments
     * @param space
     * @return
     */
    public static int segment(int x, List<Integer> space) {
        return 0;
    }

    // Method 1 : Brute Force
    public static int segmentBruteForce(int x, List<Integer> space) {
        int max = Integer.MIN_VALUE;

        int start = 0;
        while(start  < space.size() - x + 1) {
            int end = start + x - 1;
            max = Math.max(max, findMin(space, start, end));
            start++;
        }

        return max;
    }

    private static int findMin(List<Integer> space, int start, int end) {
        int min = Integer.MAX_VALUE;

        for (int i = start; i <= end; i++) {
            min = Math.min(min, space.get(i));
        }

        return min;
    }
}
