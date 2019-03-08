package johnny.algorithm.leetcode;

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
    // space: O(1)
    public boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0 || board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, i, j, word.toCharArray(), 0)) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    private boolean dfs(char[][] board, int x, int y, char[] word, int pos) {
        if (pos == word.length - 1) {
            return true;
        }
        int m = board.length;
        int n = board[0].length;

        char temp = board[x][y];
        board[x][y] = '0'; // set to other value
        int[] dr = new int[]{-1,1,0,0};
        int[] dc = new int[]{0,0,-1,1};
        boolean found = false;
        for (int i = 0; i < 4; i++) {
            int r = x + dr[i];
            int c = y + dc[i];
            if (r < 0 || r >= m || c < 0 || c >= n || word[pos + 1] != board[r][c]) {
                continue;
            }
            if (dfs(board, r, c, word, pos + 1)) {
                found = true;
                break;
            }
        }
        board[x][y] = temp;
        return found;
    }
    
    // space: O(m*n)
    public boolean exist2(char[][] board, String word) {
        if (word == null || word.length() == 0 || board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean[][] visited = new boolean[m][n];
                    if (dfs2(board, i, j, word.toCharArray(), 0, visited)) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    private boolean dfs2(char[][] board, int x, int y, char[] word, int pos, boolean[][] visited) {
        if (pos == word.length) {
            return true;
        }
        int m = board.length;
        int n = board[0].length;
        if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y] || word[pos] != board[x][y]) {
            return false;
        }
        visited[x][y] = true;
        int[] dr = new int[]{-1,1,0,0};
        int[] dc = new int[]{0,0,-1,1};
        for (int i = 0; i < 4; i++) {
            int r = x + dr[i];
            int c = y + dc[i];
            if (dfs2(board, r, c, word, pos + 1, visited)) {
                return true;
            }
        }
        visited[x][y] = false;
        return false;
    }
}
