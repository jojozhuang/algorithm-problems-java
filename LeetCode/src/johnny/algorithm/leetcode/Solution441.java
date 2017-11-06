/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

/**
 * Arranging Coins
 * 
 * You have a total of n coins that you want to form in a staircase shape, 
 * where every k-th row must have exactly k coins.
 * 
 * Given n, find the total number of full staircase rows that can be formed.
 * 
 * n is a non-negative integer and fits within the range of a 32-bit signed 
 * integer.
 * 
 * Example 1:
 * n = 5
 * 
 * The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤
 * 
 * Because the 3rd row is incomplete, we return 2.
 * 
 * Example 2:
 * 
 * n = 8
 * 
 * The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤ ¤
 * ¤ ¤
 * 
 * Because the 4th row is incomplete, we return 3.
 * 
 * @author Johnny
 */
public class Solution441 {
    public int arrangeCoins(int n) {
        if (n == 0) {
            return 0;
        }
        
        int start = 0;
        int end = n;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            double sum = (0.5 * mid * mid + 0.5 * mid);
            if (sum == n) {
                return mid;
            } else if (sum > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return start - 1; 
    }
}
