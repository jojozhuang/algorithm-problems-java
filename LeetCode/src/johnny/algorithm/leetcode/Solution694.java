package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *694. Number of Distinct Islands
 *Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

Count the number of distinct islands. An island is considered to be the same as another if and only if one island can be translated (and not rotated or reflected) to equal the other.

Example 1:
11000
11000
00011
00011
Given the above grid map, return 1.
Example 2:
11011
10000
00001
11011
Given the above grid map, return 3.

Notice that:
11
1
and
 1
11
are considered different island shapes, because we do not consider reflection / rotation.
Note: The length of each dimension in the given grid does not exceed 50.
 * @author Johnny
 */
public class Solution694 {
    public int numDistinctIslands(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        boolean[][] visited = new boolean[m][n];
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    List<Integer> list = new ArrayList<>();
                    dfs(grid, i, j, visited, list, 0);
                    set.add(list);
                }
            }
        }
        
        return set.size();
    }
    
    private void dfs(int[][] grid, int x, int y, boolean[][] visited, List<Integer> list, int seq) {
        int m = grid.length;
        int n = grid[0].length;
        if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y] || grid[x][y] == 0) {
            return;
        }
        visited[x][y] = true;
        list.add(seq);
        dfs(grid, x + 1, y, visited, list, 1);
        dfs(grid, x - 1, y, visited, list, 2);
        dfs(grid, x, y + 1, visited, list, 3);
        dfs(grid, x, y - 1, visited, list, 4);
        list.add(5); //back
    }
}