package johnny.leetcode.algorithm;

/**
 * 905. Sort Array By Parity
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 * <p>
 * You may return any answer array that satisfies this condition.
 * <p>
 * Example 1:
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 * }</pre>
 *
 * @author Johnny
 */
public class Solution905 {
    public int[] sortArrayByParity(int[] A) {
        if (A == null || A.length < 2) {
            return A;
        }

        int left = 0;
        int right = A.length - 1;

        while (left < right) {
            while (left < A.length && A[left] % 2 == 0) {
                left++;
            }
            while (right >= 0 && A[right] % 2 != 0) {
                right--;
            }
            if (left >= right) {
                break;
            }
            int temp = A[left];
            A[left] = A[right];
            A[right] = temp;
            left++;
            right--;
        }

        return A;
    }
}
