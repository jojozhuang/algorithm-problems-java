/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.advanced;

/**
 * Longest Palindrome.
 * Find the longest palindrome from the given string.
 * Same partial step with 'Palindrome Partitioning II' of Q132 in leetcode.
 * 
 * @author Johnny
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        
        int n = s.length();
        boolean[][] res = new boolean[n][n];
        int max = 1; // at least 1 character.
        
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= j; i++) {
                if (i == j) {
                    res[i][j] = true;
                } else if (j == i + 1) {
                    res[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    res[i][j] = (s.charAt(i) == s.charAt(j)) && res[i + 1][j - 1];
                }
                if (res[i][j] == true) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        
        return max;
    }
}
