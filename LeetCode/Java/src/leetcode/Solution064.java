/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Minimum Path Sum.
 * Given a m x n grid filled with non-negative numbers, find a path from top 
 * left to bottom right which minimizes the sum of all numbers along its path.
 * 
 * Note: You can only move either down or right at any point in time.
* 
 * @author Johnny
 */
public class Solution064 {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        // Define function, f[i][j] is the sum of minimum from top left.
        int[][] f = new int[grid.length][grid[0].length];
        // Initial
        f[0][0] = grid[0][0];
        for(int i = 1; i < grid.length; i++) {
            f[i][0] = f[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < grid[0].length; j++) {
            f[0][j] = f[0][j - 1] + grid[0][j];
        }
        
        // Calculate f[i][j];
        for(int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                f[i][j] = Math.min(f[i - 1][j], f[i][j - 1]) + grid[i][j];
            }
        }
        // Get result
        return f[grid.length - 1][grid[0].length - 1];
    }
    /*
    public int minPathSum(int[][] grid) {
        if (grid==null||grid.length==0||grid[0].length==0)
            return 0;
        
        int top;
        int left;
        int i = 0;
        int j = 0;
        for(i=0; i<grid.length; i++) {
            for(j=0; j<grid[0].length; j++) {
                if (i==0) {
                    if (j>0)
                        grid[i][j] = grid[i][j] + grid[i][j-1];
                    continue;
                }                   
                else
                    top = grid[i-1][j];
                if (j==0) {
                    if (i>0)
                        grid[i][j] = grid[i][j] + grid[i-1][j];
                    continue;
                }
                else
                    left = grid[i][j-1];
                
                if (top>=left)
                    grid[i][j] = grid[i][j] + left;
                else
                    grid[i][j] = grid[i][j] + top;
            }
        }
        
        return grid[i-1][j-1];
        
    }*/
}
