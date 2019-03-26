package johnny.algorithm.leetcode;

/**
 * Best Time to Buy and Sell Stock III.
 * Say you have an array for which the ith element is the price of a given 
 * stock on day i.
 * 
 * Design an algorithm to find the maximum profit. You may complete at most 
 * two transactions.
 * 
 * Note:
 * You may not engage in multiple transactions at the same time (ie, you must
 * sell the stock before you buy again).
 * 
 * @author Johnny
 */
public class Solution123 {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int K = 2; // number of max transaction allowed
        int maxProf = 0;
        int[][] dp = new int[K + 1][prices.length];
        for (int i = 1; i <= K; i++) {
            int tmpMax = dp[i - 1][0] - prices[0];
            for (int j = 1; j < prices.length; j++) {
                dp[i][j] = Math.max(dp[i][j-1], prices[j] + tmpMax);
                tmpMax = Math.max(tmpMax, dp[i-1][j] - prices[j]);
                maxProf = Math.max(dp[i][j], maxProf);
            }
        }
        return maxProf;
    }
    public int maxProfit2(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int hold1 = Integer.MIN_VALUE, hold2 = Integer.MIN_VALUE, release1 = Integer.MIN_VALUE, release2 = Integer.MIN_VALUE;
        for (int i:prices){
            hold1 = Math.max(hold1, -i);
            release1 = Math.max(release1, hold1+i);
            hold2 = Math.max(hold2, release1-i);
            release2 = Math.max(release2, hold2+i);
        }
        return release2;
    }
    //http://www.programcreek.com/2014/02/leetcode-best-time-to-buy-and-sell-stock-iii-java/
    public int maxProfit3(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        
        // divide into two parts
        // front part
        int[] frontProfits = new int[prices.length];
        int valley = prices[0];
        for (int i = 1; i < prices.length; i++) {
            frontProfits[i] = Math.max(frontProfits[i - 1], prices[i] - valley);
            valley = Math.min(prices[i], valley);
        }
        // back part
        int[] endProfits = new int[prices.length];
        int peek = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            endProfits[i] = Math.max(endProfits[i + 1], peek - prices[i]);
            peek = Math.max(prices[i], peek);
        }
        // cal
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            profit = Math.max(profit, frontProfits[i] + endProfits[i]);
        }
        return profit;
    }
    
    /*
    // time out
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        
        int profit = helper(prices);
        if (prices.length <= 3) {
            return profit;
        }
        
        // divide prices to two parts        
        for (int i = 0; i < prices.length - 1; i++) {
            profit = Math.max(profit, helper(Arrays.copyOfRange(prices, 0, i + 1)) + helper(Arrays.copyOfRange(prices, i + 1, prices.length)));
        }
        return profit;
    }
    
    private int helper(int[] prices) {
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
    }*/
}
