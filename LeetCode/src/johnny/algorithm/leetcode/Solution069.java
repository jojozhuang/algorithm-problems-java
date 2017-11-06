/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.math.BigInteger;

/**
 * Sqrt(x).
 * Implement int sqrt(int x).
 * 
 * Compute and return the square root of x.
 * 
 * @author Johnny
 */
public class Solution069 {
    // only the integer part is required to return, so if k is the result, then 1≤k≤x.
    public int sqrt(int x) {
        if (x < 1) {
            return 0;
        }       
      
        int start = 1;
        int end = x;
        int mid = 1;
        
        while(start + 1 < end) {
            mid = start + (end - start) / 2;
            BigInteger mul = BigInteger.valueOf(mid);
            mul = mul.multiply(mul);
            
            int compare = mul.compareTo(BigInteger.valueOf(x));
            if (compare == 0) {
                return mid;
            } else if (compare == 1){
                end = mid;
            } else {
                start = mid;
            }
        }

        return start;
    }
}
