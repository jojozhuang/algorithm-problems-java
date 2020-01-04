package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * 877. Stone Game
 * <p>
 * Alex and Lee play a game with piles of stones.  There are an even number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].
 * <p>
 * The objective of the game is to end with the most stones.  The total number of stones is odd, so there are no ties.
 * <p>
 * Alex and Lee take turns, with Alex starting first.  Each turn, a player takes the entire pile of stones from either the beginning or the end of the row.  This continues until there are no more piles left, at which point the person with the most stones wins.
 * <p>
 * Assuming Alex and Lee play optimally, return True if and only if Alex wins the game.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [5,3,4,5]
 * Output: true
 * Explanation:
 * Alex starts first, and can only take the first 5 or the last 5.
 * Say he takes the first 5, so that the row becomes [3, 4, 5].
 * If Lee takes 3, then the board is [4, 5], and Alex takes 5 to win with 10 points.
 * If Lee takes the last 5, then the board is [3, 4], and Alex takes 4 to win with 9 points.
 * This demonstrated that taking the first 5 was a winning move for Alex, so we return true.
 * <p>
 * <p>
 * Note:
 * <p>
 * 2 <= piles.length <= 500
 * piles.length is even.
 * 1 <= piles[i] <= 500
 * sum(piles) is odd.
 *
 * @author Johnny
 */
public class Solution877 {
    // similar question 486. Predict the Winner
    // optimized dp, O(n^2) , space, O(n)
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = piles[i];
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                dp[i] = Math.max(piles[i] - dp[i + 1], piles[len + i - 1] - dp[i]);
            }
        }

        return dp[0] > 0;
    }

    // dp, O(n^2) , space, O(n^2)
    public boolean stoneGame5(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n]; // dp[i][j], largest score when pick piles from i to j
        for (int i = 0; i < n; i++) {
            dp[i][i] = piles[i];
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = len + i - 1;
                dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1]);
            }
        }

        return dp[0][n - 1] > 0;
    }

    // recursion + memorization, TLE
    public boolean stoneGame3(int[] piles) {
        int n = piles.length;
        int[][] memo = new int[n][n];
        Arrays.stream(memo).forEach(row -> Arrays.fill(row, Integer.MIN_VALUE));
        return helper(piles, 0, piles.length - 1, memo) > 0;
    }

    private int helper(int[] piles, int l, int r, int[][] memo) {
        if (l == r) {
            return piles[l];
        }

        if (memo[l][r] != Integer.MIN_VALUE) {
            return memo[l][r];
        }

        int left = piles[l] - helper(piles, l + 1, r);
        int right = piles[r] - helper(piles, l, r - 1);

        memo[l][r] = Math.max(left, right);
        return memo[l][r];
    }

    // brute force, recursion, TLC
    public boolean stoneGame2(int[] piles) {
        return helper(piles, 0, piles.length - 1) > 0;
    }

    private int helper(int[] piles, int l, int r) {
        if (l == r) {
            return piles[l];
        }

        int left = piles[l] - helper(piles, l + 1, r);
        int right = piles[r] - helper(piles, l, r - 1);
        return Math.max(left, right);
    }
}
