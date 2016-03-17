/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * N-Queens II(picture not downloaded).
 * Follow up for N-Queens problem.
 * 
 * Now, instead outputting board configurations, return the total number of 
 * distinct solutions.
 * 
 * @author Johnny
 */
public class Solution052 {    
    public int totalNQueens(int n) {
        List<Integer> list = new ArrayList<>();
        if(n <= 0) {
            return 0;
        }
            
        int [] columnVal = new int[n];
        
        dfs(n,list,0,columnVal);
        return list.size();
    }
    
    private void dfs(int n, List<Integer> res, int row, int[] columnVal){
        if(row == n){            
            res.add(res.size() + 1);
        }else{
            for(int i = 0; i < n; i++){
                columnVal[row] = i;
                
                if(isValid(row, columnVal))
                    dfs(n, res, row+1, columnVal);
            }
        }
    }
    
    private boolean isValid(int row, int [] columnVal){
        for(int i = 0; i < row; i++){
            if(columnVal[row] == columnVal[i] || Math.abs(columnVal[row]-columnVal[i]) == row-i)
               return false;
        }
        return true;
    }
}
