/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Maximal Square.
 * 
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square 
 * containing all 1's and return its area.
 * 
 * For example, given the following matrix:
 * 
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 * Return 4.
 *  
 * @author Johnny
 */
public class Solution221 {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int max = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '1') {
                    max = Math.max(max, 1);
                    int k = i + 1;
                    int l = j + 1;
                    while (k < n && l < m && matrix[k][l] == '1') {
                        boolean allone = true;
                        //check row                        
                        for(int p = j; p < l; p++) {
                            if (matrix[k][p] == '0') {
                                allone = false;
                                break;
                            }
                        }
                        if (allone) {
                            //check column
                            for(int q = i; q < k; q++) {
                                if (matrix[q][l] == '0') {
                                    allone = false;
                                    break;
                                }
                            }
                        } 
                        
                        if (allone) {
                            max = Math.max(max, (k - i + 1) * (l - j + 1));
                            k++;
                            l++;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        
        return max;
    }
}
