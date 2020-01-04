package johnny.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * 778. Swim in Rising Water
 * On an N x N grid, each square grid[i][j] represents the elevation at that point (i,j).
 * <p>
 * Now rain starts to fall. At time t, the depth of the water everywhere is t. You can swim from a square to another 4-directionally adjacent square if and only if the elevation of both squares individually are at most t. You can swim infinite distance in zero time. Of course, you must stay within the boundaries of the grid during your swim.
 * <p>
 * You start at the top left square (0, 0). What is the least time until you can reach the bottom right square (N-1, N-1)?
 * <p>
 * Example 1:
 * <p>
 * Input: [[0,2],[1,3]]
 * Output: 3
 * Explanation:
 * At time 0, you are in grid location (0, 0).
 * You cannot go anywhere else because 4-directionally adjacent neighbors have a higher elevation than t = 0.
 * <p>
 * You cannot reach point (1, 1) until time 3.
 * When the depth of water is 3, we can swim anywhere inside the grid.
 * Example 2:
 * <p>
 * Input: [[0,1,2,3,4],[24,23,22,21,5],[12,13,14,15,16],[11,17,18,19,20],[10,9,8,7,6]]
 * Output: 16
 * Explanation:
 * 0  1  2  3  4
 * 24 23 22 21  5
 * 12 13 14 15 16
 * 11 17 18 19 20
 * 10  9  8  7  6
 * <p>
 * The final route is marked in bold.
 * We need to wait until time 16 so that (0, 0) and (4, 4) are connected.
 * Note:
 * <p>
 * {@code 2 <= N <= 50.}
 * grid[i][j] is a permutation of [0, ..., N*N - 1].
 *
 * @author Johnny
 */
public class Solution778 {
    final static int[][] steps = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int swimInWater(int[][] grid) {
        int n = grid.length;
        Set<Integer> set = new HashSet<>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((k1, k2) -> grid[k1 / n][k1 % n] - grid[k2 / n][k2 % n]);
        pq.offer(0);
        int ans = 0;

        int[] dr = new int[]{1, -1, 0, 0};
        int[] dc = new int[]{0, 0, 1, -1};
        while (!pq.isEmpty()) {
            int k = pq.poll();
            int r = k / n;
            int c = k % n;
            ans = Math.max(ans, grid[r][c]);
            if (r == n - 1 && c == n - 1) {
                return ans;
            }

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                int ck = nr * n + nc;
                if (nr < 0 || nr >= n || nc < 0 || nc >= n || set.contains(ck)) {
                    continue;
                }
                pq.offer(ck);
                set.add(ck);
            }
        }

        throw null;
    }

    public int swimInWater2(int[][] grid) {
        int n = grid.length;
        int[][] max = new int[n][n];
        for (int[] line : max)
            Arrays.fill(line, Integer.MAX_VALUE);
        dfs(grid, max, 0, 0, grid[0][0]);
        return max[n - 1][n - 1];
    }

    private void dfs(int[][] grid, int[][] max, int x, int y, int cur) {
        int n = grid.length;
        if (x < 0 || x >= n || y < 0 || y >= n || Math.max(cur, grid[x][y]) >= max[x][y])
            return;
        max[x][y] = Math.max(cur, grid[x][y]);
        for (int[] s : steps) {
            dfs(grid, max, x + s[0], y + s[1], max[x][y]);
        }
    }
}
