/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Spiral Matrix II.
 * Given an integer n, generate a square matrix filled with elements from 1 to
 * n2 in spiral order.
 * 
 * For example,
 * Given n = 3,
 * 
 * You should return the following matrix:
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 * 
 * @author Johnny
 */
public class Solution059 {
    public int[][] generateMatrix(int n) {
        if (n < 1) {
            return new int[][]{};
        }
        
        int[][] matrix = new int[n][n];
        
        int top=0;        
        int left=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        int i = 0;
        int index=1;

        while(top <= bottom && left <= right) {
            //left->right
            i = left;
            while(i <= right) {
                matrix[top][i] = index;
                index++;
                i++;                
            }
            top++;
            //top->bottom
            i = top;
            while(i <= bottom) {
                matrix[i][right] = index;
                index++;
                i++;
            }
            right--;
            //check
            if(top > bottom || left > right) {
                break;
            }
            //right->left
            i = right;
            while(i >= left) {
                matrix[bottom][i] = index;
                index++;
                i--;
            }
            bottom--;
            //bottom->top
            i = bottom;
            while(i >= top) {
                matrix[i][left] = index;
                index++;
                i--;
            }
            left++;
        }
        
        return matrix;
    } 
}
