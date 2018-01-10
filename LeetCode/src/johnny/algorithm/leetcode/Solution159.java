package johnny.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest Substring with At Most Two Distinct Characters.
 * Given a string, find the length of the longest substring T that contains at
 * most 2 distinct characters.
 * 
 * For example, Given s = “eceba”, T is "ece" which its length is 3.
 * 
 * @author Johnny
 */
public class Solution159 {
    //http://blog.csdn.net/whuwangyi/article/details/42451289
    public int lengthOfLongestSubstringTwoDistinct(String s) {  
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
