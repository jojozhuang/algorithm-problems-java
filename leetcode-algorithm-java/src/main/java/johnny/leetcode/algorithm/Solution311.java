package johnny.leetcode.algorithm;

/**
 * Sparse Matrix Multiplication.
 * <p>
 * Given two sparse matrices A and B, return the result of AB.
 * <p>
 * You may assume that A's column number is equal to B's row number.
 * <p>
 * Example:
 * <p>
 * A = [
 * [ 1, 0, 0],
 * [-1, 0, 3]
 * ]
 * <p>
 * B = [
 * [ 7, 0, 0 ],
 * [ 0, 0, 0 ],
 * [ 0, 0, 1 ]
 * ]
 * <p>
 * |  1 0 0 |   | 7 0 0 |   |  7 0 0 |
 * AB = | -1 0 3 | x | 0 0 0 | = | -7 0 3 |
 * | 0 0 1 |
 *
 * @author Johnny
 */
public class Solution311 {
    // Optimize by switching order of iterations over j and k 
    public int[][] multiply(int[][] A, int[][] B) {
        int[][] res = new int[][]{};
        if (A == null || A.length == 0 || A[0].length == 0 ||
                B == null || B.length == 0 || B[0].length == 0 ||
                A[0].length != B.length) {
            return res;
        }
        int m = A.length, n = A[0].length, nB = B[0].length;
        int[][] C = new int[m][nB];

        for (int i = 0; i < m; i++) {
            for (int k = 0; k < n; k++) { // iterating k first
                if (A[i][k] != 0) {
                    for (int j = 0; j < nB; j++) {
                        if (B[k][j] != 0) {
                            C[i][j] += A[i][k] * B[k][j];
                        }
                    }
                }
            }
        }
        return C;
    }

    // Brute force
    public int[][] multiply2(int[][] A, int[][] B) {
        int[][] res = new int[][]{};
        if (A == null || A.length == 0 || A[0].length == 0 ||
                B == null || B.length == 0 || B[0].length == 0 ||
                A[0].length != B.length) {
            return res;
        }

        int n = A.length;
        int m = B[0].length;
        res = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = 0;
                for (int k = 0; k < B.length; k++) {
                    sum += A[i][k] * B[k][j];
                }
                res[i][j] = sum;
            }
        }

        return res;
    }
}
