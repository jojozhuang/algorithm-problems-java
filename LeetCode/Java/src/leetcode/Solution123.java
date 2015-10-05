/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

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
        if (prices==null||prices.length<=1)
            return 0;
        
        int min=0;
        int max=-1;
        ArrayList<Integer> profits = new ArrayList<Integer>();

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
                    profits.add(prices[max]-prices[min]);
                    min = i;
                    max = -1;
                }                
            }            
        }
        
        if (max>-1)
            profits.add(prices[max]-prices[min]);
        
        //find the largest two
        int[] nums = new int[profits.size()];
        int i =0;
        for(Integer num: profits) {
            nums[i] = num;
            i++;
        }
        
        Arrays.sort(nums);
        if (nums.length==0)
            return 0;
        else if (nums.length==1)
            return nums[nums.length-1];
        else
            return nums[nums.length-1] +  nums[nums.length-2];
    }
}
