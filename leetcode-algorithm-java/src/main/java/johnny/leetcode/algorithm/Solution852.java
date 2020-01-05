package johnny.leetcode.algorithm;

/**
 * 852. Peak Index in a Mountain Array
 * Let's call an array A a mountain if the following properties hold:
 * {@code A.length >= 3}
 * {@code There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]}
 * {@code Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].}
 * Example 1:
 * Input: [0,1,0]
 * Output: 1
 * <p>
 * Example 2:
 * Input: [0,2,1,0]
 * Output: 1
 * <p>
 * Note:
 * <pre>{@code
 * 3 <= A.length <= 10000
 * 0 <= A[i] <= 10^6
 * A is a mountain, as defined above.
 * }</pre>
 *
 * @author Johnny
 */
public class Solution852 {
    public int peakIndexInMountainArray(int[] A) {
        if (A == null || A.length < 3) {
            return -1;
        }

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                return i;
            }
        }

        return -1;
    }
}
