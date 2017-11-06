/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

/**
 * Best Time to Buy and Sell Stock.
 * Say you have an array for which the ith element is the price of a given 
 * stock on day i.
 * 
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
        
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            profit = Math.max(profit, prices[i] - minPrice);
            minPrice = Math.min(prices[i], minPrice);
        }
        
        return profit;
    }
}
