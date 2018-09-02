package johnny.algorithm.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Longest Substring Without Repeating Characters.
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", which the length is 3.
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * @author Johnny
 */
public class Solution003 {
    // template
    // https://leetcode.com/problems/find-all-anagrams-in-a-string/discuss/92007/sliding-window-algorithm-template-to-solve-all-the-leetcode-substring-search-problem
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        int longest = 0, count = 0, left = 0, right = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if(map.get(ch) > 1) {
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
        if (s == null || s.length() == 0){
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
