package johnny.leetcode.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * 954. Array of Doubled Pairs
 * Given an array of integers A with even length, return true if and only if it is possible to reorder it such that A[2 * i + 1] = 2 * A[2 * i] for every {@code 0 <= i < len(A) / 2}.
 * <p>
 * Example 1:
 * Input: [3,1,3,6]
 * Output: false
 * <p>
 * Example 2:
 * Input: [2,1,2,6]
 * Output: false
 * <p>
 * Example 3:
 * Input: [4,-2,2,-4]
 * Output: true
 * Explanation: We can take two groups, [-2,-4] and [2,4] to form [-2,-4,2,4] or [2,4,-2,-4].
 * <p>
 * Example 4:
 * Input: [1,2,4,16,8,4]
 * Output: false
 * <p>
 * Note:
 * <pre>{@code
 * 0 <= A.length <= 30000
 * A.length is even
 * -100000 <= A[i] <= 100000
 * }</pre>
 *
 * @author Johnny
 */
public class Solution954 {
    public boolean canReorderDoubled(int[] A) {
        // count[x] = the number of occurrences of x in A
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int x : A)
            count.put(x, count.getOrDefault(x, 0) + 1);

        // B = A as Integer[], sorted by absolute value
        Integer[] B = new Integer[A.length];
        for (int i = 0; i < A.length; ++i)
            B[i] = A[i];
        Arrays.sort(B, Comparator.comparingInt(Math::abs));

        for (int x : B) {
            // If this can't be consumed, skip
            if (count.get(x) == 0) continue;
            // If this doesn't have a doubled partner, the answer is false
            if (count.getOrDefault(2 * x, 0) <= 0) return false;

            // Write x, 2*x
            count.put(x, count.get(x) - 1);
            count.put(2 * x, count.get(2 * x) - 1);
        }

        // If we have written everything, the answer is true
        return true;
    }
}
