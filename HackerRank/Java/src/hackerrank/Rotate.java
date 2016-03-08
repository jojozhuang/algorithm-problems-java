/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author RZHUANG
 */
public class Rotate {    
    public void rotate(int n, int[][] matrix) {
        if (matrix == null || matrix.length != n || matrix[0].length != n) {
            System.out.println("ERROR");
            return;
        }
        
        int len = matrix.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1; j++) {
                swap(matrix, i, j, len - 1 - j, len - 1 - i);
            }
        }
        
        for (int i = 0; i < len / 2; i++) {
            for (int j = 0; j < len; j++) {
                swap(matrix, i, j, len - 1 - i, j);
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");                
            }
            System.out.println();
        }
    }
    
    private void swap(int[][] matrix, int row1, int col1, int row2, int col2) {
        int temp = matrix[row1][col1];
        matrix[row1][col1] = matrix[row2][col2];
        matrix[row2][col2] = temp;
    }
}
