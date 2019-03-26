package johnny.algorithm.leetcode;

/**
 * Best Time to Buy and Sell Stock with Cooldown.
 * 
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * 
 * Design an algorithm to find the maximum profit. You may complete as many 
 * transactions as you like (ie, buy one and sell one share of the stock multiple
 * times) with the following restrictions:
 * 
 * You may not engage in multiple transactions at the same time (ie, you must 
 * sell the stock before you buy again).
 * After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
 * 
 * Example:
 * 
 * prices = [1, 2, 3, 0, 2]
 * maxProfit = 3
 * transactions = [buy, sell, cooldown, buy, sell]
 *  
 * @author Johnny
 */
public class Solution309 {
    // optimized dp
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int hold = Integer.MIN_VALUE; // can't sell until hold is valid(sell after buy)
        int sold = 0;
        int cooldown = 0;
        for (int i = 0; i < n; i++) {
            int old_sold = sold;
            sold = hold+ prices[i];
            hold = Math.max(hold, cooldown - prices[i]);
            cooldown = Math.max(old_sold, cooldown);
        }
        
        return Math.max(sold, cooldown);
    }
    // dp
    public int maxProfit2(int[] prices) {
        int n = prices.length;
        int[] hold = new int[n + 1];
        int[] sold = new int[n + 1];
        int[] cooldown = new int[n + 1];
        hold[0] = Integer.MIN_VALUE; // can't sell until hold is valid(sell after buy)
        sold[0] = 0;
        cooldown[0] = 0;
        for (int i = 1; i <= n; i++) {
            hold[i] = Math.max(hold[i - 1], cooldown[i - 1] - prices[i - 1]); 
            sold[i] = hold[i - 1] + prices[i - 1];
            cooldown[i] = Math.max(sold[i - 1], cooldown[i - 1]);
        }
        
        return Math.max(sold[n], cooldown[n]);
    }
    
    public int maxProfit3(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
         
        int n = prices.length;
        int[] buy = new int[n];
        int[] sell = new int[n];
        buy[0] = -prices[0];
        buy[1] = Math.max(-prices[0], -prices[1]);
        sell[0] = 0;
        sell[1] = Math.max(0, prices[1] - prices[0]);
        for (int i = 2; i < n; i++) {
            buy[i] = Math.max(buy[i - 1], sell[i - 2] - prices[i]);   
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
        }
        
        return sell[n - 1];
    }
}
