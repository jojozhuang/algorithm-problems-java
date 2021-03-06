package johnny.leetcode.algorithm;

/**
 * 944. Delete Columns to Make Sorted
 * We are given an array A of N lowercase letter strings, all of the same length.
 * <p>
 * Now, we may choose any set of deletion indices, and for each string, we delete all the characters in those indices.
 * <p>
 * For example, if we have a string "abcdef" and deletion indices {0, 2, 3}, then the final string after deletion is "bef".
 * <p>
 * Suppose we chose a set of deletion indices D such that after deletions, each remaining column in A is in non-decreasing sorted order.
 * <p>
 * Formally, the c-th column is [A[0][c], A[1][c], ..., A[A.length-1][c]]
 * <p>
 * Return the minimum possible value of D.length.
 * <p>
 * Example 1:
 * Input: ["cba","daf","ghi"]
 * Output: 1
 * <p>
 * Example 2:
 * Input: ["a","b"]
 * Output: 0
 * <p>
 * Example 3:
 * Input: ["zyx","wvu","tsr"]
 * Output: 3
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 1000
 * }</pre>
 *
 * @author Johnny
 */
public class Solution944 {
    public int minDeletionSize(String[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        int ans = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j].charAt(i) > A[j + 1].charAt(i)) {
                    ans++;
                    break;
                }
            }
        }

        return ans;
    }
}
