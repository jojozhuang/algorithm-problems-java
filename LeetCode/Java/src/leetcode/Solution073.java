/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;

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
    public int[][] setZeroes(int[][] matrix) {
        if (matrix==null||matrix.length==0||matrix[0].length==0)
            return matrix;
        
        int i=0;
        int j=0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        while(i<matrix.length) {
            j=0;
            while(j<matrix[0].length) {
                if (matrix[i][j]==0&&!map.containsKey(j)) {                    
                    for(int k=0; k<matrix[0].length; k++)
                        matrix[i][k] = 0;
                    for(int k=0; k<matrix.length; k++)
                        matrix[k][j] = 0;
                    map.put(j, j);
                    break;
                }
                j++;
            }
            i++;
        }
        
        return matrix;
    }
    
    public int[][] setZeroes2(int[][] matrix) {
        //use first row and first column to store status, O(m+n)
        if (matrix==null||matrix.length==0||matrix[0].length==0)
            return matrix;
        
        int i=0;
        int j=0;
        boolean firstrow=false;
        boolean firstcolumn=false;
        for(i=0; i<matrix.length; i++) {
            if (matrix[i][0]==0) {
                firstcolumn=true;
                break;
            }
        }
        for(j=0; j<matrix[0].length; j++) {
            if (matrix[0][j]==0) {
                firstrow=true;
                break;
            }
        }
        for(i=1; i<matrix.length; i++) {
            for(j=1; j<matrix[0].length; j++) {
                if (matrix[i][j]==0) {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        //set zero
        for(i=1; i<matrix.length; i++) {
            if (matrix[i][0]==0) {
                for(j=1; j<matrix[0].length; j++) {                
                    matrix[i][j]=0;
                }
            }
        }
        for(j=1; j<matrix[0].length; j++) {
            if (matrix[0][j]==0) {
                for(i=1; i<matrix.length; i++) {                
                    matrix[i][j]=0;
                }
            }
        }
        //first row
        if (firstrow==true) {
            for(j=0; j<matrix[0].length; j++) {
                matrix[0][j]=0;
            }
        }
        //first column
        if (firstcolumn==true) {
            for(i=0; i<matrix.length; i++) {
                matrix[i][0]=0;
            }
        }
        
        int[][] ret = new int[matrix.length][matrix[0].length];
        for(i=0; i<matrix.length; i++) {
            for(j=0; j<matrix[0].length; j++) {
                ret[i][j] = matrix[i][j];
            }
        }
        return ret;
    }
}
