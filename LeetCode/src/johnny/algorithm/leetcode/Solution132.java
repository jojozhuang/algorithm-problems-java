/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

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
        
        int len = s.length();
        int[] cut = new int[len + 1];                
        for(int i = 0; i < len + 1; i++) {
            cut[i] = i - 1;
        }
        
        boolean[][] mt = getMatrix(s);
        
        for(int i = 1; i < len + 1; i++) {
            for(int j = 0; j < i; j++) {
                if (mt[j][i - 1]) {
                    cut[i] = Math.min(cut[i], cut[j] + 1);
                }
            }
        }
        
        return cut[len];
    }
    
    private boolean[][] getMatrix(String s) {
        int len = s.length();
        boolean[][] res = new boolean[len][len];
        
        for (int j = 0; j < len; j++) {
            for (int i = 0; i <= j; i++) {
                if (i == j) {
                    res[i][j] = true;
                } else if (j == i + 1) {
                    res[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    res[i][j] = (s.charAt(i) == s.charAt(j)) && res[i + 1][j - 1];
                }
            }
        }
        
        return res;
    }
}
