package johnny.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Isomorphic Strings.
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * 
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 * 
 * For example,
 * Given "egg", "add", return true.
 * 
 * Given "foo", "bar", return false.
 * 
 * Given "paper", "title", return true.
 *  * 
 * Note:
 * You may assume both s and t have the same length.
 * 
 * @author Johnny
 */
public class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        if (s.isEmpty() && t.isEmpty()) {
            return true;
        }
        
        int[] m1 = new int[256], m2 = new int[256]; 
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) {
                return false;
            }
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }
    //HashMap
    public boolean isIsomorphic2(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        if (s.isEmpty() && t.isEmpty()) {
            return true;
        }
        
        Map<Character, Character> map = new HashMap<Character, Character>();
        
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))){
                if (map.containsValue(t.charAt(i))) {
                    return false;
                } else {
                    map.put(s.charAt(i), t.charAt(i));
                }
            } else {
                char c = map.get(s.charAt(i));
                if (c != t.charAt(i)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
