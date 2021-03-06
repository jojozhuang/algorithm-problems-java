package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Longest Substring Without Repeating Characters.
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * <p>
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", which the length is 3.
 * Example 2:
 * <p>
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * @author Johnny
 */
public class Solution003 {
    // O(n)
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // <char, index>, last appearance
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, i);
                ans = Math.max(ans, i - start + 1);
            } else {
                if (start > map.get(c)) {
                    map.put(c, i);
                    ans = Math.max(ans, i - start + 1);
                } else {
                    start = map.get(c) + 1;
                    map.put(c, i);
                }
            }
        }

        return ans;
    }
    // Brute force: O(n^2)
    public int lengthOfLongestSubstring6(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> map = new HashMap<>(); // <char, count>
            map.put(s.charAt(i), 1);
            int j = i + 1;
            for (; j < s.length(); j++) {
                char c = s.charAt(j);
                if (!map.containsKey(c)) {
                    map.put(c, 1);
                } else {
                    if (map.get(c) > 0) {
                        ans = Math.max(ans, j - i);
                        break;
                    } else {
                        map.put(c, 1);
                    }
                }
            }
            if (j == s.length()) {
                ans = Math.max(ans, j - i);
                break;
            }
        }
        return ans;
    }

    public int lengthOfLongestSubstring5(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int left = 0;
        int right = 1;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put(s.charAt(0), 0);
        int longest = 1;
        while (right < s.length()) {
            if (!map.containsKey(s.charAt(right))) {
                longest = Math.max(longest, right - left + 1);
            } else {
                int prev = map.get(s.charAt(right));
                for (int i = left; i <= prev; i++) {
                    map.remove(s.charAt(i));
                }
                left = prev + 1;
            }
            map.put(s.charAt(right), right);
            right++;
        }

        return longest;
    }

    // template
    // https://leetcode.com/problems/find-all-anagrams-in-a-string/discuss/92007/sliding-window-algorithm-template-to-solve-all-the-leetcode-substring-search-problem
    public int lengthOfLongestSubstring4(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int longest = 0, count = 0, left = 0, right = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.get(ch) > 1) {
                count++;
            }
            right++;
            // count > 0 means repeating character
            while (count > 0) {
                char chLeft = s.charAt(left);
                if (map.get(chLeft) > 1) {
                    count--;
                }
                map.put(chLeft, map.get(chLeft) - 1);
                left++;
            }
            longest = Math.max(longest, right - left);
        }

        return longest;
    }

    // Sliding Window
    public int lengthOfLongestSubstring3(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int longest = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        while (right < s.length()) {
            char ch = s.charAt(right);
            if (map.containsKey(ch) && map.get(ch) >= left) { // index must be within the range of the sliding window
                left = map.get(ch) + 1;
            }
            map.put(ch, right);
            longest = Math.max(longest, right - left + 1);
            right++;
        }

        return longest;
    }

    //Brute Force
    public int lengthOfLongestSubstring2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j)) {
                    ans = Math.max(ans, j - i);
                }
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}
