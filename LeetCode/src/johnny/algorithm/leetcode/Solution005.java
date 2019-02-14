package johnny.algorithm.leetcode;

/**
 * Longest Palindromic Substring.
 * Given a string S, find the longest palindromic substring in S. You may assume
 * that the maximum length of S is 1000, and there exists one unique longest 
 * palindromic substring.
 * 
 * @author Johnny
 */
public class Solution005 {
    private int low = 0, maxLen = 0;
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            extendPalindrome(s, i, i + 1);     // even
            extendPalindrome(s, i, i);         // odd
        }
        return s.substring(low, low + maxLen);
    }
    
    private void extendPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            } else {
                break;
            }
        }
        
        if (maxLen < right - left - 1) { // this also covers the scenario that left != right at first place
            low = left + 1;
            maxLen = right - left - 1;
        }
    }
    
    public String longestPalindrome44(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }
    
    private int expandAroundCenter(String s, int start, int end) {
        int left = start;
        int right = end;
        
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return right - left - 1;
    }
    
    public String longestPalindrome2(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String temp = palindrome(s, i, i);
            if (temp.length() > res.length()) {
                res = temp;
            }
            
            temp = palindrome(s, i, i + 1);
            if (temp.length() > res.length()) {
                res = temp;
            }
        }
        
        return res;
    }
    
    private String palindrome(String s, int start, int end) {
        int i = start;
        int j = end;
        
        while(i >= 0 && j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            } else {
                break;
            }
        }
        
        if (i + 1 > j) {
            return "";
        } else {
            return s.substring(i + 1, j);
        }
    }
}
