package johnny.lintcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * Longest AB Substring
 * Given a string s of only 'A' and 'B', find the longest substring that satisfies the number of 'A' and 'B' are
 * the same. Please output the length of this substring.
 *
 * This substring can be empty.
 * n is the length of s, 2<=n<=1000000.
 *
 * Example:
 * Example1
 * Input: s = "ABAAABBBA"
 * Output: 8
 * Explanation:
 * Substring s[0,7] and s[1,8] meet the conditions, their length is 8.
 *
 * Example2
 * Input: s = "AAAAAA"
 * Output: 0
 * Explanation:
 * No substring satisfies the condition except empty substring.
 *
 */
public class LongestABSubstring {
    /**
     * @param S: a String consists of a and b
     * @return: the longest of the longest string that meets the condition
     */

    // O(n^2)
    public int getAns(String S) {
        if (S == null || S.length() == 0) {
            return 0;
        }

        int n = S.length();
        int[] a = new int[n];
        int[] b = new int[n];
        a[0] = S.charAt(0) == 'A' ? 1 : 0;
        b[0] = S.charAt(0) == 'B' ? 1 : 0;
        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] + (S.charAt(i) == 'A' ? 1 : 0);
            b[i] = b[i - 1] + (S.charAt(i) == 'B' ? 1 : 0);
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i == 0) {
                    if (b[j] == a[j]) {
                        max = Math.max(max, j + 1);
                    }
                } else {
                    if (b[j] - b[i - 1] == a[j] - a[i - 1]) {
                        max = Math.max(max, j - i + 1);
                    }
                }
            }
        }

        return max;
    }
}
