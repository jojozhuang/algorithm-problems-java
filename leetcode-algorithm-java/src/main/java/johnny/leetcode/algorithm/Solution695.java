package johnny.leetcode.algorithm;

/**
 * 695. Max Area of Island
 * Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land)
 * connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid
 * are surrounded by water.
 * <p>
 * Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area
 * is 0.)
 * <p>
 * Example 1:
 * [[0,0,1,0,0,0,0,1,0,0,0,0,0],
 * [0,0,0,0,0,0,0,1,1,1,0,0,0],
 * [0,1,1,0,1,0,0,0,0,0,0,0,0],
 * [0,1,0,0,1,1,0,0,1,0,1,0,0],
 * [0,1,0,0,1,1,0,0,1,1,1,0,0],
 * [0,0,0,0,0,0,0,0,0,0,1,0,0],
 * [0,0,0,0,0,0,0,1,1,1,0,0,0],
 * [0,0,0,0,0,0,0,1,1,0,0,0,0]]
 * Given the above grid, return 6. Note the answer is not 11, because the island must be connected
 * 4-directionally.
 * Example 2:
 * [[0,0,0,0,0,0,0,0]]
 * Given the above grid, return 0.
 * Note: The length of each dimension in the given grid does not exceed 50.
 *
 * @author Johnny
 */
public class Solution695 {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;

        int area = 0;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int[] count = new int[1];
                dfs(grid, i, j, visited, count);
                area = Math.max(area, count[0]);
            }
        }

        return area;
    }

    private void dfs(int[][] grid, int x, int y, boolean[][] visited, int[] count) {
        int m = grid.length;
        int n = grid[0].length;
        if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y] || grid[x][y] == 0) {
            return;
        }

        count[0]++;
        visited[x][y] = true;
        dfs(grid, x - 1, y, visited, count);
        dfs(grid, x + 1, y, visited, count);
        dfs(grid, x, y - 1, visited, count);
        dfs(grid, x, y + 1, visited, count);
    }

    public int maxAreaOfIsland2(int[][] grid) {
        int max_area = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] == 1) max_area = Math.max(max_area, AreaOfIsland(grid, i, j));
        return max_area;
    }

    public int AreaOfIsland(int[][] grid, int i, int j) {
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1) {
            grid[i][j] = 0;
            return 1 + AreaOfIsland(grid, i + 1, j) + AreaOfIsland(grid, i - 1, j) + AreaOfIsland(grid, i, j - 1) + AreaOfIsland(grid, i, j + 1);
        }
        return 0;
    }
}