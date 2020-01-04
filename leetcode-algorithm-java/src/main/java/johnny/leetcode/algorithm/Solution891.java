package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * 891. Sum of Subsequence Widths
 * Given an array of integers A, consider all non-empty subsequences of A.
 * <p>
 * For any sequence S, let the width of S be the difference between the maximum and minimum element of S.
 * <p>
 * Return the sum of the widths of all subsequences of A.
 * <p>
 * As the answer may be very large, return the answer modulo 10^9 + 7.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [2,1,3]
 * Output: 6
 * Explanation:
 * Subsequences are [1], [2], [3], [2,1], [2,3], [1,3], [2,1,3].
 * The corresponding widths are 0, 0, 0, 1, 1, 2, 2.
 * The sum of these widths is 6.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 20000
 * 1 <= A[i] <= 20000
 *
 * @author Johnny
 */
public class Solution891 {
    public int sumSubseqWidths(int[] A) {
        int MOD = 1_000_000_007;
        int N = A.length;
        Arrays.sort(A);

        long[] pow2 = new long[N];
        pow2[0] = 1;
        for (int i = 1; i < N; ++i)
            pow2[i] = pow2[i - 1] * 2 % MOD;

        long ans = 0;
        for (int i = 0; i < N; ++i)
            ans = (ans + (pow2[i] - pow2[N - 1 - i]) * A[i]) % MOD;

        return (int) ans;
    }
}
