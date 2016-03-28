/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Longest Palindromic Substring.
 * Given a string S, find the longest palindromic substring in S. You may assume
 * that the maximum length of S is 1000, and there exists one unique longest 
 * palindromic substring.
 * 
 * @author Johnny
 */
public class Solution005 {
    public String longestPalindrome(String s) {
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
