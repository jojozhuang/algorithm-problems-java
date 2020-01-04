package johnny.leetcode.algorithm;

/**
 * 1015. Smallest Integer Divisible by K
 * Given a positive integer K, you need find the smallest positive integer N such that N is divisible by K, and N only contains the digit 1.
 * <p>
 * Return the length of N.  If there is no such N, return -1.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: 1
 * Explanation: The smallest answer is N = 1, which has length 1.
 * Example 2:
 * <p>
 * Input: 2
 * Output: -1
 * Explanation: There is no such positive integer N divisible by 2.
 * Example 3:
 * <p>
 * Input: 3
 * Output: 3
 * Explanation: The smallest answer is N = 111, which has length 3.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= K <= 10^5
 *
 * @author Johnny
 */
public class SolutionA1015 {
    public int smallestRepunitDivByK(int K) {
        if (K % 2 == 0 || K % 5 == 0) {
            return -1;
        }
        return 0;
    }
}
