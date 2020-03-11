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
    // Optimize by switching order of iterations over j and k, O(n^2)
    public int[][] multiply(int[][] A, int[][] B) {
        int[][] ans = new int[][]{};
        if (A == null || A.length == 0 || A[0].length == 0 ||
                B == null || B.length == 0 || B[0].length == 0 ||
                A[0].length != B.length) {
            return ans;
        }

        int m = A.length;
        int nB = B[0].length;
        int n = B.length; // A[0].length
        ans = new int[m][nB];

        for (int i = 0; i < m; i++) {
            for (int k = 0; k < n; k++) { // iterating k first
                if (A[i][k] != 0) {
                    for (int j = 0; j < nB; j++) {
                        if (B[k][j] != 0) {
                            ans[i][j] += A[i][k] * B[k][j];
                        }
                    }
                }
            }
        }
        return ans;
    }

    // Brute force, O(n^3)
    public int[][] multiply2(int[][] A, int[][] B) {
        int[][] ans = new int[][]{};
        if (A == null || A.length == 0 || A[0].length == 0 ||
                B == null || B.length == 0 || B[0].length == 0 ||
                A[0].length != B.length) {
            return ans;
        }

        int m = A.length;
        int nB = B[0].length;
        int n = B.length; // A[0].length
        ans = new int[m][nB];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < nB; j++) {
                for (int k = 0; k < n; k++) {
                    ans[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return ans;
    }
}
