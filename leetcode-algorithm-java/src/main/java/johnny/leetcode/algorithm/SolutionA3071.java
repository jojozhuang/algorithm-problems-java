package johnny.leetcode.algorithm;

/**
 *
 */
public class SolutionA3071 {
    public int maxProductPath(int[][] grid) {
        int mod = 1000000000+7;
        int m = grid.length;
        int n = grid[0].length;
        long[][] dp1 = new long[m][n]; // max
        long[][] dp2 = new long[m][n]; // min
        dp1[0][0] = grid[0][0];
        dp2[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp1[i][0] = grid[i][0] * dp1[i-1][0];
            dp2[i][0] = grid[i][0] * dp2[i-1][0];
        }
        for (int j = 1; j < n; j++) {
            dp1[0][j] = grid[0][j] * dp1[0][j-1];
            dp2[0][j] = grid[0][j] * dp2[0][j-1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp1[i][j] = Math.max(Math.max(dp1[i-1][j] * (long)grid[i][j], dp1[i][j-1] * (long)grid[i][j]), Math.max(dp2[i-1][j] * (long)grid[i][j], dp2[i][j-1] * (long)grid[i][j]));
                dp1[i][j] = dp1[i][j] % mod;
                dp2[i][j] = Math.min(Math.min(dp1[i-1][j] * (long)grid[i][j], dp1[i][j-1] * (long)grid[i][j]), Math.min(dp2[i-1][j] * (long)grid[i][j], dp2[i][j-1] * (long)grid[i][j]));
                dp2[i][j] = dp2[i][j] % mod;
            }
        }

        long max = Math.max(dp1[m-1][n-1], dp2[m-1][n-1]);
        if (max < 0) {
            return -1;
        } else {
            return (int)max % mod;
        }
    }
}
