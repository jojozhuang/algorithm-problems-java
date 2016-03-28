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
    //http://www.programcreek.com/2014/05/leetcode-divide-two-integers-java/
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }
    
        if (dividend == 0) {
            return 0;
        }
        
        // overflow
        if(divisor == -1 && dividend == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        
        int negative = 1;
        if ((dividend < 0) ^ (divisor < 0)) {
            negative = -1;
        }
        
        long pDividend = Math.abs((long)dividend);
        long pDivisor = Math.abs((long)divisor);
        int res = 0;
        while(pDividend >= pDivisor) {
            //calculate number of left shifts
            int numShift = 0;    
            while(pDividend >= (pDivisor << numShift)){
                numShift++;
            }

            //dividend minus the largest shifted divisor
            res += 1<<(numShift - 1);
            pDividend -= (pDivisor << (numShift - 1));
        }
        
        return res * negative;
    }
}
