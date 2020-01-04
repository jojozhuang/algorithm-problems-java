package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 961. N-Repeated Element in Size 2N Array
 * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
 * <p>
 * Return the element repeated N times.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,3]
 * Output: 3
 * Example 2:
 * <p>
 * Input: [2,1,2,5,3,2]
 * Output: 2
 * Example 3:
 * <p>
 * Input: [5,1,5,2,5,3,5,4]
 * Output: 5
 * <p>
 * <p>
 * Note:
 * <p>
 * 4 <= A.length <= 10000
 * 0 <= A[i] < 10000
 * A.length is even
 *
 * @author Johnny
 */
public class Solution961 {
    // compare, space O(1)
    public int repeatedNTimes(int[] A) {
        for (int i = 2; i < A.length; i++) {
            if (A[i] == A[i - 1] || A[i] == A[i - 2]) {
                return A[i];
            }
        }
        return A[0];
    }

    // duplicate with hashset, space O(n)
    public int repeatedNTimes4(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (!set.contains(A[i])) {
                set.add(A[i]);
            } else {
                return A[i];
            }
        }

        return -1;
    }

    // duplicate with hashmap
    public int repeatedNTimes2(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])) {
                map.put(A[i], 1);
            } else {
                return A[i];
            }
        }

        return -1;
    }

    // count, space O(n)
    public int repeatedNTimes3(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(A[i])) {
                map.put(A[i], 0);
            }
            map.put(A[i], map.get(A[i]) + 1);
            if (map.get(A[i]) >= n / 2) {
                return A[i];
            }
        }

        return -1;
    }
}
