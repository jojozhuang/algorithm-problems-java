/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Sum of Two Integers.
 * Calculate the sum of two integers a and b, but you are not allowed to use 
 * the operator + and -.
 * 
 * Example:
 * Given a = 1 and b = 2, return 3.
 *  
 * @author Johnny
 */
public class Solution371 {
    //http://www.cnblogs.com/grandyang/p/5631814.html
    //http://www.cnblogs.com/grandyang/p/5451942.html
    public int getSum(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return getSum(sum, carry);
    }
}
