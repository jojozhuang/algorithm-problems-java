/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.Arrays;

/**
 * Candy.
 * There are N children standing in a line. Each child is assigned a rating value.
 * 
 * You are giving candies to these children subjected to the following requirements:
 * 
 * Each child must have at least one candy.
 * Children with a higher rating get more candies than their neighbors.
 * What is the minimum candies you must give?
 * 
 * @author Johnny
 */
public class Solution135 {
    //https://discuss.leetcode.com/topic/5243/a-simple-solution
     public int candy(int[] ratings) {
        if (ratings == null) {
            return 0;
        }
        
        int n = ratings.length;
	if(n <= 1) {
            return n;
        }
        
        int[] candies = new int[n];
        Arrays.fill(candies, 1);
        
        for (int i = 1; i < n; i++) {
            if(ratings[i] > ratings[i-1]) {
                candies[i] = candies[i - 1] + 1;
            }                    
        }
        
        for (int i = n - 1; i > 0 ; i--) {
            if(ratings[i - 1] > ratings[i]) {
                candies[i - 1] = Math.max(candies[i] + 1, candies[i - 1]);
            }
        }
        
        int result=0;
        for (int i = 0; i < n; i++) {
            result += candies[i];               
        }
        return result;
    }
     
    //http://www.programcreek.com/2014/03/leetcode-candy-java/
    public int candy2(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return 0;
        }

        int[] candies = new int[ratings.length];
        candies[0] = 1;

        //from let to right
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            } else { 
                // if not ascending, assign 1
                candies[i] = 1;
            }
        }

        int result = candies[ratings.length - 1];

        //from right to left
        for (int i = ratings.length - 2; i >= 0; i--) {
            int cur = 1;
            if (ratings[i] > ratings[i + 1]) {
                cur = candies[i + 1] + 1;
            }

            result += Math.max(cur, candies[i]);
            candies[i] = cur;
        }

        return result;
    }
}
