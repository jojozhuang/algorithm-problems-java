/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Range Sum Query 2D - Mutable.
 * Given a 2D matrix matrix, find the sum of the elements inside the rectangle 
 * defined by its upper left corner (row1, col1) and lower right 
 * corner (row2, col2).
 * 
 * Range Sum Query 2D
 * The above rectangle (with the red border) is defined by (row1, col1) = (2, 1)
 * and (row2, col2) = (4, 3), which contains sum = 8.
 * 
 * Example:
 * 
 * Given matrix = [
 *   [3, 0, 1, 4, 2],
 *   [5, 6, 3, 2, 1],
 *   [1, 2, 0, 1, 5],
 *   [4, 1, 0, 1, 7],
 *   [1, 0, 3, 0, 5]
 * ]
 * 
 * sumRegion(2, 1, 4, 3) -> 8
 * update(3, 2, 2)
 * sumRegion(2, 1, 4, 3) -> 10
 * 
 * Note:
 * 
 * The matrix is only modifiable by the update function.
 * You may assume the number of calls to update and sumRegion function is 
 * distributed evenly.
 * You may assume that row1 ≤ row2 and col1 ≤ col2.
 * 
 * @author Johnny
 */
public class Solution308 {
    //http://www.cnblogs.com/yrbbest/p/5058571.html
    private int BIT2D[][];
    private int matrix[][];
    
    public Solution308(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return;
        }
        BIT2D = new int[matrix.length + 1][matrix[0].length + 1];
        this.matrix = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                update(i, j, matrix[i][j]);
            }
        }
    }

    public void update(int row, int col, int val) {
        int delta = val - matrix[row][col];
        matrix[row][col] = val;
        for(int i = row + 1; i < BIT2D.length; i += i & (-i)) {         //also equals to i |= i + 1
            for(int j = col + 1; j < BIT2D[0].length; j += j & (-j)) {
                BIT2D[i][j] += delta;
            }
        }
    }
    

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return getSum(row2 + 1, col2 + 1) - getSum(row1, col2 + 1) - getSum(row2 + 1, col1) + getSum(row1, col1); 
    }
    
    private int getSum(int row, int col) {
        int sum = 0;
        for(int i = row; i > 0; i -= i & (-i)) {
            for(int j = col; j > 0; j -= j & (-j)) {
                sum += BIT2D[i][j];
            }
        }
        return sum;
    }
}
