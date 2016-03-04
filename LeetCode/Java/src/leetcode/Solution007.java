/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Reverse Integer.
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * 
 * int: [-2147483648, 2147483647]
 * 
 * @author Johnny
 */
public class Solution007 {
    public int reverse(int x) {
        long ret = 0;
        while (x != 0) {
            ret = ret * 10 + x % 10;
            x = x / 10;
        }
        
        if (ret < Integer.MIN_VALUE || ret > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)ret;
        }
    }
    private int reverse2(int x) {
        boolean negtive = false;
        
        long xClone = x;
        if (xClone < 0)
        {
            negtive = true;
            xClone = Math.negateExact(xClone);
        }
        char[] original = String.valueOf(xClone).toCharArray();
        char[] reversed = new char[original.length];
        for(int i = original.length-1; i >= 0; i--)
            reversed[original.length-i-1] = original[i];
        
        long longReversed = Long.parseLong(String.valueOf(reversed));
        if (!negtive) {
            if (longReversed > Math.pow(2, 31) - 1)
                return 0;
            else
                return Integer.parseInt(String.valueOf(longReversed));
        }
        else {
            if (longReversed > Math.pow(2, 31))
                return 0;
            else
                return Math.negateExact(Integer.parseInt(String.valueOf(longReversed)));
        }
    }
}
