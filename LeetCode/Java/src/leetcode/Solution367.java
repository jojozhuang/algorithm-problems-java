/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Valid Perfect Square.
 * 
 * Given a positive integer num, write a function which returns True if num is 
 * a perfect square else False.
 * 
 * Note: Do not use any built-in library function such as sqrt.
 * Example 1:
 * Input: 16, Returns: True
 * 
 * Example 2: 
 * Input: 14, Returns: False
 *  
 * @author Johnny
 */
public class Solution367 {
    public boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        
        if (num == 0) {
            return true;
        }
        
        long start = 1;
        long end = num;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long product = mid * mid;
            if (product > num) {
                end = mid - 1;
            } else if (product < num) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        
        return false;
    }
}
