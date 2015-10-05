/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Search a 2D Matrix.
 * Write an efficient algorithm that searches for a value in an m x n matrix. 
 * This matrix has the following properties:
 * 
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * For example,
 * 
 * Consider the following matrix:
 * 
 * [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * Given target = 3, return true.
 * 
 * @author Johnny
 */
public class Solution074 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || 
            matrix[0] == null || matrix[0].length == 0) {
            return false;
        }
        
        int start = 0;
        int end = matrix.length * matrix[0].length - 1;
        int mid = 0;
        
        int row = 0;
        int col = 0;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            row = mid / matrix[0].length;
            col = mid % matrix[0].length;
            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] < target) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        
        row = start / matrix[0].length;
        col = start % matrix[0].length;
        if (matrix[row][col] == target) {
            return true;
        }
        
        row = end / matrix[0].length;
        col = end % matrix[0].length;
        if (matrix[row][col] == target) {
            return true;
        }
        
        return false;
    }
    /*
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix==null||matrix.length==0||matrix[0].length==0)
            return false;
        
        int top=0;
        int bottom=matrix.length-1;
        int row=0;
        int last;
        while(top<=bottom) {
            row = (top + bottom)/2;
            if (matrix[row][0]==target)
                return true;
            else if (matrix[row][0]>target) 
                bottom--;
            else {
                last = matrix[row][matrix[0].length-1];
                if (last==target)
                    return true;
                if (last>target)
                    break;
                else
                    top++;
            }
        }
        int left=0;
        int right=matrix[0].length-1;
        int column;
        while(left<=right) {
            column = (left + right)/2;
            if (matrix[row][column]==target)
                return true;
            else if (matrix[row][column]>target)
                right--;
            else
                left++;
        }
        
        return false;
    }    
    */
}
