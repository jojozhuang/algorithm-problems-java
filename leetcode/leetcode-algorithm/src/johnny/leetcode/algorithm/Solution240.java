package johnny.leetcode.algorithm;

/**
 * Search a 2D Matrix II.
 * Write an efficient algorithm that searches for a value in an m x n matrix. 
 * This matrix has the following properties:
 *   1. Integers in each row are sorted in ascending from left to right.
 *   2. Integers in each column are sorted in ascending from top to bottom.
 * For example,
 * Consider the following matrix:
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * Given target = 5, return true.
 * Given target = 20, return false.
 * 
 * @author Johnny
 */
public class Solution240 {
    // Scan from bottom left to top right, O(m + n)
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        // Search from left bottom
        int row = matrix.length - 1;
        int col = 0;
        
        while(row >= 0 && col <= matrix[0].length - 1) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                row--;
            } else {
                col++;
            }
        }
        
        return false;
    }
}
