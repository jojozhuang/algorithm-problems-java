package johnny.algorithm.leetcode;

/**
 * Distinct Subsequences.
 * Given a string S and a string T, count the number of distinct subsequences 
 * of T in S.
 * 
 * A subsequence of a string is a new string which is formed from the original 
 * string by deleting some (can be none) of the characters without disturbing 
 * the relative positions of the remaining characters. (ie, "ACE" is a 
 * subsequence of "ABCDE" while "AEC" is not).
 * 
 * Here is an example:
 * S = "rabbbit", T = "rabbit"
 * 
 * Return 3.
 * 
 * @author Johnny
 */
public class Solution115 {
    //http://www.cnblogs.com/springfor/p/3896152.html
    public int numDistinct(String s, String t) {
        if (s == null || t == null) {
            return 0;
        }
        
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m + 1][n + 1];
        dp[0][0] = 1;
        
        // t is empty
        for(int i = 1; i <= m; i++) {
            dp[i][0] = 1;
        }
        
        // s is empty
        for(int j = 1; j <= n; j++) {
            dp[0][j] = 0;
        }        
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        return dp[m][n];
    }
    //time out
    public int numDistinct2(String s, String t) {
        if (s == null || t == null) {
            return 0;
        }
        if (s.length() < t.length()) {
            return 0;
        }
        if (t.length() == 0) {
            return 1;
        }
        
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(0)) {
                count += numDistinct(s.substring(i + 1), t.substring(1));
            }
        }
        
        return count;
    }    
}
