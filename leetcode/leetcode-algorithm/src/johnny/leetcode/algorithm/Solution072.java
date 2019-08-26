package johnny.leetcode.algorithm;

/**
 * Edit Distance.
 * Given two words word1 and word2, find the minimum number of steps required 
 * to convert word1 to word2. (each operation is counted as 1 step.)
 * 
 * You have the following 3 operations permitted on a word:
 * 
 * a) Insert a character
 * b) Delete a character
 * c) Replace a character
 * 
 * @author Johnny
 */
public class Solution072 {
    public int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        
        dp[0][0] = 0;
        for (int i = 1; i <= n1; i++) {
            dp[i][0] = i;
        }
        for (int j = 1; j <= n2; j++) {
            dp[0][j] = j;
        }
        
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        for (int i = 1; i <= n1; i++) {
            for (int j= 1; j <= n2; j++) {
                if (arr1[i-1] == arr2[j-1]) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
                }
            }
        }
        
        return dp[n1][n2];
    }
    
    public int minDistance2(String word1, String word2) {
        int len1 = 0, len2 =0;
        if (word1 != null) {
            len1 = word1.length();
        }  
        if (word2 != null) {
            len2 = word2.length();
        }
        if (len1 == 0 || len2 == 0) {
            return Math.max(len1, len2);
        }
        
        int[][] minD = new int[len1 + 1][len2 + 1];
        for (int i = 1; i <= len1; i++) {
            minD[i][0] = i;
        }
        for (int i = 1; i <= len2; i++) {
            minD[0][i] = i;
        }
        
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    minD[i + 1][j + 1] = Math.min(minD[i][j], 1 + Math.min(minD[i][j + 1], minD[i + 1][j]));
                } else {
                    minD[i + 1][j + 1] = Math.min(1 + minD[i][j], 1 + Math.min(minD[i][j + 1], minD[i + 1][j]));
                }
            }
        }
        
        return minD[len1][len2];
    }
}
