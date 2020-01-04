package johnny.leetcode.algorithm;

/**
 * Maximal Square.
 * <p>
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square
 * containing all 1's and return its area.
 * <p>
 * For example, given the following matrix:
 * <p>
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 * Return 4.
 *
 * @author Johnny
 */
public class Solution221 {
    // dp, O(m*n)
    public int maximalSquare3(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int size = 0;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j - 1]), dp[i - 1][j]) + 1;
                    size = Math.max(dp[i][j], size); // update result
                }
            }
        }
        return size * size;
    }

    // memorization, O(m*n*k), k = min(m,n);
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] sums = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sums[i][j] = sums[i - 1][j] + sums[i][j - 1] - sums[i - 1][j - 1] + (matrix[i - 1][j - 1] - '0');
            }
        }

        int ans = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = Math.min(m - i + 1, n - j + 1); k > 0; k--) {
                    int sum = sums[i + k - 1][j + k - 1]
                            - sums[i - 1][j + k - 1]
                            - sums[i + k - 1][j - 1]
                            + sums[i - 1][j - 1];
                    if (sum == k * k) {
                        ans = Math.max(ans, sum);
                        break;
                    }
                }
            }
        }

        return ans;
    }

    // brute force, O((m*n)^2)
    public int maximalSquare2(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int max = 0;
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    max = Math.max(max, 1);
                    int k = i + 1;
                    int l = j + 1;
                    while (k < m && l < n && matrix[k][l] == '1') {
                        boolean allone = true;
                        //check row
                        for (int p = j; p < l; p++) {
                            if (matrix[k][p] == '0') {
                                allone = false;
                                break;
                            }
                        }
                        if (!allone) {
                            break;
                        }
                        //check column
                        for (int q = i; q < k; q++) {
                            if (matrix[q][l] == '0') {
                                allone = false;
                                break;
                            }
                        }
                        if (!allone) {
                            break;
                        }
                        max = Math.max(max, (k - i + 1) * (l - j + 1));
                        k++;
                        l++;
                    }
                }
            }
        }

        return max;
    }
}
