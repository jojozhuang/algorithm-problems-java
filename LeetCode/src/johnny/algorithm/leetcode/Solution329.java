package johnny.algorithm.leetcode;

/**
 * Longest Increasing Path in a Matrix.
 * 
 * Given an integer matrix, find the length of the longest increasing path.
 * 
 * From each cell, you can either move to four directions: left, right, up or
 * down. You may NOT move diagonally or move outside of the boundary 
 * (i.e. wrap-around is not allowed).
 * 
 * Example 1:
 * 
 * nums = [
 *   [9,9,4],
 *   [6,6,8],
 *   [2,1,1]
 * ]
 * 
 * Return 4
 * The longest increasing path is [1, 2, 6, 9].
 * 
 * Example 2:
 * 
 * nums = [
 *   [3,4,5],
 *   [3,2,6],
 *   [2,2,1]
 * ]
 * Return 4
 * 
 * The longest increasing path is [3, 4, 5, 6]. Moving diagonally is not allowed.
 *  
 * @author Johnny
 */
public class Solution329 {
    // dfs + memorization
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] cache = new int[m][n];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, dfs(matrix, i, j, cache));
            }
        }
        
        return ans;
    }
    
    private int dfs(int[][] matrix, int i, int j, int[][] cache) {
        if (cache[i][j] > 0) {
            return cache[i][j];
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[] dr = new int[]{-1,1,0,0};
        int[] dc = new int[]{0,0,-1,1};
        cache[i][j] = 1;
        for (int k = 0; k < 4; k++) {
            int r = i + dr[k];
            int c = j + dc[k];
            if (r < 0 || r >= m || c < 0 || c >= n || matrix[r][c] <= matrix[i][j]) {
                continue;
            }
            cache[i][j] = Math.max(cache[i][j], 1 + dfs(matrix, r, c, cache));
        }
        return cache[i][j];
    }
    
    // brute force, TLE
    public int longestIncreasingPath3(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];
        int[] max = new int[1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                visited[i][j] = true;
                dfs(matrix, i, j, visited, 1, max);
            }
        }
        
        return max[0];
    }
    
    private void dfs(int[][] matrix, int sr, int sc, boolean[][] visited, int steps, int[] max) {
        if (steps > max[0]) {
            max[0] = steps;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[] dr = new int[]{-1,1,0,0};
        int[] dc = new int[]{0,0,-1,1};
        for (int i = 0; i < 4; i++) {
            int r = sr + dr[i];
            int c = sc + dc[i];
            if (r < 0 || r >= m || c < 0 || c >= n || matrix[r][c] <= matrix[sr][sc]) {
                continue;
            }
            visited[r][c] = true;
            dfs(matrix, r, c, visited, steps+1, max);
            visited[r][c] = false;
        }
    }
    
    /*
    //https://leetcode.com/discuss/90455/neat-java-dfs-solution-with-memoization
    public int longestIncreasingPath2(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int max = 0;
        int[][] cache = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max, dfs(matrix, i, j, cache));
            }
        }
        
        return max;
    }

    private int dfs(int[][] matrix, int i, int j, int[][] cache) {
        if (cache[i][j] > 0) {
            return cache[i][j];
        } 
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int longest = 0;
        if (i > 0 && matrix[i - 1][j] > matrix[i][j]) {
            longest = Math.max(longest, dfs(matrix, i - 1, j, cache)); //up
        }
        if (i < m - 1 && matrix[i + 1][j] > matrix[i][j]) {
            longest = Math.max(longest, dfs(matrix, i + 1, j, cache)); //down
        }
        if (j > 0 && matrix[i][j - 1] > matrix[i][j]) {
            longest = Math.max(longest, dfs(matrix, i, j - 1, cache)); //left
        }
        if (j < n - 1 && matrix[i][j + 1] > matrix[i][j]) {
            longest = Math.max(longest, dfs(matrix, i, j + 1, cache)); //right
        }
        cache[i][j] = longest + 1;
        return longest + 1;
    }*/
}
