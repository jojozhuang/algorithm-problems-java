/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode;

/**
 * Divide Two Integers.
 * @author Johnny
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        // Write your code here
        if (dividend == 0 || divisor == 0) {
            return 0;
        }
        
        if (divisor == 1) {
            return dividend;
        } else if (divisor == -1) {
            if (dividend == Integer.MIN_VALUE) {
                return Integer.MAX_VALUE;
            } else {
                return -dividend;
            }
        }
        
        int negative = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        long absdividend = Math.abs((long)dividend);
        long absdivisor = Math.abs((long)divisor);
        long res = 0;
        int i = 0;
        
        while (absdividend >= absdivisor) {
            i = 0;
            long curr = absdivisor;
            while (curr <= absdividend) {
                curr = curr << 1;
                i++;
            }
            res += 1 << (i - 1);
            absdividend -= absdivisor << (i - 1);
        }
        return (int)res * negative;
    }
}
