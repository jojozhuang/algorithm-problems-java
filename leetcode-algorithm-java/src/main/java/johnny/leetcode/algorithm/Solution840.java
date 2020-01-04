package johnny.leetcode.algorithm;

/**
 * 840. Magic Squares In Grid
 * A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9 such that each row, column, and both diagonals all have the same sum.
 * <p>
 * Given an grid of integers, how many 3 x 3 "magic square" subgrids are there?  (Each subgrid is contiguous).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [[4,3,8,4],
 * [9,5,1,9],
 * [2,7,6,2]]
 * Output: 1
 * Explanation:
 * The following subgrid is a 3 x 3 magic square:
 * 438
 * 951
 * 276
 * <p>
 * while this one is not:
 * 384
 * 519
 * 762
 * <p>
 * In total, there is only one magic square inside the given grid.
 * Note:
 * <pre>{@code
 * 1 <= grid.length <= 10
 * 1 <= grid[0].length <= 10
 * 0 <= grid[i][j] <= 15
 * }</pre>
 *
 * @author Johnny
 */
public class Solution840 {
    public int numMagicSquaresInside(int[][] grid) {
        if (grid == null || grid.length < 3 || grid[0].length < 3) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {
                int sum = grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2];
                if (isMagic(grid, i, j, sum)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isMagic(int[][] grid, int row, int col, int sum) {
        for (int i = row; i < row + 3; i++) {
            int temp = 0;
            for (int j = col; j < col + 3; j++) {
                if (grid[i][j] < 1 || grid[i][j] > 9) {
                    return false;
                }
                temp += grid[i][j];
            }
            if (temp != sum) {
                return false;
            }
        }
        for (int j = col; j < col + 3; j++) {
            int temp = 0;
            for (int i = row; i < row + 3; i++) {
                temp += grid[i][j];
            }
            if (temp != sum) {
                return false;
            }
        }

        int temp1 = grid[row + 2][col] + grid[row + 1][col + 1] + grid[row][col + 2];
        if (temp1 != sum) {
            return false;
        }
        return true;
    }
}
