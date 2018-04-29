package johnny.algorithm.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
    // Sliding Window
    public int lengthOfLongestSubstring(String s) {
        // Empty check
        if (s == null || s.length() == 0){
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>(); // Store the index of each character
        // Initialization, which also handles the case that s has only one character
        map.put(s.charAt(0), 0);
        int max = 1;
        
        // Define the sliding window with i and j
        for (int i = 0, j = 1; j < s.length(); j++) {
            char c = s.charAt(j);
            if (map.containsKey(c) && map.get(c) >= i) {  // must compare with the current i, example case: s="abcdba"
                i = map.get(c) + 1;
            }
            map.put(c, j);
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
    public int lengthOfLongestSubstring3(String s) {
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
    
    //Brute Force
    public int lengthOfLongestSubstring2(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
}
