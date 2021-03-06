package johnny.leetcode.algorithm;

/**
 * 1031. Maximum Sum of Two Non-Overlapping Subarrays
 * Given an array A of non-negative integers, return the maximum sum of elements in two non-overlapping (contiguous) subarrays, which have lengths L and M.  (For clarification, the L-length subarray could occur before or after the M-length subarray.)
 * <pre>{@code
 * Formally, return the largest V for which V = (A[i] + A[i+1] + ... + A[i+L-1]) + (A[j] + A[j+1] + ... + A[j+M-1]) and either:
 * 0 <= i < i + L - 1 < j < j + M - 1 < A.length, or
 * 0 <= j < j + M - 1 < i < i + L - 1 < A.length.
 * }</pre>
 * Example 1:
 * Input: A = [0,6,5,2,2,5,1,9,4], L = 1, M = 2
 * Output: 20
 * Explanation: One choice of subarrays is [9] with length 1, and [6,5] with length 2.
 * <p>
 * Example 2:
 * Input: A = [3,8,1,3,2,1,8,9,0], L = 3, M = 2
 * Output: 29
 * Explanation: One choice of subarrays is [3,8,1] with length 3, and [8,9] with length 2.
 * <p>
 * Example 3:
 * Input: A = [2,1,5,6,0,9,5,0,3,8], L = 4, M = 3
 * Output: 31
 * Explanation: One choice of subarrays is [5,6,0,9] with length 4, and [3,8] with length 3.
 * <p>
 * Note:
 * <pre>{@code
 * L >= 1
 * M >= 1
 * L + M <= A.length <= 1000
 * 0 <= A[i] <= 1000
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1031 {
    public int maxSumTwoNoOverlap(int[] A, int L, int M) {
        int n = A.length;
        int[] sum = new int[n];
        sum[0] = A[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + A[i];
        }

        int[] sum1 = new int[n];
        sum1[L - 1] = sum[L - 1];
        for (int i = L; i < n; i++) {
            sum1[i] = sum[i] - sum[i - L];
        }

        int[] sum2 = new int[n];
        sum2[M - 1] = sum[M - 1];
        for (int i = M; i < n; i++) {
            sum2[i] = sum[i] - sum[i - M];
        }

        int max = 0;
        for (int i = L - 1; i < n; i++) {
            int maxM = 0;
            for (int j = M - 1; j <= i - L; j++) {
                maxM = Math.max(maxM, sum2[j]);
            }
            for (int j = i + M; j < n; j++) {
                maxM = Math.max(maxM, sum2[j]);
            }
            max = Math.max(max, maxM + sum1[i]);
        }

        return max;
    }
}
