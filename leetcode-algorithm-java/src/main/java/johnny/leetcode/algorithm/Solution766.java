package johnny.leetcode.algorithm;

/**
 *766. Toeplitz Matrix
A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.

Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
 
Example 1:

Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
Output: True
Explanation:
1234
5123
9512

In the above grid, the diagonals are "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]", and in each diagonal all elements are the same, so the answer is True.
Example 2:

Input: matrix = [[1,2],[2,2]]
Output: False
Explanation:
The diagonal "[1, 2]" has different elements.
Note:

matrix will be a 2D array of integers.
matrix will have a number of rows and columns in range [1, 20].
matrix[i][j] will be integers in range [0, 99].
 * @author Johnny
 */
public class Solution766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix.length == 1 || matrix[0].length == 1) {
            return true;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        for (int k = m - 1; k >= 0; k--) {
            int first = matrix[k][0];
            int i = k;
            int j = 0;
            while (i < m && j < n) {
                if (matrix[i][j] != first) {
                    return false;
                }
                i++;
                j++;
            }
        }
        
        for (int k = 1; k < n; k++) {
            int first = matrix[0][k];
            int i = 0;
            int j = k;
            while (i < m && j < n) {
                if (matrix[i][j] != first) {
                    return false;
                }
                i++;
                j++;
            }
        }
        
        return true;
    }
    
    public boolean isToeplitzMatrix2(int[][] matrix) {
        if (matrix == null) {
            return false;
        }
        
        if (matrix.length <= 1) {
            return true;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        // check left bottom
        for (int i = 0; i < m; i++) {
            if(!checkDiagonal(matrix, i, 0)) {
                return false;
            }
        }
        // check right top
        for (int j = 1; j < n; j++) {
            if(!checkDiagonal(matrix, 0, j)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean checkDiagonal(int[][] matrix, int row, int col) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        if (row >= m || col >= n) {
            return false;
        }
        
        int val = matrix[row][col];

        for (int i = row + 1, j = col + 1; i < m && j < n; i++, j++) {
            if (matrix[i][j] != val) {
                return false;
            }
        }
        
        return true;
    }
}
