package johnny.algorithm.leetcode;

/**
 * Regular Expression Matching.
 * Implement regular expression matching with support for '.' and '*'.
 * 
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * 
 * The matching should cover the entire input string (not partial).
 * 
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * 
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "a*") → true
 * isMatch("aa", ".*") → true
 * isMatch("ab", ".*") → true
 * isMatch("aab", "c*a*b") → true
 * 
 * @author Johnny
 */
public class Solution010 {
    //dp
    //https://www.youtube.com/watch?v=l3hda49XcDE
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
            if (arrp[j - 1] == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (arrs[i - 1] == arrp[j - 1] || arrp[j - 1] == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (arrp[j - 1] == '*') {
                    dp[i][j] = dp[i][j - 2];
                    if (arrp[j - 2] == '.' || arrp[j - 2] == arrs[i - 1]) {
                        dp[i][j] = dp[i - 1][j] || dp[i][j];
                    }
                } 
            }
        }

        return dp[m][n];
    }
    public boolean isMatch2(String s, String p) {
        if (s.isEmpty() && p.isEmpty())
            return true;
        if (!s.isEmpty() && p.isEmpty())
            return false;
        if (s.isEmpty() && !p.isEmpty())
            return false;
        
        if(p.indexOf('*') >=0)
            return true;
        
        char[] sArray = s.toCharArray();
        char[] pArray = p.toCharArray();
        int i=0;
        for(i=0; i<sArray.length; i++) {
            if (i>=pArray.length)
                return false;
            if (sArray[i] == pArray[i])
                continue;
            else {
                if(pArray[i] == '.')
                    continue;
                else if(pArray[i] == '*')
                    return true;
                else
                    return false;
            }
        }
        
        return true;
    }
}
