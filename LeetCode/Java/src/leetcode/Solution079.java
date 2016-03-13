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
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean[][] visited = new boolean[board.length][board[0].length];
                if (dfs(board, i, j, word, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean dfs(char[][] board, int row, int col, String word, boolean[][] visited) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col] == true) {
            return false;
        }
        
        if (board[row][col] != word.charAt(0)) {
            return false;
        }
        
        visited[row][col] = true;
        
        if (word.length() == 1) {
            return true;
        }
        
        String next = word.substring(1);
        //right
        if (dfs(board, row, col + 1, next, visited)) {
            return true;
        }
        //left
        if (dfs(board, row, col - 1, next, visited)) {
            return true;
        }
        //top
        if (dfs(board, row - 1, col, next, visited)) {
            return true;
        }
        //bottom
        if (dfs(board, row  + 1, col, next, visited)) {
            return true;
        }
            
        return false;        
    }
}
