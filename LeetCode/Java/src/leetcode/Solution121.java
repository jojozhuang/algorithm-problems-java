/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
        if (prices==null||prices.length<=1)
            return 0;
        
        int min=0;
        int max=0;
        int newmin=-1;
        int profit=0;
        
        for(int i=1; i<prices.length; i++) {
            if (profit==0)
            {
                if(prices[i]==prices[min])
                    continue;
                else if (prices[i]<prices[min])
                    min = i;
                else {
                    profit = prices[i]-prices[min];
                    max = i;
                }
            }
            else {
                if (newmin==-1) {
                    if(prices[i]==prices[min])
                        continue;
                    else if (prices[i]<prices[min])
                        newmin = i;
                    else {
                       if (prices[i]>prices[max]) {
                            max = i;
                            if (prices[max]-prices[min]>profit) {
                                profit = prices[max]-prices[min];
                            }
                        }
                    }
                }
                else {
                    if(prices[i]==prices[newmin])
                        continue;
                    else if (prices[i]<prices[newmin])
                        newmin = i;
                    else {
                        if (prices[i]-prices[newmin]>profit) {
                            profit =prices[i]-prices[newmin];
                            min = newmin;
                            newmin=-1;
                            max = i;
                        }
                    }
                }                
            }                            
        }
        
        return profit;
    }
}
