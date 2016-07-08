/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Word Search.
 * Given a 2D board and a word, find if the word exists in the grid.
 * 
 * The word can be constructed from letters of sequentially adjacent cell, 
 * where "adjacent" cells are those horizontally or vertically neighboring. 
 * The same letter cell may not be used more than once.
 * 
 * For example,
 * Given board =
 * 
 * [
 *   ["ABCE"],
 *   ["SFCS"],
 *   ["ADEE"]
 * ]
 * word = "ABCCED", -> returns true,
 * word = "SEE", -> returns true,
 * word = "ABCB", -> returns false.
 * 
 * @author Johnny
 */
public class Solution079 {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        if (word == null || word.isEmpty()) {
            return true;
        }
        
        int m = board.length;
        int n = board[0].length;
        char[] w = word.toCharArray();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean[][] visited = new boolean[m][n];
                    if (dfs(board, i, j, w, 0, visited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private boolean dfs(char[][] board, int i, int j, char[] word, int pos, boolean[][] visited) {
        if (pos == word.length) {
            return true;
        }
        int m = board.length;
        int n = board[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j]) {
            return false;
        }

        if (board[i][j] != word[pos]) {
            return false;
        }

        visited[i][j] = true;
        if (dfs(board, i + 1, j, word, pos + 1, visited)){
            return true;
        }
        if (dfs(board, i - 1, j, word, pos + 1, visited)){
            return true;
        }
        if (dfs(board, i, j + 1, word, pos + 1, visited)){
            return true;
        }
        if (dfs(board, i, j - 1, word, pos + 1, visited)){
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
