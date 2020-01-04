package johnny.leetcode.algorithm;

/**
 * Bomb Enemy.
 * <p>
 * Given a 2D grid, each cell is either a wall 'Y', an enemy 'X' or empty '0'
 * (the number zero), return the maximum enemies you can kill using one bomb.
 * The bomb kills all the enemies in the same row and column from the planted
 * point until it hits the wall since the wall is too strong to be destroyed.
 * Note that you can only put the bomb at an empty cell.
 * <p>
 * Example:
 * <p>
 * For the given grid
 * <p>
 * 0 X 0 0
 * X 0 Y X
 * 0 X 0 0
 * <p>
 * return 3. (Placing a bomb at (1,1) kills 3 enemies)
 *
 * @author Johnny
 */
public class Solution361 {
    public int maxKilledEnemies(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int max = 0;
        int row = 0;
        int[] col = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 'W') continue;
                if (j == 0 || grid[i][j - 1] == 'W') {
                    row = killedEnemiesRow(grid, i, j);
                }
                if (i == 0 || grid[i - 1][j] == 'W') {
                    col[j] = killedEnemiesCol(grid, i, j);
                }
                if (grid[i][j] == '0') {
                    max = (row + col[j] > max) ? row + col[j] : max;
                }
            }

        }

        return max;
    }

    //calculate killed enemies for row i from column j
    private int killedEnemiesRow(char[][] grid, int i, int j) {
        int num = 0;
        while (j <= grid[0].length - 1 && grid[i][j] != 'W') {
            if (grid[i][j] == 'E') num++;
            j++;
        }
        return num;
    }

    //calculate killed enemies for  column j from row i
    private int killedEnemiesCol(char[][] grid, int i, int j) {
        int num = 0;
        while (i <= grid.length - 1 && grid[i][j] != 'W') {
            if (grid[i][j] == 'E') num++;
            i++;
        }
        return num;
    }
}
