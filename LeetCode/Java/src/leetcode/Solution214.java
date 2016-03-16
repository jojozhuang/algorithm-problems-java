/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Shortest Palindrome.
 * 
 * Given a string S, you are allowed to convert it to a palindrome by adding 
 * characters in front of it. Find and return the shortest palindrome you 
 * can find by performing this transformation.
 * 
 * For example:
 * 
 * Given "aacecaaa", return "aaacecaaa".
 * 
 * Given "abcd", return "dcbabcd".
 *  
 * @author RZHUANG
 */
public class Solution214 {
    public String shortestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        
        // the pivot must be in the left n/2 part
        int mid = s.length() / 2;
        for (int i = mid; i >= 0; i--) {
            int res = helper(s, i);
            if (res == 2 || res == 1) {
                return buildPalindrome(s, i, res);
            }
        }
        
        return buildPalindrome(s, 0, 0);
    }
    
    // 2: palindrome(even), 1: palindrome(odd), 0: not palindrome
    private int helper(String s, int pos) {
        //two case: even or odd (single element in the middle)
        //even first, one character shorter than odd, if both possible
        int left = pos;
        int right = pos + 1;
        if (isPalindrome(s, left, right)) {
            return 2;
        }
        //odd
        left = pos - 1;
        right = pos + 1;     
        if (isPalindrome(s, left, right)) {
            return 1;
        } else {
            return 0;
        }
    }
    
    private boolean isPalindrome(String s, int left, int right) {
        if (left > right || right >= s.length()) {
            return false;
        }
        while(left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left--;
                right++;
            }
        }
        
        if (right < s.length() && left == -1) {
            return true;
        } else if (right == s.length() && left == -1) {
            return true;
        } else {
            return false;
        }        
    }
    
    private String buildPalindrome(String s, int pos, int mode) {
        StringBuilder sb = new StringBuilder();
        
        int i = s.length() - 1;
        int len = 0;
        
        if (mode == 2) { // even
            len = s.length() - 2 * (pos + 1);
        } else if (mode == 1) { // odd
            len = s.length() - 2 * (pos + 1) + 1;
        } else {            
            len = s.length() - 1;            
        }
        
        while(len > 0) {
            sb.append(s.charAt(i));
            i--;
            len--;
        }
        return sb.toString() + s;
    }
}
