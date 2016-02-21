/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Power of Two.
 * Given an integer, write a function to determine if it is a power of two.
 * 
 * @author Johnny
 */
public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }        
        
        return (n &(n - 1)) == 0;
    }
}
