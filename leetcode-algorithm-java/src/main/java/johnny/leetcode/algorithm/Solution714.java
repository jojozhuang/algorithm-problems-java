package johnny.leetcode.algorithm;

/**
 * 714. Best Time to Buy and Sell Stock with Transaction Fee
 * Your are given an array of integers prices, for which the i-th element is the price of a given stock on day i; and a non-negative integer fee representing a transaction fee.
 * <p>
 * You may complete as many transactions as you like, but you need to pay the transaction fee for each transaction. You may not buy more than 1 share of a stock at a time (ie. you must sell the stock share before you buy again.)
 * <p>
 * Return the maximum profit you can make.
 * <p>
 * Example 1:
 * Input: prices = [1, 3, 2, 8, 4, 9], fee = 2
 * Output: 8
 * Explanation: The maximum profit can be achieved by:
 * Buying at prices[0] = 1
 * Selling at prices[3] = 8
 * Buying at prices[4] = 4
 * Selling at prices[5] = 9
 * The total profit is ((8 - 1) - 2) + ((9 - 4) - 2) = 8.
 * Note:
 * <pre>{@code
 * 0 < prices.length <= 50000.
 * 0 < prices[i] < 50000.
 * 0 <= fee < 50000.
 * }</pre>
 * @author Johnny
 */
public class Solution714 {
    public int maxProfit(int[] prices, int fee) {
        if (prices.length <= 1) return 0;
        int[] buy = new int[prices.length];
        int[] hold = new int[prices.length];
        int[] skip = new int[prices.length];
        int[] sell = new int[prices.length];
        // the moment we buy a stock, our balance should decrease
        buy[0] = 0 - prices[0];
        // assume if we have stock in the first day, we are still in deficit
        hold[0] = 0 - prices[0];
        for (int i = 1; i < prices.length; i++) {
            // We can only buy on today if we sold stock
            // or skipped with empty portfolio yesterday
            buy[i] = Math.max(skip[i - 1], sell[i - 1]) - prices[i];
            // Can only hold if we bought or already holding stock yesterday
            hold[i] = Math.max(buy[i - 1], hold[i - 1]);
            // Can skip only if we skipped, or sold stock yesterday
            skip[i] = Math.max(skip[i - 1], sell[i - 1]);
            // Can sell only if we bought, or held stock yesterday
            sell[i] = Math.max(buy[i - 1], hold[i - 1]) + prices[i] - fee;
        }
        // Get the max of all the 4 actions on the last day.
        int max = Math.max(buy[prices.length - 1], hold[prices.length - 1]);
        max = Math.max(skip[prices.length - 1], max);
        max = Math.max(sell[prices.length - 1], max);
        return Math.max(max, 0);
    }
}
