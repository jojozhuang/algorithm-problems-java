package johnny.company.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Substrings of size K with K distinct chars
 *
 * Given a string s and an int k, return all unique substrings of s of size k with k distinct characters.
 *
 * Example 1:
 *
 * Input: s = "abcabc", k = 3
 * Output: ["abc", "bca", "cab"]
 * Example 2:
 *
 * Input: s = "abacab", k = 3
 * Output: ["bac", "cab"]
 * Example 3:
 *
 * Input: s = "awaglknagawunagwkwagl", k = 4
 * Output: ["wagl", "aglk", "glkn", "lkna", "knag", "gawu", "awun", "wuna", "unag", "nagw", "agwk", "kwag"]
 * Explanation:
 * Substrings in order are: "wagl", "aglk", "glkn", "lkna", "knag", "gawu", "awun", "wuna", "unag", "nagw", "agwk", "kwag", "wagl"
 * "wagl" is repeated twice, but is included in the output once.
 * Constraints:
 *
 * The input string consists of only lowercase English letters [a-z]
 * 0 ≤ k ≤ 26
 *
 * https://leetcode.com/discuss/interview-question/370112
 */
public class SubstringsKChars2 {
    public List<String> substringsKDistinctChars(String s, int k) {
        if (s == null || s.length() == 0) {
            return new ArrayList<>();
        }

        Set<String> set = new HashSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            boolean[] seen = new boolean[26];
            boolean valid = true;
            for (int j = i; j < i + k; j++) {
                if (seen[s.charAt(j) - 'a']) {
                    valid = false;
                    break;
                } else {
                    seen[s.charAt(j) - 'a'] = true;
                }
            }
            if (valid) {
                set.add(s.substring(i, i + k));
            }
        }

        return new ArrayList<>(set);
    }
}
