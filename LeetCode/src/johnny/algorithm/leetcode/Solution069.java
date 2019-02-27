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
    // binary search
    // only the integer part is required to return, so if k is the result, then 1≤k≤x.
    public int mySqrt(int x) {
        if (x < 1) {
            return 0;
        }
        int start = 1;
        int end = x;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid > x / mid) {
                end = mid - 1;
            } else {
                if (mid + 1 > x /(mid + 1)) {
                    return mid;
                } else {
                    start = mid + 1;
                }
            }
        }
        
        return start;
    }
    
    public int sqrt(int x) {
        if (x < 1) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        int left = 1, right = Integer.MAX_VALUE;
        while (true) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }
    
    public int sqrt2(int x) {
        if (x < 1) {
            return 0;
        }
      
        int start = 1;
        int end = x;
        int mid = 1;
        
        while (start + 1 < end) {
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
