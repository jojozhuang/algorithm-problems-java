package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Find All Anagrams in a String
 * <p>
 * Given a string s and a non-empty string p, find all the start indices of p's
 * anagrams in s.
 * <p>
 * Strings consists of lowercase English letters only and the length of both
 * strings s and p will not be larger than 20,100.
 * <p>
 * The order of output does not matter.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * s: "cbaebabacd" p: "abc"
 * <p>
 * Output:
 * [0, 6]
 * <p>
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 * <p>
 * Example 2:
 * <p>
 * Input:
 * s: "abab" p: "ab"
 * <p>
 * Output:
 * [0, 1, 2]
 * <p>
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 *
 * @author Johnny
 */
public class Solution438 {
    // optimized with sliding window concept
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return ans;
        }

        int[] count = new int[26];
        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        int[] find = new int[26];
        for (int i = 0; i <= s.length() - p.length(); i++) {
            if (i == 0) {
                for (int j = i; j < i + p.length(); j++) {
                    char c = s.charAt(j);
                    find[c - 'a']++;
                }
            } else {
                // remove the first one
                find[s.charAt(i - 1) - 'a']--;
                // add the last one
                find[s.charAt(i + p.length() - 1) - 'a']++;
            }
            if (Arrays.equals(count, find)) {
                ans.add(i);
            }
        }

        return ans;
    }

    // compare count
    public List<Integer> findAnagrams2(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return ans;
        }

        int[] count = new int[26];
        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        for (int i = 0; i <= s.length() - p.length(); i++) {
            int[] find = new int[26];
            for (int j = i; j < i + p.length(); j++) {
                char c = s.charAt(j);
                find[c - 'a']++;
            }
            if (Arrays.equals(count, find)) {
                ans.add(i);
            }
        }

        return ans;
    }

    // slide window + hashtable
    public List<Integer> findAnagrams3(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] count = new int[26];
        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        int fast = 0;
        int slow = 0;
        int[] window = new int[26];
        while (fast < s.length()) {
            window[s.charAt(fast) - 'a']++;
            if (fast - slow > p.length() - 1) {
                window[s.charAt(slow) - 'a']--;
                slow++;
            }
            if (fast - slow + 1 == p.length() &&
                    isSame(count, window)) {
                ans.add(slow);
            }
            fast++;
        }

        return ans;
    }

    private boolean isSame(int[] a1, int[] a2) {
        if (a1.length != a2.length) {
            return false;
        }

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }

        return true;
    }

    public List<Integer> findAnagrams4(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
        if (s == null || s.isEmpty() || p.length() > s.length()) {
            return res;
        }

        int[] counts = new int[26];
        for (int i = 0; i < p.length(); i++) {
            counts[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s.length() - p.length(); i++) {
            int[] countsCopy = counts.clone();
            for (int j = 0; j < p.length(); j++) {
                countsCopy[s.charAt(j + i) - 'a']--;
            }

            boolean isAnagrams = true;
            for (int k = 0; k < countsCopy.length; k++) {
                if (countsCopy[k] != 0) {
                    isAnagrams = false;
                    break;
                }
            }

            if (isAnagrams) {
                res.add(i);
            }
        }

        return res;
    }
}
