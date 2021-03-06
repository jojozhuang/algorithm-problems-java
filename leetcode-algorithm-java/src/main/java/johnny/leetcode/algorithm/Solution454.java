package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 4Sum II
 * <p>
 * Given four lists A, B, C, D of integer values, compute how many tuples
 * (i, j, k, l) there are such that A[i] + B[j] + C[k] + D[l] is zero.
 * <p>
 * To make problem a bit easier, all A, B, C, D have same length of N
 * where 0 ≤ N ≤ 500. All integers are in the range of -228 to 228 - 1 and the
 * result is guaranteed to be at most 231 - 1.
 * <p>
 * Example:
 * <p>
 * Input:
 * A = [ 1, 2]
 * B = [-2,-1]
 * C = [-1, 2]
 * D = [ 0, 2]
 * <p>
 * Output:
 * 2
 * <p>
 * Explanation:
 * The two tuples are:
 * {@code 1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0}
 * {@code 2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0}
 *
 * @author Johnny
 */
public class Solution454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        // approach1: brute force, n^4
        // approach2: hash last array, n^3
        // approach3: sum a and b, hash; sum c and d, hash, n^2
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int sum = C[i] + D[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int res = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                res += map.getOrDefault(-1 * (A[i] + B[j]), 0);
            }
        }

        return res;
    }
}
