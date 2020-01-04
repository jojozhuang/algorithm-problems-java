package johnny.leetcode.algorithm;

/**
 * 1020. Number of Enclaves
 * <p>
 * Given a 2D array A, each cell is 0 (representing sea) or 1 (representing land)
 * <p>
 * A move consists of walking from one land square 4-directionally to another land square, or off the boundary of the grid.
 * <p>
 * Return the number of land squares in the grid for which we cannot walk off the boundary of the grid in any number of moves.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
 * Output: 3
 * Explanation:
 * There are three 1s that are enclosed by 0s, and one 1 that isn't enclosed because its on the boundary.
 * Example 2:
 * <p>
 * Input: [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
 * Output: 0
 * Explanation:
 * All 1s are either on the boundary or can reach the boundary.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 500
 * 1 <= A[i].length <= 500
 * 0 <= A[i][j] <= 1
 * All rows have the same size.
 *
 * @author Johnny
 */
public class SolutionA1020 {
    public int numEnclaves(int[][] A) {
        int m = A.length;
        int n = A[0].length;

        for (int i = 0; i < m; i++) {
            if (A[i][0] == 1) {
                clear(A, i, 0);
            }
            if (A[i][n - 1] == 1) {
                clear(A, i, n - 1);
            }
        }

        for (int j = 0; j < n; j++) {
            if (A[0][j] == 1) {
                clear(A, 0, j);
            }
            if (A[m - 1][j] == 1) {
                clear(A, m - 1, j);
            }
        }

        int area = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int[] count = new int[1];
                dfs(A, i, j, count);
                area += count[0];
            }
        }

        return area;
    }

    private void clear(int[][] grid, int x, int y) {
        int m = grid.length;
        int n = grid[0].length;

        if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0) {
            return;
        }

        grid[x][y] = 0;
        clear(grid, x - 1, y);
        clear(grid, x + 1, y);
        clear(grid, x, y - 1);
        clear(grid, x, y + 1);
    }

    private void dfs(int[][] grid, int x, int y, int[] count) {
        int m = grid.length;
        int n = grid[0].length;

        if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0) {
            return;
        }

        grid[x][y] = 0;
        count[0]++;
        dfs(grid, x - 1, y, count);
        dfs(grid, x + 1, y, count);
        dfs(grid, x, y - 1, count);
        dfs(grid, x, y + 1, count);
    }
}
