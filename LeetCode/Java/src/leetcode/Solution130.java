/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Surrounded Regions.
 * Given a 2D board containing 'X' and 'O', capture all regions surrounded by 'X'.
 * 
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 * 
 * For example,
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * After running your function, the board should be:
 * 
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 * 
 * @author Johnny
 */
public class Solution130 {
    public void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        
        int n = board.length;
        int m = board[0].length;
        
        // find 'O's at the board
        for (int j = 0; j < m; j++) { 
            if (board[0][j] == 'O') { // top side
                dfs(board, 0, j, 'O', '#');
            }
            if (board[n - 1][j] == 'O') { // bottom side
                dfs(board, n - 1, j, 'O', '#');
            }
        }
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O') { // left side
                dfs(board, i, 0, 'O', '#');
            }
            if (board[i][m - 1] == 'O') { // right side
                dfs(board, i, m - 1, 'O', '#');
            }
        }
        
        // capture O with X
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (board[i][j] == 'O') {
                    dfs(board, i, j, 'O', 'X');
                }                
            }
        }
        //recover # to O
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == '#') {
                    dfs(board, i, j, '#', 'O');
                }                
            }
        }
        
    }
    
    // set adjacent cell from source to target
    private void dfs(char[][] board, int i, int j, char src, char tgt) {
        int n = board.length;
        int m = board[0].length;
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return;
        }
        
        if (board[i][j] == src) {
            board[i][j] = tgt;
            dfs(board, i - 1, j, src, tgt); // up
            dfs(board, i + 1, j, src, tgt); // down
            dfs(board, i, j - 1, src, tgt); // left
            dfs(board, i, j + 1, src, tgt); // right            
        }
    }
}
