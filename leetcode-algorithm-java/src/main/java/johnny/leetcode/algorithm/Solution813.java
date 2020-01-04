package johnny.leetcode.algorithm;

/**
 * 813. Largest Sum of Averages
 * We partition a row of numbers A into at most K adjacent (non-empty) groups, then our score is the sum of the average of each group. What is the largest score we can achieve?
 * <p>
 * Note that our partition must use every number in A, and that scores are not necessarily integers.
 * <p>
 * Example:
 * Input:
 * A = [9,1,2,3,9]
 * K = 3
 * Output: 20
 * Explanation:
 * The best choice is to partition A into [9], [1, 2, 3], [9]. The answer is 9 + (1 + 2 + 3) / 3 + 9 = 20.
 * We could have also partitioned A into [9, 1], [2], [3, 9], for example.
 * That partition would lead to a score of 5 + 2 + 6 = 13, which is worse.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 100.
 * 1 <= A[i] <= 10000.
 * 1 <= K <= A.length.
 * Answers within 10^-6 of the correct answer will be accepted as correct.
 *
 * @author Johnny
 */
public class Solution813 {
    public double largestSumOfAverages(int[] A, int K) {
        int N = A.length;
        double[] P = new double[N + 1];
        for (int i = 0; i < N; ++i)
            P[i + 1] = P[i] + A[i];

        double[] dp = new double[N];
        for (int i = 0; i < N; ++i)
            dp[i] = (P[N] - P[i]) / (N - i);

        for (int k = 0; k < K - 1; ++k)
            for (int i = 0; i < N; ++i)
                for (int j = i + 1; j < N; ++j)
                    dp[i] = Math.max(dp[i], (P[j] - P[i]) / (j - i) + dp[j]);

        return dp[0];
    }
}
