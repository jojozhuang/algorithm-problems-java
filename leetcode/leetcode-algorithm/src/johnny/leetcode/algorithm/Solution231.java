package johnny.leetcode.algorithm;

/**
 * Power of Two.
 * Given an integer, write a function to determine if it is a power of two.
 * 
 * @author Johnny
 */
public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n = n >> 1;
        }
        return count == 1;
    }
    
    public boolean isPowerOfTwo2(int n) {
        if (n <= 0) {
            return false;
        }
        
        return (n &(n - 1)) == 0;
    }
}
