/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Rotate Image.
 * You are given an n x n 2D matrix representing an image.
 * 
 * Rotate the image by 90 degrees (clockwise).
 * 
 * Follow up:
 * Could you do this in-place?
 *  
 * @author Johnny
 */
public class Solution048 {
    public void rotate(int[][] matrix) {
        if (matrix==null||matrix.length==0)
            return;
        
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] ret = new int[columns][rows];
        
        int i=0;
        int j=0;
        while(i<rows) {
            while(j<columns){
                ret[j][rows-i-1] = matrix[i][j];
                j++;
            }
            i++;
            j=0;
        }
        //assign back
        for(i=0; i<columns; i++){
            for(j=0; j<rows; j++){
                matrix[i][j] = ret[i][j];
            }
        } 
    }
    
    public int[][] rotate2(int[][] matrix) {
        if (matrix==null||matrix.length==0)
            return matrix;
        
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] ret = new int[columns][rows];
        
        int i=0;
        int j=0;
        while(i<rows) {
            while(j<columns){
                ret[j][rows-i-1] = matrix[i][j];
                j++;
            }
            i++;
            j=0;
        }
        
        return ret;
    }
}
