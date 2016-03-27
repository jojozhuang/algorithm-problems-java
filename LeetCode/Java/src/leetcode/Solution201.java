/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Bitwise AND of Numbers Range.
 * 
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise
 * AND of all numbers in this range, inclusive.
 * 
 * For example, given the range [5, 7], you should return 4.
 *  
 * @author Johnny
 */
public class Solution201 {
    //http://www.cnblogs.com/grandyang/p/4431646.html
    public int rangeBitwiseAnd(int m, int n) {
        int i = 0;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            ++i;
        }
        return (m << i);
    }
}
