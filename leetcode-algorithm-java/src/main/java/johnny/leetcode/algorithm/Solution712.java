package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * 712. Minimum ASCII Delete Sum for Two Strings
 * Given two strings s1, s2, find the lowest ASCII sum of deleted characters to make two strings equal.
 * <p>
 * Example 1:
 * Input: s1 = "sea", s2 = "eat"
 * Output: 231
 * Explanation: Deleting "s" from "sea" adds the ASCII value of "s" (115) to the sum.
 * Deleting "t" from "eat" adds 116 to the sum.
 * At the end, both strings are equal, and 115 + 116 = 231 is the minimum sum possible to achieve this.
 * Example 2:
 * Input: s1 = "delete", s2 = "leet"
 * Output: 403
 * Explanation: Deleting "dee" from "delete" to turn the string into "let",
 * adds 100[d]+101[e]+101[e] to the sum.  Deleting "e" from "leet" adds 101[e] to the sum.
 * At the end, both strings are equal to "let", and the answer is 100+101+101+101 = 403.
 * If instead we turned both strings into "lee" or "eet", we would get answers of 433 or 417, which
 * are higher.
 * Note:
 * <p>
 * 0 < s1.length, s2.length <= 1000.
 * All elements of each string will have an ASCII value in [97, 122].
 *
 * @author Johnny
 */
public class Solution712 {
    // dp
    public int minimumDeleteSum(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        for (int i = 1; i <= n1; i++) {
            dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
        }
        for (int j = 1; j <= n2; j++) {
            dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
        }

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + s1.charAt(i - 1), dp[i][j - 1] + s2.charAt(j - 1));
                }
            }
        }

        return dp[n1][n2];
    }

    // recursion + memorization
    public int minimumDeleteSum2(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        int[][] memo = new int[n1 + 1][n2 + 1];
        Arrays.stream(memo).forEach(a -> Arrays.fill(a, Integer.MAX_VALUE));
        return helper(s1, n1, s2, n2, memo);
    }

    private int helper(String s1, int i, String s2, int j, int[][] memo) {
        if (i == 0 && j == 0) {
            return 0;
        }
        if (memo[i][j] != Integer.MAX_VALUE) {
            return memo[i][j];
        }
        if (i == 0) {
            memo[i][j] = helper(s1, i, s2, j - 1, memo) + (int) s2.charAt(j - 1);
        } else if (j == 0) {
            memo[i][j] = helper(s1, i - 1, s2, j, memo) + (int) s1.charAt(i - 1);
        } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            memo[i][j] = helper(s1, i - 1, s2, j - 1, memo);
        } else {
            memo[i][j] = Math.min(helper(s1, i, s2, j - 1, memo) + (int) s2.charAt(j - 1), helper(s1, i - 1, s2, j, memo) + (int) s1.charAt(i - 1));
        }

        return memo[i][j];
    }
}