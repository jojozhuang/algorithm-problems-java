package johnny.leetcode.algorithm;

/**
 * 941. Valid Mountain Array
 * Given an array A of integers, return true if and only if it is a valid mountain array.
 * <p>
 * Recall that A is a mountain array if and only if:
 * <pre>{@code
 * A.length >= 3
 * There exists some i with 0 < i < A.length - 1 such that:
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[B.length - 1]
 * }</pre>
 * Example 1:
 * Input: [2,1]
 * Output: false
 * <p>
 * Example 2:
 * Input: [3,5,5]
 * Output: false
 * <p>
 * Example 3:
 * Input: [0,3,2,1]
 * Output: true
 * <p>
 * Note:
 * <pre>{@code
 * 0 <= A.length <= 10000
 * 0 <= A[i] <= 10000
 * }</pre>
 *
 * @author Johnny
 */
public class Solution941 {
    public boolean validMountainArray(int[] A) {
        if (A == null || A.length < 3) {
            return false;
        }

        boolean peekFound = false;
        for (int i = 1; i < A.length; i++) {
            if (!peekFound) {
                if (A[i] <= A[i - 1]) {
                    return false;
                }
                if (A[i - 1] < A[i] && (i + 1 < A.length) && A[i] > A[i + 1]) {
                    peekFound = true;
                }
            } else {
                if (A[i] >= A[i - 1]) {
                    return false;
                }
            }
        }

        return peekFound;
    }
}
