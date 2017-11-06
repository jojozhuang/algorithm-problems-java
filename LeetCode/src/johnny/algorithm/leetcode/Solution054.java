/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Spiral Matrix.
 * Given a matrix of m x n elements (m rows, n columns), return all elements of 
 * the matrix in spiral order.
 * 
 * For example,
 * Given the following matrix:
 * 
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * You should return [1,2,3,6,9,8,7,4,5].
 * 
 * @author Johnny
 */
public class Solution054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<Integer>();
        }
        
        int top = 0;
        int left = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        int i = 0;

        while (top <= bottom && left <= right) {
            //left->right
            i = left;
            while (i <= right) {
                res.add(matrix[top][i]);
                i++;
            }
            top++;
            //top->bottom
            i = top;
            while (i <= bottom) {
                res.add(matrix[i][right]);
                i++;
            }
            right--;
            //check
            if (top > bottom || left > right) {
                break;
            }
            //right->left
            i = right;
            while (i >= left) {
                res.add(matrix[bottom][i]);
                i--;
            }
            bottom--;
            //bottom->top
            i = bottom;
            while (i >= top) {
                res.add(matrix[i][left]);
                i--;
            }
            left++;
        }
        
        return res;
    }
}
