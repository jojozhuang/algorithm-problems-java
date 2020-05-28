package johnny.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * 898. Bitwise ORs of Subarrays
 * We have an array A of non-negative integers.
 * <p>
 * For every (contiguous) subarray B = [A[i], A[i+1], ..., A[j]] (with {@code i <= j}), we take the bitwise OR of all the elements in B, obtaining a result A[i] | A[i+1] | ... | A[j].
 * <p>
 * Return the number of possible results.  (Results that occur more than once are only counted once in the final answer.)
 * <p>
 * Example 1:
 * Input: [0]
 * Output: 1
 * Explanation:
 * There is only one possible result: 0.
 * <p>
 * Example 2:
 * Input: [1,1,2]
 * Output: 3
 * Explanation:
 * The possible subarrays are [1], [1], [2], [1, 1], [1, 2], [1, 1, 2].
 * These yield the results 1, 1, 2, 1, 3, 3.
 * There are 3 unique values, so the answer is 3.
 * <p>
 * Example 3:
 * Input: [1,2,4]
 * Output: 6
 * Explanation:
 * The possible results are 1, 2, 3, 4, 6, and 7.
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= A.length <= 50000
 * 0 <= A[i] <= 10^9
 * }</pre>
 *
 * @author Johnny
 */
public class Solution898 {
    public int subarrayBitwiseORs(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {

            }
        }
        Set<Integer> ans = new HashSet<>();
        Set<Integer> cur = new HashSet<>();
        cur.add(0);
        for (int x : A) {
            Set<Integer> cur2 = new HashSet<>();
            for (int y : cur)
                cur2.add(x | y);
            cur2.add(x);
            cur = cur2;
            ans.addAll(cur);
        }

        return ans.size();
    }

    public int subarrayBitwiseORs2(int[] A) {
        Set<Integer> ans = new HashSet<>();
        Set<Integer> cur = new HashSet<>();
        cur.add(0);
        for (int x : A) {
            Set<Integer> cur2 = new HashSet<>();
            for (int y : cur)
                cur2.add(x | y);
            cur2.add(x);
            cur = cur2;
            ans.addAll(cur);
        }

        return ans.size();
    }
}
