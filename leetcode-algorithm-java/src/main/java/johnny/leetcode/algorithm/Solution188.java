package johnny.leetcode.algorithm;

/**
 * Best Time to Buy and Sell Stock IV.
 * Say you have an array for which the ith element is the price of a given
 * stock on day i.
 * <p>
 * Design an algorithm to find the maximum profit. You may complete at most k
 * transactions.
 * <p>
 * Note:
 * You may not engage in multiple transactions at the same time (ie, you must
 * sell the stock before you buy again).
 *
 * @author Johnny
 */
public class Solution188 {
    public int maxProfit(int k, int[] prices) {
        if (prices == null || prices.length == 0 || k <= 0) {
            return 0;
        }
        int len = prices.length;
        if (k >= len / 2) return quickSolve(prices);

        int[][] t = new int[k + 1][len];
        for (int i = 1; i <= k; i++) {
            int tmpMax = -prices[0];
            for (int j = 1; j < len; j++) {
                t[i][j] = Math.max(t[i][j - 1], prices[j] + tmpMax);
                tmpMax = Math.max(tmpMax, t[i - 1][j - 1] - prices[j]);
            }
        }
        return t[k][len - 1];
    }


    private int quickSolve(int[] prices) {
        int len = prices.length, profit = 0;
        for (int i = 1; i < len; i++)
            // as long as there is a price gap, we gain a profit.
            if (prices[i] > prices[i - 1]) profit += prices[i] - prices[i - 1];
        return profit;
    }

    public int maxProfit2(int k, int[] prices) {
        if (prices == null || prices.length == 0 || k <= 0) {
            return 0;
        }

        int n = prices.length;
        if (k > n / 2) {
            int profit = 0;
            for (int i = 1; i < n; i++) {
                int diff = prices[i] - prices[i - 1];
                if (diff > 0) {
                    profit += diff;
                }
            }
            return profit;
        }

        int[][] f = new int[n + 1][k + 1];
        for (int j = 1; j <= k; j++) {
            for (int i = 1; i <= n; i++) {
                for (int x = 0; x <= i; x++) {
                    f[i][j] = Math.max(f[i][j], f[x][j - 1] + profit(prices, x + 1, i));
                }
            }
        }

        return f[n][k];
    }

    private int profit(int[] prices, int start, int end) {
        if (start >= end) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = start - 1; i < end; i++) {
            profit = Math.max(profit, prices[i] - minPrice);
            minPrice = Math.min(prices[i], minPrice);
        }

        return profit;
    }
}
