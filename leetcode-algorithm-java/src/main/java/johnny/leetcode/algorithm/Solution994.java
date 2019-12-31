package johnny.leetcode.algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 994. Rotting Oranges
In a given grid, each cell can have one of three values:

the value 0 representing an empty cell;
the value 1 representing a fresh orange;
the value 2 representing a rotten orange.
Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange.  If this is impossible, return -1 instead.

Example 1:

Input: [[2,1,1],[1,1,0],[0,1,1]]
Output: 4
Example 2:

Input: [[2,1,1],[0,1,1],[1,0,1]]
Output: -1
Explanation:  The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
Example 3:

Input: [[0,2]]
Output: 0
Explanation:  Since there are already no fresh oranges at minute 0, the answer is just 0.
 

Note:

1 <= grid.length <= 10
1 <= grid[0].length <= 10
grid[i][j] is only 0, 1, or 2.

 * @author Johnny
 */
public class Solution994 {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int one = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i,j});
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

        queue.offer(new int[]{r,c});
        grid[r][c] = 2;
    }
}
