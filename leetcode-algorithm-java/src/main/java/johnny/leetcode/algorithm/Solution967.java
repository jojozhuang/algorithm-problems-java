package johnny.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 967. Numbers With Same Consecutive Differences
 * <p>
 * Return all non-negative integers of length N such that the absolute difference between every two consecutive digits is K.
 * <p>
 * Note that every number in the answer must not have leading zeros except for the number 0 itself. For example, 01 has one leading zero and is invalid, but 0 is valid.
 * <p>
 * You may return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: N = 3, K = 7
 * Output: [181,292,707,818,929]
 * Explanation: Note that 070 is not a valid number, because it has leading zeroes.
 * Example 2:
 * <p>
 * Input: N = 2, K = 1
 * Output: [10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98]
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= N <= 9
 * 0 <= K <= 9
 *
 * @author Johnny
 */
public class Solution967 {
    public int[] numsSameConsecDiff(int N, int K) { //copy
        Set<Integer> cur = new HashSet<Integer>();
        for (int i = 1; i <= 9; ++i)
            cur.add(i);

        for (int steps = 1; steps <= N - 1; ++steps) {
            Set<Integer> cur2 = new HashSet<Integer>();
            for (int x : cur) {
                int d = x % 10;
                if (d - K >= 0)
                    cur2.add(10 * x + (d - K));
                if (d + K <= 9)
                    cur2.add(10 * x + (d + K));
            }

            cur = cur2;
        }

        if (N == 1)
            cur.add(0);

        int[] ans = new int[cur.size()];
        int t = 0;
        for (int x : cur)
            ans[t++] = x;
        Arrays.sort(ans);
        return ans;
    }
}
