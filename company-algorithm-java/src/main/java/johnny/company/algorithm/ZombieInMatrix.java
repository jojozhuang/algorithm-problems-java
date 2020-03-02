package johnny.company.algorithm;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Zombie in Matrix
 * Given a 2D grid, each cell is either a zombie 1 or a human 0. Zombies can turn adjacent (up/down/left/right) human beings into zombies every hour. Find out how many hours does it take to infect all humans?
 *
 * Example:
 *
 * Input:
 * [[0, 1, 1, 0, 1],
 *  [0, 1, 0, 1, 0],
 *  [0, 0, 0, 0, 1],
 *  [0, 1, 0, 0, 0]]
 *
 * Output: 2
 *
 * Explanation:
 * At the end of the 1st hour, the status of the grid:
 * [[1, 1, 1, 1, 1],
 *  [1, 1, 1, 1, 1],
 *  [0, 1, 0, 1, 1],
 *  [1, 1, 1, 0, 1]]
 *
 * At the end of the 2nd hour, the status of the grid:
 * [[1, 1, 1, 1, 1],
 *  [1, 1, 1, 1, 1],
 *  [1, 1, 1, 1, 1],
 *  [1, 1, 1, 1, 1]]
 *
 * https://leetcode.com/discuss/interview-question/411357/
 */
public class ZombieInMatrix {
    public int minHours(List<List<Integer>> grid) {
        if (grid == null || grid.size() == 0 || grid.get(0).size() == 0) {
            return 0;
        }

        int m = grid.size();
        int n = grid.get(0).size();
        int[] dr = new int[]{0, -1, 0, 1};
        int[] dc = new int[]{1, 0, -1, 0};

        int zombie = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    zombie++;
                    queue.offer(new int[] {i, j});
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
                    if (r < 0 || r >= m || c < 0 || c >= n || grid.get(r).get(c) == 1) {
                        continue;
                    }
                    grid.get(r).set(c, 1);
                    queue.offer(new int[] {r, c});
                    zombie++;
                }
                if (zombie >= m * n) {
                    break;
                }
            }
            if (zombie >= m * n) {
                break;
            }
        }

        return zombie == m * n ? ans : -1;
    }

    public int minHours(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        int[] dr = new int[]{0, -1, 0, 1};
        int[] dc = new int[]{1, 0, -1, 0};

        int zombie = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    zombie++;
                    queue.offer(new int[] {i, j});
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
                    if (r < 0 || r >= m || c < 0 || c >= n || grid[r][c] == 1) {
                        continue;
                    }
                    grid[r][c] = 1;
                    queue.offer(new int[] {r, c});
                    zombie++;
                }
                if (zombie >= m * n) {
                    break;
                }
            }
            if (zombie >= m * n) {
                break;
            }
        }

        return zombie == m * n ? ans : -1;
    }
}
