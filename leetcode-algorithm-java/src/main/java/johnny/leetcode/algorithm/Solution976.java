package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * 976. Largest Perimeter Triangle
 * Given an array A of positive lengths, return the largest perimeter of a triangle with non-zero area, formed from 3 of these lengths.
 * <p>
 * If it is impossible to form any triangle of non-zero area, return 0.
 * <p>
 * Example 1:
 * Input: [2,1,2]
 * Output: 5
 * <p>
 * Example 2:
 * Input: [1,2,1]
 * Output: 0
 * <p>
 * Example 3:
 * Input: [3,2,3,4]
 * Output: 10
 * <p>
 * Example 4:
 * Input: [3,6,2,3]
 * Output: 8
 * <p>
 * Note:
 * <pre>{@code
 * 3 <= A.length <= 10000
 * 1 <= A[i] <= 10^6
 * }</pre>
 *
 * @author Johnny
 */
public class Solution976 {
    public int largestPerimeter(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        Arrays.sort(A);

        for (int i = A.length - 1; i >= 2; i--) {
            if (A[i] < A[i - 1] + A[i - 2]) {
                return A[i] + A[i - 1] + A[i - 2];
            }
        }

        return 0;
    }
}
