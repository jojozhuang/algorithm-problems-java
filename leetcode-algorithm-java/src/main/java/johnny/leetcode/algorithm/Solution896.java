package johnny.leetcode.algorithm;

/**
 * 896. Monotonic Array
 * An array is monotonic if it is either monotone increasing or monotone decreasing.
 * <p>
 * An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
 * <p>
 * Return true if and only if the given array A is monotonic.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,2,3]
 * Output: true
 * Example 2:
 * <p>
 * Input: [6,5,4,4]
 * Output: true
 * Example 3:
 * <p>
 * Input: [1,3,2]
 * Output: false
 * Example 4:
 * <p>
 * Input: [1,2,4,5]
 * Output: true
 * Example 5:
 * <p>
 * Input: [1,1,1]
 * Output: true
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 50000
 * -100000 <= A[i] <= 100000
 *
 * @author Johnny
 */
public class Solution896 {
    public boolean isMonotonic(int[] A) {
        if (A == null || A.length == 0) {
            return false;
        }

        if (A.length == 1) {
            return true;
        }

        int flag = 0; // 0: same, 1: increasing, 2: decreasing

        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                if (flag == 2) {
                    return false;
                } else {
                    flag = 1;
                }
            } else if (A[i] < A[i - 1]) {
                if (flag == 1) {
                    return false;
                } else {
                    flag = 2;
                }
            }
        }

        return true;
    }
}
