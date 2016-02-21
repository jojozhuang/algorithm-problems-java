/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

/**
 * Convert Integer A to Integer B.
 * Determine the number of bits required to convert integer A to integer B
 * Example
 * Given n = 31, m = 14,return 2
 * 
 * (31)10=(11111)2
 * 
 * (14)10=(01110)2
 * 
 * @author Johnny
 */
public class FlipBits {
    public static int bitSwapRequired(int a, int b) {
        int count = 0;
        int xor = a ^ b;
        while (xor != 0) {
            ++count;
            xor &= xor - 1;
        }

        return count;
    }
}
