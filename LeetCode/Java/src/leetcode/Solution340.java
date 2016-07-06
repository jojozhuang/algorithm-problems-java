/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest Substring with At Most K Distinct Characters.
 * 
 * Given a string, find the length of the longest substring T that contains at
 * most k distinct characters.
 * 
 * For example, Given s = “eceba” and k = 2,
 * 
 * T is "ece" which its length is 3.
 * 
 * @author Johnny
 */
public class Solution340 {
    //http://blog.csdn.net/whuwangyi/article/details/42451289
    public int lengthOfLongestSubstringKDistinct(String s, int k) {  
        int start = 0;  
        int maxLen = 0;  

        // Key: letter; value: the number of occurrences.  
        Map<Character, Integer> map = new HashMap<Character, Integer>();  
        int i;  
        for (i = 0; i < s.length(); ++i) {  
            char c = s.charAt(i);  
            if (map.containsKey(c)) {  
                map.put(c, map.get(c) + 1);  
            } else {  
                map.put(c, 1);  
                while (map.size() > k) {  
                    char startChar = s.charAt(start++);  
                    int count = map.get(startChar);  
                    if (count > 1) {  
                        map.put(startChar, count - 1);  
                    } else {  
                        map.remove(startChar);  
                    }  
                }  
            }  

            maxLen = Math.max(maxLen, i - start + 1);  
        }  

        return maxLen;  
    }  
}
