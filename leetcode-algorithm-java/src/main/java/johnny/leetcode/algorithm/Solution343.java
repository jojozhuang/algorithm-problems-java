package johnny.leetcode.algorithm;

/**
 * Integer Break.
 * <p>
 * Given a positive integer n, break it into the sum of at least two positive
 * integers and maximize the product of those integers. Return the maximum
 * product you can get.
 * <p>
 * For example, given n = 2, return 1 (2 = 1 + 1); given n = 10,
 * return 36 (10 = 3 + 3 + 4).
 * <p>
 * Note: you may assume that n is not less than 2.
 *
 * @author Johnny
 */
public class Solution343 {
    //http://www.programcreek.com/2015/04/leetcode-integer-break-java/
    public int integerBreak(int n) {
        if (n < 2) {
            return 0;
        }

        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i + j <= n) {
                    dp[i + j] = Math.max(dp[i + j], Math.max(dp[i], i) * Math.max(dp[j], j));
                }
            }
        }
        return dp[n];
    }
}
