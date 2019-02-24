package johnny.algorithm.leetcode;

/**
 * Sum of Square Numbers
 * 
 * Given a non-negative integer c, your task is to decide whether there're two 
 * integers a and b such that a2 + b2 = c.
 * 
 * Example 1:
 * Input: 5
 * Output: True
 * Explanation: 1 * 1 + 2 * 2 = 5
 * 
 * Example 2:
 * Input: 3
 * Output: False
 *  
 * @author Johnny
 */
public class Solution633 {
    public boolean judgeSquareSum(int c) {
        int root = (int)Math.sqrt(c);
        for (int a = 0; a <= root; a++) {
            int b = (int)Math.sqrt(c - a * a);
            if (a*a + b*b == c) {
                return true;
            }
        }
        
        return false;
    }
    public boolean judgeSquareSum3(int c) {
        if (c < 0) {
            return false;
        }
        int left = 0, right = (int)Math.sqrt(c);
        while (left <= right) {
            int cur = left * left + right * right;
            if (cur < c) {
                left++;
            } else if (cur > c) {
                right--;
            } else {
                return true;
            }
        }
        return false;
    }
    // Brute force
    public boolean judgeSquareSum2(int c) {
        for (long a = 0; a * a <= c; a++) {
            for (long b = 0; b * b <= c; b++) {
                if (a * a + b * b == c)
                    return true;
            }
        }
        return false;
    }
}
