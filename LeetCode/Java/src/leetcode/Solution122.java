/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Best Time to Buy and Sell Stock II.
 * Say you have an array for which the ith element is the price of a given 
 * stock on day i.
 * 
 * Design an algorithm to find the maximum profit. You may complete as many 
 * transactions as you like (ie, buy one and sell one share of the stock 
 * multiple times). However, you may not engage in multiple transactions at 
 * the same time (ie, you must sell the stock before you buy again).
* 
 * @author Johnny
 */
public class Solution122 {
    public int maxProfit(int[] prices) {
        if (prices==null||prices.length<=1)
            return 0;
        
        int min=0;
        int max=-1;
        int profit=0;
        
         for(int i=1; i<prices.length; i++) {
            if (max==-1) {
                if(prices[i]==prices[min])
                    continue;
                else if (prices[i]<prices[min])
                    min = i;
                else {
                    max = i;
                }
            }
            else {
                if(prices[i]==prices[max])
                    continue;
                else if(prices[i]>prices[max]) {
                    max = i;
                }
                else {
                    profit = profit + prices[max]-prices[min];
                    min = i;
                    max = -1;
                }                
            }            
        }
        
        if (max>-1)
            profit = profit + prices[max]-prices[min];
        return profit;
    }  
}
