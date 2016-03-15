/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
 * @author RZHUANG
 */
public class Solution329 {
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                boolean[][] visited = new boolean[n][m];
                max = Math.max(max, dfs(matrix, i, j, matrix[i][j], visited));
            }
        }
        
        return max;        
    }
    
    private int dfs(int[][] matrix, int i, int j, int val, boolean[][] visited) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        if (i < 0 || i >= n || j < 0 || j >= m || visited[i][j]) {
            return 0;
        }
        
        if (matrix[i][j] < val) {
            return 0;
        }
        
        visited[i][j] = true;
        int top = dfs(matrix, i - 1, j, matrix[i][j] + 1, visited); //top
        int bottom = dfs(matrix, i + 1, j, matrix[i][j] + 1, visited); //bottom
        int left = dfs(matrix, i, j - 1, matrix[i][j] + 1, visited); //left
        int right = dfs(matrix, i, j + 1, matrix[i][j] + 1, visited); //rigth
        
        return Math.max(right,Math.max(left, Math.max(top, bottom))) + 1;        
    }
}
