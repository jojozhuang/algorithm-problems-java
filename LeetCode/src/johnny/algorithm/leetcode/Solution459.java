package johnny.algorithm.leetcode;

/**
 * Repeated Substring Pattern
 * 
 * Given a non-empty string check if it can be constructed by taking a substring
 * of it and appending multiple copies of the substring together. You may assume
 * the given string consists of lowercase English letters only and its length 
 * will not exceed 10000.
 * 
 * Example 1:
 * Input: "abab"
 * 
 * Output: True
 * 
 * Explanation: It's the substring "ab" twice.
 * 
 * Example 2:
 * Input: "aba"
 * 
 * Output: False
 * 
 * Example 3:
 * Input: "abcabcabcabc"
 * 
 * Output: True
 * 
 * Explanation: It's the substring "abc" four times. (And the substring 
 * "abcabc" twice.)
 * 
 * @author Johnny
 */
public class Solution459 {
    public boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if ((n % (i + 1)) != 0) {
                continue;
            }
            String pattern = s.substring(0, i + 1);
            int j = i + 1;
            for (; j < n; j += pattern.length()) {
                if (!s.substring(j, j + pattern.length()).equals(pattern)) {
                    break;
                }
            }
            if (j >= n) {
                return true;
            }
        }
        
        return false;
    }
}
