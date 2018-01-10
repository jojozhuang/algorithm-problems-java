package johnny.algorithm.leetcode;

/**
 * Nth Digit
 * 
 * Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...
 * 
 * Note:
 * n is positive and will fit within the range of a 32-bit signed integer 
 * (n < 2^31).
 * 
 * Example 1:
 * Input:
 * 3
 * Output:
 * 3
 * 
 * Example 2:
 * Input:
 * 11
 * Output:
 * 0
 * Explanation:
 * The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0,
 * which is part of the number 10.
 * 
 * @author Johnny
 */
public class Solution400 {
    public int findNthDigit(int n) {
        if (n < 10) {
            return n;
        }
        
        int index = 9;
        for (int i = 10; i <= n; i++) {
            String curr = String.valueOf(i);
            if (curr.length() + index < n) {
                index += curr.length();
                continue;
            }
            for (int j = 0; j < curr.length(); j++) {
                index++;
                if (index == n) {
                    return curr.charAt(j) - '0';
                }
            }
       }
       return 0;
    }
}
