package johnny.algorithm.leetcode;

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
        List<Integer> res = new ArrayList<>();
        if(n <= 0) {
            return 0;
        }
            
        int [] columnVal = new int[n];
        
        dfs(n, 0, columnVal, res);
        return res.size();
    }
    
    private void dfs(int n, int row, int[] columnVal, List<Integer> res){
        if(row == n){            
            res.add(res.size() + 1);
        }else{
            for(int i = 0; i < n; i++){
                columnVal[row] = i;
                
                if(isValid(row, columnVal))
                    dfs(n, row + 1, columnVal, res);
            }
        }
    }
    
    private boolean isValid(int row, int [] columnVal){
        for(int i = 0; i < row; i++){
            if(columnVal[row] == columnVal[i] ||
               Math.abs(columnVal[row] - columnVal[i]) == row - i)
               return false;
        }
        return true;
    }
}
