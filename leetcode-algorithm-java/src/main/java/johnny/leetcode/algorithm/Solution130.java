package johnny.leetcode.algorithm;

import java.util.LinkedList;
import java.util.Queue;

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
    //http://www.jiuzhang.com/solutions/surrounded-regions/
    public void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        
        int m = board.length;
        int n = board[0].length;
        
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int j = 0; j < n; j++) {
            enqueue(queue, board, 0, j);
            enqueue(queue, board, m - 1, j);
        }
        for (int i = 1; i < m - 1; i++) {
            enqueue(queue, board, i, 0);
            enqueue(queue, board, i, n - 1);
        }
        while(!queue.isEmpty()) {
            int index = queue.poll();
            int row = index / n;
            int col = index % n;
            if (board[row][col] == 'O') {
                board[row][col] = '#';
            }
            enqueue(queue, board, row - 1, col);
            enqueue(queue, board, row + 1, col);
            enqueue(queue, board, row, col - 1);
            enqueue(queue, board, row, col + 1);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Replaced 'O' with 'X'
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                // revert all '#' to 'O'
                if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }
    
    private void enqueue(Queue<Integer> queue, char[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;
        if (i >=0 && i < m && j >=0 && j < n && board[i][j] == 'O') {
            queue.offer(i * n + j);
        }
    }
    
    public void solve2(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        
        int m = board.length;
        int n = board[0].length;
        
        boolean[][] visited = new boolean[m][n];
        // find all linked 'O', replaced with '#'
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {
                helper(board, 0, j, visited);
            }
            if (board[m - 1][j] == 'O') {
                helper(board, m - 1, j, visited);
            }
        }
        for (int i = 1; i < m - 1; i++) {
            if (board[i][0] == 'O') {
                helper(board, i, 0, visited);
            }
            if (board[i][n - 1] == 'O') {
                helper(board, i, n - 1, visited);
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // find all isolated 'O', replaced with 'X'
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                // revert all '#' to 'O'
                if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }
    
    private void helper(char[][] board, int i, int j, boolean[][] visited) {
        int m = board.length;
        int n = board[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j] == true) {
            return;
        }
        
        if (board[i][j] == 'O') {
            board[i][j] = '#';
            visited[i][j] = true;
            helper(board, i - 1, j, visited); // up
            helper(board, i + 1, j, visited); // down
            helper(board, i, j - 1, visited); // left
            helper(board, i, j + 1, visited); // right
        } 
    }
}
