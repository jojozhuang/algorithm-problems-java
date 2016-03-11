/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Number of Islands.
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. 
 * An island is surrounded by water and is formed by connecting adjacent lands 
 * horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 * 
 * Example 1:
 * 
 * 11110
 * 11010
 * 11000
 * 00000
 * Answer: 1
 * 
 * Example 2:
 * 
 * 11000
 * 11000
 * 00100
 * 00011
 * Answer: 3
 * 
 * @author Johnny
 */
public class Solution200 {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int n = grid.length;
        int m = grid[0].length;
        int ret = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != '1') {
                    continue;
                }
                ret++;
                dfs(grid, i, j, n, m);
            }
        }  
        
        return ret;
    }
    
    // set adjacent cell to 0
    private void dfs(char[][] grid, int i, int j, int n, int m) {
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return;
        }
        
        if (grid[i][j] == '1') {
            grid[i][j] = '0';
            dfs(grid, i - 1, j, n, m); // up
            dfs(grid, i + 1, j, n, m); // down
            dfs(grid, i, j - 1, n, m); // left
            dfs(grid, i, j + 1, n, m); // right            
        }
    }
}
