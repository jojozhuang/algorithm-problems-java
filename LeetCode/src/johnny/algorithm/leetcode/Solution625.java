package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Minimum Factorization
 * 
 * Given a positive integer a, find the smallest positive integer b whose 
 * multiplication of each digit equals to a.
 * 
 * If there is no answer or the answer is not fit in 32-bit signed integer, 
 * then return 0.
 * 
 * Example 1
 * Input: 48 
 * Output: 68
 * 
 * Example 2
 * Input: 15
 * Output: 35
 * 
 * @author Johnny
 */
public class Solution625 {
    public int smallestFactorization(int a) {
        // Case 1: If number is smaller than 10
        if (a < 10) return a;
        
        // Case 2: Start with 9 and try every possible digit
        List<Integer> res = new ArrayList<>();
        for (int i = 9; i > 1; i--) {
            // If current digit divides n, then store all
            // occurrences of current digit in res
            while (a % i == 0) {
                a = a / i;
                res.add(i);
            }
        }

        // If n could not be broken in form of digits
        if (a != 1) return 0;

        // Get the result from the array in reverse order
        long result = 0;
        for (int i = res.size() - 1; i >= 0; i--) {
            result = result * 10 + res.get(i);
            if (result > Integer.MAX_VALUE) return 0;
        }
        
        return (int)result;
    }
}
