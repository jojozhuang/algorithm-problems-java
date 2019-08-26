package johnny.leetcode.algorithm;

/**
 * Power of Four.
 * Given an integer (signed 32 bits), write a function to check whether it is 
 * a power of 4.
 * 
 * Example:
 * Given num = 16, return true. Given num = 5, return false.
 * 
 * Follow up: Could you solve it without loops/recursion?
 * 
 * @author Johnny
 */
public class Solution342 {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) {
            return false;
        }
        
        return (num &(num - 1)) == 0 && (num % 3) == 1;
    }
}
