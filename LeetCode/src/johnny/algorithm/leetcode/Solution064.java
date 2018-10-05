package johnny.algorithm.leetcode;

/**
 * 64. Minimum Path Sum
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

Example:

Input:
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
Output: 7
Explanation: Because the path 1→3→1→1→1 minimizes the sum.
* 
 * @author Johnny
 */
public class Solution064 {
    // space, O(n)
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int m = grid.length;
        int n = grid[0].length;
        
        int[] dp = new int[n];
        dp[0] = grid[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0) {
                    dp[j] = dp[j - 1] + grid[0][j];
                } else if (j == 0 && i > 0) {
                    dp[j] = dp[j] + grid[i][0];
                } else if (i > 0 && j > 0){
                    dp[j] = Math.min(dp[j - 1], dp[j]) + grid[i][j];
                }
            }
        }
        // Get result
        return dp[n - 1];
    }
    
    // space, O(m * n)
    public int minPathSum3(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int m = grid.length;
        int n = grid[0].length;
        
        // Define function, dp[i][j] is the sum of minimum from top left.
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0) {
                    dp[0][j] = dp[0][j - 1] + grid[0][j];
                } else if (j == 0 && i > 0) {
                    dp[i][0] = dp[i - 1][0] + grid[i][0];
                } else if (i > 0 && j > 0){
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
                }
            }
        }
        // Get result
        return dp[m - 1][n - 1];
    }
    
    // space, O(m * n)
    public int minPathSum2(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int m = grid.length;
        int n = grid[0].length;
        
        // Define function, dp[i][j] is the sum of minimum from top left.
        int[][] dp = new int[m][n];
        // Initial
        dp[0][0] = grid[0][0];
        for(int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        
        // Calculate dp[i][j];
        for(int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        // Get result
        return dp[m - 1][n - 1];
    }
}
