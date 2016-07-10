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
    //https://leetcode.com/discuss/90455/neat-java-dfs-solution-with-memoization
    public int longestIncreasingPath(int[][] matrix) {
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
    }
}
