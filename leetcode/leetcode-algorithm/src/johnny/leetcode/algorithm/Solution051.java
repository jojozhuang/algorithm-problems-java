package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * N-Queens(picture not downloaded).
 * 
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard
 * such that no two queens attack each other.
 * 
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 * 
 * Each solution contains a distinct board configuration of the n-queens' 
 * placement, where 'Q' and '.' both indicate a queen and an empty space 
 * respectively.
 * 
 * For example,
 * There exist two distinct solutions to the 4-queens puzzle:
 * 
 * [
 *  [".Q..",  // Solution 1
 *   "...Q",
 *   "Q...",
 *   "..Q."],
 *  ["..Q.",  // Solution 2
 *   "Q...",
 *   "...Q",
 *   ".Q.."]
 * ]
 * 
 * @author Johnny
 */
public class Solution051 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        if (n <= 0) {
            return ans;
        }
        int[] cols = new int[n];
        int[] diag1 = new int[2*n-1];
        int[] diag2 = new int[2*n-1];
        
        List<List<Integer>> sol = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(i);
            dfs(n, 0, i, cols, diag1, diag2, list, sol);
        }
        
        // construct answer
        for (List<Integer> list : sol) {
            List<String> str = new ArrayList<>();
            for (int i : list) {
                str.add(build(i, n));
            }
            ans.add(str);
        }
        return ans;
    }
    
    private void dfs(int n, int x, int y, int[] cols, int[] diag1, int[] diag2, List<Integer> list, List<List<Integer>> ans) {
        if (x == n - 1) {
            ans.add(new ArrayList<>(list));
            return;
        }
        cols[y] = 1;
        diag1[x+y] = 1;
        diag2[y-x+(n-1)] = 1;
        for (int i = 0; i < n; i++) {
            if (cols[i] == 0 && diag1[x+1+i] == 0 && diag2[i-(x+1)+(n-1)] == 0) {
                list.add(i);
                dfs(n, x+1, i, cols, diag1, diag2, list, ans);
                list.remove(list.size() - 1);
            }
        }
        cols[y] = 0;
        diag1[x+y] = 0;
        diag2[y-x+(n-1)] = 0;
    }
    
    private String build(int pos, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            if (i == pos) {
                s += "Q";
            } else {
                s += ".";
            }
        }
        return s;
    }
    
    //http://www.cnblogs.com/springfor/p/3870944.html
    public List<List<String>> solveNQueens2(int n) {
        List<List<String>> res = new ArrayList<List<String>>();
        if(n <= 0) {
            return res;
        }
            
        int[] columnVal = new int[n];
        dfs(n, 0, columnVal, res);
        
        return res;
    }
    
    private void dfs(int n, int row, int[] columnVal, List<List<String>> res){
        if (row == n){
            List<String> list = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if (j == columnVal[i]) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                
                list.add(sb.toString());
            }
            
            res.add(list);
        } else {
            for (int i = 0; i < n; i++) {
                columnVal[row] = i;
                if (isValid(row, columnVal)) {
                    dfs(n, row + 1, columnVal, res);
                }
            }
        }
    }
    
    private boolean isValid(int row, int[] columnVal){
        for (int i = 0; i < row; i++){
            if (columnVal[row] == columnVal[i] || 
               Math.abs(columnVal[row]-columnVal[i]) == row - i)
               return false;
        }
        return true;
    }
}
