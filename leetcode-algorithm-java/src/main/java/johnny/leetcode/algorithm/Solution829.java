package johnny.leetcode.algorithm;

/**
 * 829. Consecutive Numbers Sum
 * <p>
 * Given a positive integer N, how many ways can we write it as a sum of consecutive positive integers?
 * <p>
 * Example 1:
 * <p>
 * Input: 5
 * Output: 2
 * Explanation: 5 = 5 = 2 + 3
 * Example 2:
 * <p>
 * Input: 9
 * Output: 3
 * Explanation: 9 = 9 = 4 + 5 = 2 + 3 + 4
 * Example 3:
 * <p>
 * Input: 15
 * Output: 4
 * Explanation: 15 = 15 = 8 + 7 = 4 + 5 + 6 = 1 + 2 + 3 + 4 + 5
 * Note: 1 <= N <= 10 ^ 9.
 *
 * @author Johnny
 */
public class Solution829 {
    public int consecutiveNumbersSum(int N) {
        int count = 1;
        for (int k = 2; k < Math.sqrt(2 * N); k++) {
            if ((N - (k * (k - 1) / 2)) % k == 0) count++;
        }
        return count;
    }
}
