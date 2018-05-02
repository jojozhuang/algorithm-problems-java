package johnny.algorithm.leetcode;

/**
 * Interleaving String.
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
 *
 * For example,
 * Given:
 * s1 = "aabcc",
 * s2 = "dbbca",
 * 
 * When s3 = "aadbbcbcac", return true.
 * When s3 = "aadbbbaccc", return false.
 * 
 * @author Johnny
 */
public class Solution097 {
    //http://blog.csdn.net/u011095253/article/details/9248073
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1 == null || s2 == null || s3 == null) {
            return false;
        }
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        
        int len1 = s1.length();
        int len2 = s2.length();
        
        boolean[][] dp = new boolean[len1 + 1][len2 + 1];
        dp[0][0] = true;
        for(int i = 1; i <= len1; i++) {
            if (s1.charAt(i - 1) == s3.charAt(i - 1) && dp[i - 1][0]) {
                dp[i][0] = true;
            }
        }
        for(int j = 1; j <= len2; j++) {
            if (s2.charAt(j - 1) == s3.charAt(j - 1) && dp[0][j - 1]) {
                dp[0][j] = true;
            }
        }
        
        for(int i = 1; i <= len1; i++) {
            for(int j = 1; j <= len2; j++) {
                dp[i][j] = ((s3.charAt(i + j - 1) == s1.charAt(i - 1)) && dp[i - 1][j]);
                dp[i][j] |= ((s3.charAt(i + j - 1) == s2.charAt(j - 1)) && dp[i][j - 1]);
            }
        }
        
        return dp[len1][len2];
    }
    
    public boolean isInterleave2(String s1, String s2, String s3) {
        if (s1 == null || s2 == null || s3 == null) {
            return false;
        }
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        
        return helper(s1, 0, s2, 0, s3, 0);
    }
    
    private boolean helper(String s1, int p1, String s2, int p2, String s3, int p3) {
        if (p3 == s3.length()) {
            return true;
        }
        if (p1 == s1.length()) {
            return s2.substring(p2).equals(s3.substring(p3));
        }
        if (p2 == s2.length()) {
            return s1.substring(p1).equals(s3.substring(p3));
        }
        
        if (s1.charAt(p1) == s3.charAt(p3) && s2.charAt(p2) == s3.charAt(p3)) {
            return helper(s1, p1 + 1, s2, p2, s3, p3 + 1) ||
                   helper(s1, p1, s2, p2 + 1, s3, p3 + 1);
        }
        if (s1.charAt(p1) == s3.charAt(p3)) {
            return helper(s1, p1 + 1, s2, p2, s3, p3 + 1);
        }
        if (s2.charAt(p2) == s3.charAt(p3)) {
            return helper(s1, p1, s2, p2 + 1, s3, p3 + 1);
        }
        
        return false;
    }
}
