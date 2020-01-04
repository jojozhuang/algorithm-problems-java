package johnny.leetcode.algorithm;

/**
 * Best Time to Buy and Sell Stock.
 * Say you have an array for which the ith element is the price of a given
 * stock on day i.
 * <p>
 * If you were only permitted to complete at most one transaction (ie, buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 *
 * @author Johnny
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int hold1 = Integer.MIN_VALUE;
        int release1 = 0;
        for (int i : prices) {                              // Assume we only have 0 money at first
            release1 = Math.max(release1, hold1 + i);     // The maximum if we've just sold 1nd stock so far.
            hold1 = Math.max(hold1, -i);          // The maximum if we've just buy  1st stock so far.
        }
        return release1; ///Since release1 is initiated as 0, so release2 will always higher than release1.
    }

    public int maxProfit2(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            profit = Math.max(profit, prices[i] - minPrice);
            minPrice = Math.min(prices[i], minPrice);
        }

        return profit;
    }
}
