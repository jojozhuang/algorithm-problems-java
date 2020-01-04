package johnny.leetcode.algorithm;

import java.util.List;

/**
 * Triangle.
 * Given a triangle, find the minimum path sum from top to bottom. Each step
 * you may move to adjacent numbers on the row below.
 * For example, given the following triangle
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 * Note:
 * Bonus point if you are able to do this using only O(n) extra space, where n
 * is the total number of rows in the triangle.
 *
 * @author Johnny
 */
public class Solution120 {
    // space: O(n)
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null) {
            return 0;
        }
        int m = triangle.size();
        int n = triangle.get(m - 1).size();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(m - 1).get(i);
        }

        for (int i = m - 2; i >= 0; i--) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < row.size(); j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + row.get(j);
            }
        }

        return dp[0];
    }

    // space: O(m*n)
    public int minimumTotal4(List<List<Integer>> triangle) {
        if (triangle == null) {
            return 0;
        }
        int m = triangle.size();
        int n = triangle.get(m - 1).size();
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) {
            dp[m - 1][i] = triangle.get(m - 1).get(i);
        }

        for (int i = m - 2; i >= 0; i--) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < row.size(); j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + row.get(j);
            }
        }

        return dp[0][0];
    }

    // DP, from bottom to top, space = O(n)
    public int minimumTotal3(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0 || triangle.get(0).size() == 0) {
            return 0;
        }

        int maxwidth = triangle.get(triangle.size() - 1).size();
        int[] dp = new int[maxwidth];
        // Initial
        for (int i = 0; i < maxwidth; i++) {
            // The minimum sum is it self for each point of the bottom line
            dp[i] = triangle.get(triangle.size() - 1).get(i);
        }
        // Calculate from bottom to top
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        // Get result
        return dp[0];
    }
    // Treat above triangle to another view
    // 2
    // 3 4
    // 6 5 7
    // 4 1 8 3
    // So, it is a two-dimensional array. And, for each point, it can only move 
    // down or right down.
    //

    // Solution1: DP, from bottom to top, space= O(m*n)
    public int minimumTotal2(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0 || triangle.get(0).size() == 0) {
            return 0;
        }

        int height = triangle.size();
        int maxwidth = triangle.get(height - 1).size();
        // Define f function, f[i][j] is the minimum sum from bottom to point i,j.
        int[][] dp = new int[height][maxwidth];
        // Initial
        for (int i = 0; i < maxwidth; i++) {
            // The minimum sum is it self for each point of the bottom line
            dp[height - 1][i] = triangle.get(height - 1).get(i);
        }
        // Calculate from bottom to top
        for (int i = height - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        // Get result
        return dp[0][0];
    }
    
    /*
    // Solution2: DP, from top to bottom
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0 || triangle.get(0).size() == 0) {
            return 0;
        }
        
        int height = triangle.size();
        int maxwidth = triangle.get(height - 1).size();
        // Define f function, f[i][j] is the sum from top to point i,j.
        int[][] f = new int[height][maxwidth]; 
        // Initial, first column
        for (int i = 0; i < height; i++) {
            // The minimum sum is it self for each point of the bottom line
            if (i == 0) {
                f[i][0] = triangle.get(i).get(0);
            }
            else {
                f[i][0] = f[i - 1][0] + triangle.get(i).get(0);
            }
        }

        // Calculate from top to bottom
        for (int i = 1; i < height; i++) {
            for(int j = 1; j < triangle.get(i).size(); j++) {
                if (j != triangle.get(i).size() - 1){ //not the last one
                    f[i][j] = Math.min(f[i - 1][j - 1], f[i - 1][j]) + triangle.get(i).get(j);
                }
                else {
                    f[i][j] = f[i - 1][j - 1] + triangle.get(i).get(j);
                }
            }
        }
        // Get result
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < maxwidth; i++) {
            // The minimum sum is it self for each point of the bottom line
            if (f[height - 1][i] < min) {
               min = f[height - 1][i];
            }
        }
        return min;
    }*/
}
