package johnny.leetcode.algorithm;

/**
 * 982. Triples with Bitwise AND Equal To Zero
 * Given an array of integers A, find the number of triples of indices (i, j, k) such that:
 * <pre>{@code
 * 0 <= i < A.length
 * 0 <= j < A.length
 * 0 <= k < A.length
 * A[i] & A[j] & A[k] == 0, where & represents the bitwise-AND operator.
 * }</pre>
 * Example 1:
 * Input: [2,1,3]
 * Output: 12
 * Explanation: We could choose the following i, j, k triples:
 * <pre>{@code
 * (i=0, j=0, k=1) : 2 & 2 & 1
 * (i=0, j=1, k=0) : 2 & 1 & 2
 * (i=0, j=1, k=1) : 2 & 1 & 1
 * (i=0, j=1, k=2) : 2 & 1 & 3
 * (i=0, j=2, k=1) : 2 & 3 & 1
 * (i=1, j=0, k=0) : 1 & 2 & 2
 * (i=1, j=0, k=1) : 1 & 2 & 1
 * (i=1, j=0, k=2) : 1 & 2 & 3
 * (i=1, j=1, k=0) : 1 & 1 & 2
 * (i=1, j=2, k=0) : 1 & 3 & 2
 * (i=2, j=0, k=1) : 3 & 2 & 1
 * (i=2, j=1, k=0) : 3 & 1 & 2
 * }</pre>
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= A.length <= 1000
 * 0 <= A[i] < 2^16
 * }</pre>
 *
 * @author Johnny
 */
public class Solution982 {
    public int countTriplets(int[] A) {
        int N = 1 << 16, M = 3;
        int[][] dp = new int[M + 1][N];
        dp[0][N - 1] = 1;
        for (int i = 0; i < M; i++) {
            for (int k = 0; k < N; k++) {
                for (int a : A) {
                    dp[i + 1][k & a] += dp[i][k];
                }
            }
        }
        return dp[M][0];
    }
}
