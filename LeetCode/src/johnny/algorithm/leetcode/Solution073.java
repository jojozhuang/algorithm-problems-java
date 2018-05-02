package johnny.algorithm.leetcode;

/**
 * Set Matrix Zeroes.
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0.
 * Do it in place.
 * 
 * click to show follow up.
 * 
 * Follow up:
 * Did you use extra space?
 * A straight forward solution using O(mn) space is probably a bad idea.
 * A simple improvement uses O(m + n) space, but still not the best solution.
 * Could you devise a constant space solution?
 * 
 * @author Johnny
 */
public class Solution073 {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int col0 = 1, rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) col0 = 0;
            for (int j = 1; j < cols; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (col0 == 0) matrix[i][0] = 0;
        }
    }
    // space: m + n
    public void setZeroes3(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] row = new int[m];
        int[] col = new int[n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    //in place
    //http://www.programcreek.com/2012/12/leetcode-set-matrix-zeroes-java/
    public void setZeroes2(int[][] matrix) {
        //use first row and first column to store status, O(m+n)
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstrow = false;
        boolean firstcolumn = false;
        
        //set first row and column zero or not
        for(int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstcolumn = true;
                break;
            }
        }
        for(int j = 0; j < n; j++) {
            if (matrix[0][j]==0) {
                firstrow = true;
                break;
            }
        }
        
        //mark zeros on first row and column
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        //set zero
        for(int i = 1; i < m; i++) {
            if (matrix[i][0]==0) {
                for(int j = 1; j < n; j++) {
                    matrix[i][j]=0;
                }
            }
        }
        for(int j = 1; j < n; j++) {
            if (matrix[0][j]==0) {
                for(int i = 1; i < m; i++) {
                    matrix[i][j]=0;
                }
            }
        }
        //first row
        if (firstrow == true) {
            for(int j = 0; j < n; j++) {
                matrix[0][j]=0;
            }
        }
        //first column
        if (firstcolumn == true) {
            for(int i = 0; i < m; i++) {
                matrix[i][0]=0;
            }
        }
    }
}
