package johnny.lintcode.algorithm;

/**
 * Word Search.
 * Given a 2D board and a word, find if the word exists in the grid.
 * 
 * The word can be constructed from letters of sequentially adjacent cell, 
 * where "adjacent" cells are those horizontally or vertically neighboring. 
 * The same letter cell may not be used more than once.
 * 
 * Example
 * Given board =
 * 
 * [
 *   "ABCE",
 *   "SFCS",
 *   "ADEE"
 * ]
 * word = "ABCCED", -> returns true,
 * word = "SEE", -> returns true,
 * word = "ABCB", -> returns false.
 * 
 * @author Johnny
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        // write your code here
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }

        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean[][] visisted = new boolean[m][n];
                    if (dfs(board, word, i, j, visisted)){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, boolean[][] visited) {
        int m = board.length;
        int n = board[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j]) {
            return false;
        }

        if (board[i][j] != word.charAt(0)) {
            return false;
        }
        
        if (word.length() == 1) {
            return true;
        }

        visited[i][j] = true;
        String next = word.substring(1);
        if (dfs(board, next, i + 1, j, visited)){
            return true;
        }
        if (dfs(board, next, i - 1, j, visited)){
            return true;
        }
        if (dfs(board, next, i, j + 1, visited)){
            return true;
        }
        if (dfs(board, next, i, j - 1, visited)){
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
