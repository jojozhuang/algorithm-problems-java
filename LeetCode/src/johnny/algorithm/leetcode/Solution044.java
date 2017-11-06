/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

/**
 * Wildcard Matching.
 * Implement wildcard pattern matching with support for '?' and '*'.
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 * 
 * The matching should cover the entire input string (not partial).
 * 
 * The function prototype should be:
 * 
 * Tool isMatch(const char *s, const char *p)
 * 
 * Some examples:
 * isMatch("aa","a") -> false
 * isMatch("aa","aa") -> true
 * isMatch("aaa","aa") -> false
 * isMatch("aa", "*") -> true
 * isMatch("aa", "a*") -> true
 * isMatch("ab", "?*") -> true
 * isMatch("aab", "c*a*b") -> false
 * 
 * @author Johnny
 */
public class Solution044 {
    //https://leetcode.com/discuss/89337/java-dp-accepted
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        
        char[] arrs = s.toCharArray();
        char[] arrp = p.toCharArray();
        int m = arrs.length;
        int n = arrp.length;
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        
        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j - 1] && arrp[j - 1] == '*';
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (arrs[i - 1] == arrp[j - 1] || arrp[j - 1] == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (arrp[j - 1] == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } 
            }
        }

        return dp[m][n];
    }
    //dp
    //https://www.youtube.com/watch?v=3ZDZ-N0EPV0
    public boolean isMatch3(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        
        char[] arrs = s.toCharArray();
        char[] arrp = p.toCharArray();        
        //remove duplicated *       
        int index = 0;
        boolean first = true;
        for (int i = 0; i < arrp.length; i++) {
            if (arrp[i] == '*') {
                if (first) {
                    arrp[index++] = arrp[i];
                    first = false;
                }
            } else {
                arrp[index++] = arrp[i];
                first = true;
            }
        }

        int m = s.length();
        int n = index;
        if (m == 0 && n == 0) {
            return true;
        } else if (m != 0 && n == 0) {
            return false;
        }
        
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        if (p.charAt(0) == '*') {
            dp[0][1] = true;
        }
        //first row = false and first column = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arrs[i] == arrp[j] || arrp[j] == '?') {
                    dp[i + 1][j + 1] = dp[i][j];
                } else if (arrp[j] == '*') {
                    dp[i + 1][j + 1] = dp[i][j + 1] || dp[i + 1][j];
                } else {
                    dp[i + 1][j + 1] = false;
                }
            }
        }

        return dp[m][n];
    }
    
    public boolean isMatch2(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        
        if (s.length() == 0|| p.length() == 0) {
            return false;
        }

        return helper(s, 0, p, 0);
    }

    private boolean helper(String s, int si, String p, int pj) {
        // index out of range check
        if (si == s.length() || pj == p.length()) {
            if (si == s.length() && pj == p.length()) {
                return true;
            } else {
                return false;
            }
        }

        if (p.charAt(pj) == '*') {
            // remove coninuous *
            while (p.charAt(pj) == '*') {
                pj++;
                // index out of range check
                if (pj == p.length()) return true;
            }

            // compare remaining part of p after * with s
            while (si < s.length() && !helper(s, si, p, pj)) {
                si++;
            }
            // substring of p equals to s
            return si != s.length();
        } else if (s.charAt(si) == p.charAt(pj) || p.charAt(pj) == '?') {
            return helper(s, si + 1, p, pj + 1);
        } else {
            return false;
        }
    }
}
