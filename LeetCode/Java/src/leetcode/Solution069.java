/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
            long mul = mid * mid;
            if (mul == x) {
                return mid;
            } else if (mul > x){
                end = mid;
            } else {
                start = mid;
            }
        }

        return start;
    }
}
