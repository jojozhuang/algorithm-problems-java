package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * Longest Substring with At Least K Repeating Characters
 * <p>
 * Find the length of the longest substring T of a given string (consists of
 * lowercase letters only) such that every character in T appears no less than k
 * times.
 * <p>
 * Example 1:
 * Input:
 * s = "aaabb", k = 3
 * Output:
 * 3
 * The longest substring is "aaa", as 'a' is repeated 3 times.
 * <p>
 * Example 2:
 * Input:
 * s = "ababbc", k = 2
 * Output:
 * 5
 * The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is
 * repeated 3 times.
 *
 * @author Johnny
 */
public class Solution395 {
    public int longestSubstring(String s, int k) {
        if (s == null || s.length() == 0 || k > s.length()) {
            return 0;
        }

        int[] count = new int[26];
        // record the frequency of each character
        for (int i = 0; i < s.length(); i += 1) {
            count[s.charAt(i) - 'a']++;
        }

        boolean flag = true;
        for (int i = 0; i < count.length; i += 1) {
            if (count[i] > 0 && count[i] < k) {
                flag = false;
            }
        }

        // return the length of string if the whole string is valid
        if (flag == true) {
            return s.length();
        }

        int result = 0;
        int start = 0, end = 0;
        // otherwise we use all the infrequent elements as splits
        while (end < s.length()) {
            if (count[s.charAt(end) - 'a'] < k) {
                result = Math.max(result, longestSubstring(s.substring(start, end), k));
                start = end + 1;
            }
            end++;
        }
        result = Math.max(result, longestSubstring(s.substring(start), k));
        return result;

    }

    public int longestSubstring2(String s, int k) {
        char[] str = s.toCharArray();
        int[] counts = new int[26];
        int h, i, j, idx, max = 0, unique, noLessThanK;

        for (h = 1; h <= 26; h++) {
            Arrays.fill(counts, 0);
            i = 0;
            j = 0;
            unique = 0;
            noLessThanK = 0;
            while (j < str.length) {
                if (unique <= h) {
                    idx = str[j] - 'a';
                    if (counts[idx] == 0)
                        unique++;
                    counts[idx]++;
                    if (counts[idx] == k)
                        noLessThanK++;
                    j++;
                } else {
                    idx = str[i] - 'a';
                    if (counts[idx] == k)
                        noLessThanK--;
                    counts[idx]--;
                    if (counts[idx] == 0)
                        unique--;
                    i++;
                }
                if (unique == h && unique == noLessThanK)
                    max = Math.max(j - i, max);
            }
        }

        return max;
    }
}
