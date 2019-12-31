package johnny.leetcode.algorithm;

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
        if (n <= 0) {
            return 0;
        }
        int[] cols = new int[n];
        int[] diag1 = new int[2*n-1];
        int[] diag2 = new int[2*n-1];
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += dfs(n, 0, i, cols, diag1, diag2);
        }
        return ans;
    }
    
    private int dfs(int n, int x, int y, int[] cols, int[] diag1, int[] diag2) {
        if (x == n - 1) {
            return 1;
        }
        int count = 0;
        cols[y] = 1;
        diag1[x+y] = 1;
        diag2[y-x+(n-1)] = 1;
        for (int i = 0; i < n; i++) {
            if (cols[i] == 0 && diag1[x+1+i] == 0 && diag2[i-(x+1)+(n-1)] == 0) {
                int res = dfs(n, x+1, i, cols, diag1, diag2);
                count += res;
            }
        }
        cols[y] = 0;
        diag1[x+y] = 0;
        diag2[y-x+(n-1)] = 0;
        return count;
    }
    
    
    public int totalNQueens2(int n) {
        List<Integer> res = new ArrayList<>();
        if(n <= 0) {
            return 0;
        }
            
        int [] columnVal = new int[n];
        
        dfs(n, 0, columnVal, res);
        return res.size();
    }
    
    private void dfs(int n, int row, int[] columnVal, List<Integer> res){
        if (row == n) {
            res.add(res.size() + 1);
        } else {
            for(int i = 0; i < n; i++){
                columnVal[row] = i;
                
                if(isValid(row, columnVal))
                    dfs(n, row + 1, columnVal, res);
            }
        }
    }
    
    private boolean isValid(int row, int [] columnVal){
        for (int i = 0; i < row; i++){
            if (columnVal[row] == columnVal[i] ||
               Math.abs(columnVal[row] - columnVal[i]) == row - i)
               return false;
        }
        return true;
    }
}
