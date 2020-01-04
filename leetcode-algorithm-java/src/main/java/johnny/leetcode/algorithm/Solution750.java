package johnny.leetcode.algorithm;

/**
 * 750. Number Of Corner Rectangles
 * Given a grid where each entry is only 0 or 1, find the number of corner rectangles.
 * <p>
 * A corner rectangle is 4 distinct 1s on the grid that form an axis-aligned rectangle. Note that only the corners need to have the value 1. Also, all four 1s used must be distinct.
 * <p>
 * Example 1:
 * <p>
 * Input: grid =
 * [[1, 0, 0, 1, 0],
 * [0, 0, 1, 0, 1],
 * [0, 0, 0, 1, 0],
 * [1, 0, 1, 0, 1]]
 * Output: 1
 * Explanation: There is only one corner rectangle, with corners grid[1][2], grid[1][4], grid[3][2], grid[3][4].
 * <p>
 * Example 2:
 * <p>
 * Input: grid =
 * [[1, 1, 1],
 * [1, 1, 1],
 * [1, 1, 1]]
 * Output: 9
 * Explanation: There are four 2x2 rectangles, four 2x3 and 3x2 rectangles, and one 3x3 rectangle.
 * <p>
 * Example 3:
 * <p>
 * Input: grid =
 * [[1, 1, 1, 1]]
 * Output: 0
 * Explanation: Rectangles must have four distinct corners.
 *
 * @author Johnny
 */
public class Solution750 {
    // two rows first, then combination, O(n^2*m)
    public int countCornerRectangles(int[][] grid) {
        int ans = 0;
        // first line
        for (int i = 0; i < grid.length - 1; i++) {
            // second line
            for (int j = i + 1; j < grid.length; j++) {
                int counter = 0;
                // scan column
                for (int k = 0; k < grid[0].length; k++) {
                    if (grid[i][k] == 1 && grid[j][k] == 1) {
                        counter++;
                    }
                }
                // combination
                if (counter > 0) {
                    ans += counter * (counter - 1) / 2;
                }
            }
        }
        return ans;
    }

    // brute force, O((n*m)^2)
    public int countCornerRectangles2(int[][] grid) {
        if (grid == null || grid.length <= 1 || grid[0].length <= 1) {
            return 0;
        }

        int ans = 0;
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[0].length - 1; j++) {
                ans += isRectangle(grid, i, j);
            }
        }

        return ans;
    }

    private int isRectangle(int[][] grid, int row, int col) {
        int n = grid.length;
        int m = grid[0].length;

        // top left
        if (grid[row][col] == 0) {
            return 0;
        }

        int count = 0;
        for (int j = col + 1; j < m; j++) {
            // top right
            if (grid[row][j] == 1) {
                for (int i = row + 1; i < n; i++) {
                    // bottom right
                    if (grid[i][j] == 1) {
                        // bottom left
                        if (grid[i][col] == 1) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}
