/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Divide Two Integers.
 * Divide two integers without using multiplication, division and mod operator.
 * 
 * If it is overflow, return MAX_INT.
 * 
 * @author Johnny
 */
public class Solution029 {
    public int divide(int dividend, int divisor) {        
        if (dividend==0)
            return 0;
        if (divisor==0)
            return 0;
        /*if (dividend<divisor)
            return 0;
        if (dividend==divisor)
            return 1;*/
        
        long absDividend = dividend;
        absDividend = Math.abs(absDividend);
        long absDivisor = divisor;
        absDivisor = Math.abs(absDivisor);
        long ret=0;
        long mulTwo=absDivisor;
        long remain=absDividend;
        int i=0;
        while(remain>=absDivisor) {
            while(mulTwo <= remain) {
                mulTwo = mulTwo << 1;
                i++;
            }
            ret = ret+(mulTwo >> 1)/absDivisor;
            remain=remain-(mulTwo >> 1);
            mulTwo = absDivisor;
            i=0;
        }
        
        if (dividend>0&&divisor>0||dividend<0&&divisor<0)
            if (ret>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else
                return (int)ret;
        else
            return -(int)ret;
    }
}
