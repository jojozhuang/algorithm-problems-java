package johnny.leetcode.algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 994. Rotting Oranges
 * In a given grid, each cell can have one of three values:
 * <p>
 * the value 0 representing an empty cell;
 * the value 1 representing a fresh orange;
 * the value 2 representing a rotten orange.
 * Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.
 * <p>
 * Return the minimum number of minutes that must elapse until no cell has a fresh orange.  If this is impossible, return -1 instead.
 * <p>
 * Example 1:
 * Input: [[2,1,1],[1,1,0],[0,1,1]]
 * Output: 4
 * <p>
 * Example 2:
 * Input: [[2,1,1],[0,1,1],[1,0,1]]
 * Output: -1
 * Explanation:  The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
 * <p>
 * Example 3:
 * Input: [[0,2]]
 * Output: 0
 * Explanation:  Since there are already no fresh oranges at minute 0, the answer is just 0.
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= grid.length <= 10
 * 1 <= grid[0].length <= 10
 * grid[i][j] is only 0, 1, or 2.
 * }</pre>
 *
 * @author Johnny
 */
public class Solution994 {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        int[] dr = new int[]{0, -1, 0, 1};
        int[] dc = new int[]{1, 0, -1, 0};

        int fresh = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[] {i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) {
            return 0;
        }

        int ans = 0;
        while (!queue.isEmpty()) {
            ans++;
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                int[] pos = queue.poll();
                for (int p = 0; p < 4; p++) {
                    int r = pos[0] + dr[p];
                    int c = pos[1] + dc[p];
                    if (r < 0 || r >= m || c < 0 || c >= n || grid[r][c] == 0 || grid[r][c] == 2) {
                        continue;
                    }
                    grid[r][c] = 2;
                    fresh--;
                    queue.offer(new int[] {r, c});
                }
                if (fresh <= 0) {
                    break;
                }
            }
            if (fresh <= 0) {
                break;
            }
        }

        return fresh <= 0 ? ans : -1;
    }

    public int orangesRotting2(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int one = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
                if (grid[i][j] == 1) {
                    one++;
                }
            }
        }

        // no 2
        if (queue.isEmpty()) {
            if (one == 0) {
                return 0;
            } else {
                return -1;
            }
        } else {
            // with 2 but no 1
            if (one == 0) {
                return 0;
            }
        }

        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] rotten = queue.poll();
                int r = rotten[0];
                int c = rotten[1];
                rot(grid, r - 1, c, queue);
                rot(grid, r + 1, c, queue);
                rot(grid, r, c - 1, queue);
                rot(grid, r, c + 1, queue);
            }
            ans++;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return ans - 1;
    }

    private void rot(int[][] grid, int r, int c, Queue<int[]> queue) {
        int m = grid.length;
        int n = grid[0].length;
        if (r < 0 || r >= m || c < 0 || c >= n || grid[r][c] == 0 || grid[r][c] == 2) {
            return;
        }

        queue.offer(new int[]{r, c});
        grid[r][c] = 2;
    }
}
