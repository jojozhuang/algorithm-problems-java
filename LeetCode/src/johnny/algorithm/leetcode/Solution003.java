/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Longest Substring Without Repeating Characters.
 * Given a string, find the length of the longest substring without repeating 
 * characters. For example, the longest substring without repeating letters for 
 * "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring
 * is "b", with the length of 1.
 * 
 * @author Johnny
 */
public class Solution003 {    
    public int lengthOfLongestSubstring(String s) {        
        if (s == null || s.length() == 0){
            return 0;
        }
   
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put(s.charAt(0), 0);
        
        int start = 0, end = 1;
        int max = 1;
        
        while (end < s.length()){
            char c = s.charAt(end);
            if (map.containsKey(c) && map.get(c) >= start){
                start = map.get(c) + 1;
            }
            map.put(c, end);
            max = Math.max(max, end - start + 1);
            end++;
        }
        return max;
    }  
}
