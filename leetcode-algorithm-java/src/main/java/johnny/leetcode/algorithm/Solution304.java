package johnny.leetcode.algorithm;

/**
 * Range Sum Query 2D - Immutable.
 * <p>
 * Given a 2D matrix matrix, find the sum of the elements inside the rectangle
 * defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
 * <p>
 * Range Sum Query 2D
 * The above rectangle (with the red border) is defined by (row1, col1) = (2, 1)
 * and (row2, col2) = (4, 3), which contains sum = 8.
 * <p>
 * Example:
 * Given matrix = [
 * [3, 0, 1, 4, 2],
 * [5, 6, 3, 2, 1],
 * [1, 2, 0, 1, 5],
 * [4, 1, 0, 1, 7],
 * [1, 0, 3, 0, 5]
 * ]
 * <p>
 * sumRegion(2, 1, 4, 3) -> 8
 * sumRegion(1, 1, 2, 2) -> 11
 * sumRegion(1, 2, 2, 4) -> 12
 * Note:
 * You may assume that the matrix does not change.
 * There are many calls to sumRegion function.
 * You may assume that row1 ≤ row2 and col1 ≤ col2.
 *
 * @author Johnny
 */
public class Solution304 {
    //http://buttercola.blogspot.com/2015/12/leetcode-range-sum-query-2d-immutable.html
    private int[][] sum;

    public Solution304(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        sum = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (sum == null) {
            return 0;
        }
        if (row1 <= row2 && col1 <= col2) {
            return sum[row2 + 1][col2 + 1] - sum[row1][col2 + 1] - sum[row2 + 1][col1] + sum[row1][col1];
        } else {
            return 0;
        }
    }
    
    /*
    int m = 0;
    int n = 0;
    int[][] sum;
    public Solution304(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        m = matrix.length;
        n = matrix[0].length;
        sum = new int[m][n];
        sum[0][0] = matrix[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0) {
                    sum[i][j] = sum[i][j-1] + matrix[i][j];
                } else if (j == 0 && i > 0) {
                    sum[i][j] = sum[i-1][j] + matrix[i][j];
                } else if (i > 0 && j > 0){
                    sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + matrix[i][j];
                }
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (m == 0 || n == 0 ||
            row1 < 0 || row1 >= m || col1 < 0 || col2 >= n ||
            row1 > row2 || col1 > col2) {
            return 0;
        }
        
        if (row1 == 0 && col1 == 0) {
            return sum[row2][col2];
        }
        if (row1 == 0) {
            return sum[row2][col2] - sum[row2][col1 - 1];
        }
        if (col1 == 0) {
            return sum[row2][col2] - sum[row1 - 1][col2];
        }
        
        return sum[row2][col2] - sum[row2][col1 - 1] - sum[row1-1][col2] + sum[row1-1][col1-1];
    }*/
}
