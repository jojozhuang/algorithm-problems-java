package johnny.leetcode.algorithm;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Russian Doll Envelopes.
 * You have a number of envelopes with widths and heights given as a pair of
 * integers (w, h). One envelope can fit into another if and only if both the
 * width and height of one envelope is greater than the width and height of the
 * other envelope.
 * <p>
 * What is the maximum number of envelopes can you Russian doll?
 * (put one inside other)
 * <p>
 * Example:
 * Given envelopes = [[5,4],[6,4],[6,7],[2,3]], the maximum number of envelopes
 * you can Russian doll is {@code 3 ([2,3] => [5,4] => [6,7])}.
 *
 * @author Johnny
 */
public class Solution354 {
    //https://segmentfault.com/a/1190000005739306
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length == 0 || envelopes[0].length == 0) {
            return 0;
        }

        Arrays.sort(envelopes, new Comparator<int[]>() {
            public int compare(int[] x, int[] y) {
                return x[0] - y[0];
            }
        });

        int[] dp = new int[envelopes.length];
        Arrays.fill(dp, 1);
        int res = 0;
        for (int i = 0; i < envelopes.length; i++) {
            for (int j = 0; j < i; j++) {
                if (envelopes[j][0] < envelopes[i][0] && envelopes[j][1] < envelopes[i][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }

        return res;
    }
}
