package aDynamicProgramming;

public class ClimbingStairs {
    /**
     * 70 Climbing Stairs
     * */
    public static int climbStairs(int n) {
        if (n <= 1) return 1;

        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n - 1];
    }

    /**
     * 746 Min Cost Climbing Stairs
     * */
    public static int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 0) return 0;
        else if (cost.length == 1) return cost[0];

        int len = cost.length;
        int[] dp = new int[len];
        dp[0] = cost[0];
        dp[1] = cost[1];

        int i = 2;
        while (len > 2 && i < len) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
            i++;
        }

        return Math.min(dp[len - 1], dp[len - 2]);
    }
}
