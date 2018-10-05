package johnny.algorithm.leetcode;

/**
 * Unique Paths.
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in
 * the diagram below).
 * 
 * The robot can only move either down or right at any point in time. The robot 
 * is trying to reach the bottom-right corner of the grid (marked 'Finish' in 
 * the diagram below).
 * 
 * How many possible unique paths are there?
 * 
 * Above is a 3 x 7 grid. How many possible unique paths are there?
 * 
 * Note: m and n will be at most 100.
 * 
 * @author Johnny
 */
public class Solution062 {
    // space: O(n)
    public int uniquePaths(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        }
        
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0) {
                    dp[j] = dp[j] + dp[j - 1];
                }
            }
        }
        
        return dp[n - 1];
    }
    // space: O(n)
    public int uniquePaths4(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        }
        
        int[] dp = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    dp[j] = 1;
                } else {
                    dp[j] = dp[j] + dp[j - 1];
                }
            }
        }
        
        return dp[n - 1];
    }
    
    // space, O(m*n)
    public int uniquePaths3(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        }
        
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
        }
        
        return dp[m - 1][n - 1];
    }
    
    // space, O(m*n)
    public int uniquePaths2(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        }
        
        // Define function, f[i][j] if the count of possible path from start point
        // to point [i][j], f[i][j] = f[i][j-1] + f[i-1][j]
        int[][] f = new int[m][n];
        // Initial
        for (int i = 0; i < m; i++) {
            f[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            f[0][j] = 1;
        }
        // Calculate f[i][j]
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                f[i][j] = f[i][j - 1] + f[i - 1][j];
            }
        }
        
        return f[m - 1][n - 1];
    }
}
