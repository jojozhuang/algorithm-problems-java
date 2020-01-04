package johnny.leetcode.algorithm;

/**
 * 775. Global and Local Inversions
 * We have some permutation A of [0, 1, ..., N - 1], where N is the length of A.
 * <p>
 * The number of (global) inversions is the number of {@code i < j with 0 <= i < j < N and A[i] > A[j]}.
 * <p>
 * The number of local inversions is the number of i with {@code 0 <= i < N and A[i] > A[i+1]}.
 * <p>
 * Return true if and only if the number of global inversions is equal to the number of local inversions.
 * <p>
 * Example 1:
 * <p>
 * Input: A = [1,0,2]
 * Output: true
 * Explanation: There is 1 global inversion, and 1 local inversion.
 * Example 2:
 * <p>
 * Input: A = [1,2,0]
 * Output: false
 * Explanation: There are 2 global inversions, and 1 local inversion.
 * Note:
 * <p>
 * A will be a permutation of [0, 1, ..., A.length - 1].
 * A will have length in range [1, 5000].
 * The time limit for this problem has been reduced.
 *
 * @author Johnny
 */
public class Solution775 {
    //https://www.youtube.com/watch?v=3QHSJSFm0W0
    public boolean isIdealPermutation(int[] A) {
        for (int i = 0; i < A.length; i++) {
            // For permutation list, global >= local. If abs(A[i] - i) > 1, there must be a global inversion 
            // that is not a local inversion.
            // Example, 1,0,2,5,3,4, 5 - 3 > 2
            // Example, 0,2,3,1,5,4, 1 - 3 < -2
            if (Math.abs(A[i] - i) > 1) {
                return false;
            }
        }

        return true;
    }

    // brute force, time: O(n^2), space: O(1)
    public boolean isIdealPermutation2(int[] A) {
        int n = A.length;
        int global = 0;
        int local = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (A[i] > A[j]) {
                    global++;
                    if (i == j - 1) {
                        local++;
                    } else {
                        return false;
                    }
                }
            }
        }

        return global == local;
    }
}
