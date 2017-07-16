/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

/**
 * Swap Bits
 * 
 * Write a program to swap odd and even bits in an integer with as few 
 * instructions as possible (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3
 * are swapped, and so on).
 * 
 * Example
 * 5 = (101)2 => (1010)2 = 10
 * 
 * @author Johnny
 */
public class SwapBits {
    public int swapOddEvenBits(int x) {
        int len = 0;
        int num = x;
        int res = 0;
        int odd = 0;
        int even = 0;
        while (len < 32) {
            odd = num & 1;
            num = num >> 1;
            even = num & 1;
            num = num >> 1;
            res += even << len;
            res += odd << len + 1;
            len = len+2;
        }
        
        return res;
    }
}
