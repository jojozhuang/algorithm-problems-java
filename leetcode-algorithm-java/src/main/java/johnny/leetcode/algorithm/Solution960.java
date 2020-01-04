package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * 960. Delete Columns to Make Sorted III
 * We are given an array A of N lowercase letter strings, all of the same length.
 * <p>
 * Now, we may choose any set of deletion indices, and for each string, we delete all the characters in those indices.
 * <p>
 * For example, if we have an array A = ["babca","bbazb"] and deletion indices {0, 1, 4}, then the final array after deletions is ["bc","az"].
 * <p>
 * Suppose we chose a set of deletion indices D such that after deletions, the final array has every element (row) in lexicographic order.
 * <p>
 * For clarity, A[0] is in lexicographic order (ie. A[0][0] <= A[0][1] <= ... <= A[0][A[0].length - 1]), A[1] is in lexicographic order (ie. A[1][0] <= A[1][1] <= ... <= A[1][A[1].length - 1]), and so on.
 * <p>
 * Return the minimum possible value of D.length.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: ["babca","bbazb"]
 * Output: 3
 * Explanation: After deleting columns 0, 1, and 4, the final array is A = ["bc", "az"].
 * Both these rows are individually in lexicographic order (ie. A[0][0] <= A[0][1] and A[1][0] <= A[1][1]).
 * Note that A[0] > A[1] - the array A isn't necessarily in lexicographic order.
 * Example 2:
 * <p>
 * Input: ["edcba"]
 * Output: 4
 * Explanation: If we delete less than 4 columns, the only row won't be lexicographically sorted.
 * Example 3:
 * <p>
 * Input: ["ghi","def","abc"]
 * Output: 0
 * Explanation: All rows are already lexicographically sorted.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 100
 *
 * @author Johnny
 */
public class Solution960 {
    public int minDeletionSize(String[] A) {
        int W = A[0].length();
        int[] dp = new int[W];
        Arrays.fill(dp, 1);
        for (int i = W - 2; i >= 0; --i)
            search:for (int j = i + 1; j < W; ++j) {
                for (String row : A)
                    if (row.charAt(i) > row.charAt(j))
                        continue search;

                dp[i] = Math.max(dp[i], 1 + dp[j]);
            }

        int kept = 0;
        for (int x : dp)
            kept = Math.max(kept, x);
        return W - kept;
    }
}
