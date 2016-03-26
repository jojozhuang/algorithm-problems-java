/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Sparse Matrix Multiplication.
 * 
 * Given two sparse matrices A and B, return the result of AB.
 * 
 * You may assume that A's column number is equal to B's row number.
 * 
 * Example:
 * 
 * A = [
 *   [ 1, 0, 0],
 *   [-1, 0, 3]
 * ]
 * 
 * B = [
 *   [ 7, 0, 0 ],
 *   [ 0, 0, 0 ],
 *   [ 0, 0, 1 ]
 * ]
 * 
 *      |  1 0 0 |   | 7 0 0 |   |  7 0 0 |
 * AB = | -1 0 3 | x | 0 0 0 | = | -7 0 3 |
 *                   | 0 0 1 |
 * 
 * @author Johnny
 */
public class Solution311 {
    public int[][] multiply(int[][] A, int[][] B) {
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
