package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 159. Longest Substring with At Most Two Distinct Characters
 * Given a string, find the length of the longest substring T that contains at most 2 distinct characters.
 * <p>
 * For example, Given s = “eceba”,
 * <p>
 * T is "ece" which its length is 3.
 * <p>
 * For example, Given s = “eceba”, T is "ece" which its length is 3.
 *
 * @author Johnny
 */
public class Solution159 {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s.length() < 1) return 0;
        HashMap<Character, Integer> index = new HashMap<Character, Integer>();
        int lo = 0;
        int hi = 0;
        int maxLength = 0;
        while (hi < s.length()) {
            if (index.size() <= 2) {
                char c = s.charAt(hi);
                index.put(c, hi);
                hi++;
            }
            if (index.size() > 2) {
                int leftMost = s.length();
                for (int i : index.values()) {
                    leftMost = Math.min(leftMost, i);
                }
                char c = s.charAt(leftMost);
                index.remove(c);
                lo = leftMost + 1;
            }
            maxLength = Math.max(maxLength, hi - lo);
        }
        return maxLength;
    }

    //http://blog.csdn.net/whuwangyi/article/details/42451289
    public int lengthOfLongestSubstringTwoDistinct2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int start = 0;
        int maxLen = 0;

        // Key: letter; value: the index of the last occurrence.  
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int i;
        for (i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (map.size() == 2 && !map.containsKey(c)) {
                // Pick the character with the leftmost last occurrence.  
                char charEndsMostLeft = ' ';
                int minLast = s.length();
                for (char ch : map.keySet()) {
                    int last = map.get(ch);
                    if (last < minLast) {
                        minLast = last;
                        charEndsMostLeft = ch;
                    }
                }

                map.remove(charEndsMostLeft);
                start = minLast + 1;
            }
            map.put(c, i);
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }
}
