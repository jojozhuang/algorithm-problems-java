package johnny.lintcode.algorithm;

/**
 * Matrix Zigzag Traversal
 *
 * @author Johnny
 */
public class MatrixZigzagTraversal {
    public int[] printZMatrix(int[][] matrix) {
        // write your code here
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{};
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[] res = new int[m * n];

        int i = 0;
        int j = 0;
        boolean direction = false;
        int index = 0;
        while (i >= 0 && i < m && j >= 0 && j < n) {
            if (!direction) {
                res[index] = matrix[i][j];
                if (i == 0 || j == n - 1) {
                    direction = true;
                    if (j < n - 1) {
                        j++;
                    } else {
                        i++;
                    }
                } else {
                    if (0 == n - 1) {
                        i++;
                    } else {
                        i--;
                        j++;
                    }
                }
            } else {
                res[index] = matrix[i][j];
                if (j == 0 || i == m - 1) {
                    direction = false;
                    if (i < m - 1) {
                        i++;
                    } else {
                        j++;
                    }
                } else {
                    if (0 == m - 1) {
                        j++;
                    } else {
                        j--;
                        i++;
                    }
                }
            }
            index++;
        }

        return res;
    }
}
