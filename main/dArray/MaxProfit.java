package dArray;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = 0;

        for (int sell = 1; sell < prices.length; sell++) {
            if (prices[sell] > prices[buy]) maxProfit = Math.max(maxProfit, prices[sell] - prices[buy]);
            if (prices[sell] < prices[buy] && sell - buy != 1) {
                buy++;
                maxProfit = Math.max(maxProfit, prices[sell] - prices[buy]);
            }
        }

        return maxProfit;
    }
}
