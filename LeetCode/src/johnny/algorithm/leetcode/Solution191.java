/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

/**
 * Number of 1 Bits.
 * 
 * Write a function that takes an unsigned integer and returns the number of ’1' 
 * bits it has (also known as the Hamming weight).
 * 
 * For example, the 32-bit integer ’11' has binary representation 
 * 00000000000000000000000000001011, so the function should return 3.
* 
 * @author Johnny
 */
public class Solution191 {
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++) {
            if (((n >>> i)&1) == 1) {
                count++;
            }
        }
        
        return count;
    }
    public int hammingWeight2(int n) {
        if (n < 0) {
            return 0;
        }
        
        int count = 0;
        for (int i = 1; i < 33; i++) {
            if (getBit(n, i)) {
                count++;
            }
        }
        return count;
    }
    
    private boolean getBit(int n, int i) {
        return (n & (1 << i)) != 0;
    }
}
