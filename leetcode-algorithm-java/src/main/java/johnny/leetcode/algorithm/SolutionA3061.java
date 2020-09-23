package johnny.leetcode.algorithm;

/**
 *
 */
public class SolutionA3061 {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] row = new int[m];
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            row[i] = count;
        }

        int[] col = new int[n];
        for (int j = 0; j < n; j++) {
            int count = 0;
            for (int i = 0; i < m; i++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            col[j] = count;
        }

        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
