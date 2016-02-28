/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Palindrome Partitioning II.
 * Given a string s, partition s such that every substring of the partition is 
 * a palindrome.
 * 
 * Return the minimum cuts needed for a palindrome partitioning of s.
 * 
 * For example, given s = "aab",
 * Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.
 * 
 * @author Johnny
 */
public class Solution132 {
    public int minCut(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        
        int[] f = new int[s.length()];
        f[0] = 0;
        
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String word = s.substring(j, i + 1);
                if (isPalindrome(word)) {
                    f[i] = f[j];
                } else {
                    f[i] = f[j] + 1;
                }
            }
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < f.length; i++) {
            if (min > f[i]) {
                min = f[i];
            }
        }
        
        return min;
    }
    
    private boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        
        while(start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
}
