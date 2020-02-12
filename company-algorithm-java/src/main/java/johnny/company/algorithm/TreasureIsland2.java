package johnny.company.algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Treasure Island 2
 * You have a map that marks the locations of treasure islands. Some of the map area has jagged rocks and dangerous reefs. Other areas are safe to sail in. There are other explorers trying to find the treasure. So you must figure out a shortest route to one of the treasure islands.
 *
 * Assume the map area is a two dimensional grid, represented by a matrix of characters. You must start from one of the starting point (marked as S) of the map and can move one block up, down, left or right at a time. The treasure island is marked as X. Any block with dangerous rocks or reefs will be marked as D. You must not enter dangerous blocks. You cannot leave the map area. Other areas O are safe to sail in. Output the minimum number of steps to get to any of the treasure islands.
 *
 * Example:
 *
 * Input:
 * [['S', 'O', 'O', 'S', 'S'],
 *  ['D', 'O', 'D', 'O', 'D'],
 *  ['O', 'O', 'O', 'O', 'X'],
 *  ['X', 'D', 'D', 'O', 'O'],
 *  ['X', 'D', 'D', 'D', 'O']]
 *
 * Output: 3
 * Explanation:
 * You can start from (0,0), (0, 3) or (0, 4). The treasure locations are (2, 4) (3, 0) and (4, 0). Here the shortest route is (0, 3), (1, 3), (2, 3), (2, 4).
 * Related problems:
 *
 * https://leetcode.com/problems/01-matrix
 *
 * https://leetcode.com/discuss/interview-question/356150
 */
public class TreasureIsland2 {
    public int findPath(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        int[] dr = new int[]{0, -1, 0, 1};
        int[] dc = new int[]{1, 0, -1, 0};

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m;  i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 'S') {
                    queue.offer(new int[]{i, j});
                    grid[i][j] = 'D';
                }
            }
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
                    if (r < 0 || r >= m || c < 0 || c >= n || grid[r][c] == 'D') {
                        continue;
                    }
                    if (grid[r][c] == 'X') {
                        return ans;
                    }
                    grid[r][c] = 'D';
                    queue.offer(new int[] {r, c});
                }
            }
        }

        return -1; // no solution
    }
}
