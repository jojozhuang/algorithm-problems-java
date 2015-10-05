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
        
    }
}
