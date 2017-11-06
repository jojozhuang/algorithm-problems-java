/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode;

import java.util.HashMap;

/**
 * Longest Substring Without Repeating Characters.
 * @author Johnny
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        // write your code here
        if (s == null || s.isEmpty()) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int start = 0;
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, i);
            } else {
                res = Math.max(res, i - start);
                start = Math.max(start, map.get(c) + 1);
                map.put(c, i);
            }
        }

        return Math.max(res, s.length() - start);
    }
}
