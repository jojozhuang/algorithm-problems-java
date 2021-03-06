package johnny.leetcode.algorithm;

/**
 * 978. Longest Turbulent Subarray
 * A subarray A[i], A[i+1], ..., A[j] of A is said to be turbulent if and only if:
 * <pre>{@code
 * For i <= k < j, A[k] > A[k+1] when k is odd, and A[k] < A[k+1] when k is even;
 * OR, for i <= k < j, A[k] > A[k+1] when k is even, and A[k] < A[k+1] when k is odd.
 * That is, the subarray is turbulent if the comparison sign flips between each adjacent pair of elements in the subarray.
 * }</pre>
 * Return the length of a maximum size turbulent subarray of A.
 * <p>
 * Example 1:
 * Input: [9,4,2,10,7,8,8,1,9]
 * Output: 5
 * Explanation: ({@code A[1] > A[2] < A[3] > A[4] < A[5]})
 * <p>
 * Example 2:
 * Input: [4,8,12,16]
 * Output: 2
 * <p>
 * Example 3:
 * Input: [100]
 * Output: 1
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= A.length <= 40000
 * 0 <= A[i] <= 10^9
 * }</pre>
 *
 * @author Johnny
 */
public class Solution978 {
    public int maxTurbulenceSize(int[] A) {
        int N = A.length;
        int ans = 1;
        int anchor = 0;

        for (int i = 1; i < N; ++i) {
            int c = Integer.compare(A[i - 1], A[i]);
            if (c == 0) {
                anchor = i;
            } else if (i == N - 1 || c * Integer.compare(A[i], A[i + 1]) != -1) {
                ans = Math.max(ans, i - anchor + 1);
                anchor = i;
            }
        }

        return ans;
    }
}
