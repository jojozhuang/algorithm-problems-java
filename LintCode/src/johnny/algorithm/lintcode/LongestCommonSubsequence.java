/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode;

/**
 * Longest Common Subsequence.
 
 * Given two strings, find the longest common subsequence (LCS).
 * Your code should return the length of LCS
 * 
 * Example
 * For "ABCD" and "EDCA", the LCS is "A" (or "D", "C"), return 1.
 * For "ABCD" and "EACB", the LCS is "AC", return 2.
 *  
 * @author Johnny
 */
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String A, String B) {
        if (A == null || A.isEmpty() || B == null || B.isEmpty()) {
            return 0;
        }
        
        int[][] f = new int[A.length() + 1][B.length() + 1];
        
        for (int i = 1; i <= A.length(); i++) {
            for (int j = 1; j <= B.length(); j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    f[i][j] = f[i - 1][j - 1] + 1;
                } else {
                    f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]);
                }
            }
        }

        return f[A.length()][B.length()];
    }
}
