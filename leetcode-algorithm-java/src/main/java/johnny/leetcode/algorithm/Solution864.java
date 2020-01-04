package johnny.leetcode.algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 864. Shortest Path to Get All Keys
 * <p>
 * We are given a 2-dimensional grid. "." is an empty cell, "#" is a wall, "@" is the starting point, ("a", "b", ...) are keys, and ("A", "B", ...) are locks.
 * <p>
 * We start at the starting point, and one move consists of walking one space in one of the 4 cardinal directions.  We cannot walk outside the grid, or walk into a wall.  If we walk over a key, we pick it up.  We can't walk over a lock unless we have the corresponding key.
 * <p>
 * For some 1 <= K <= 6, there is exactly one lowercase and one uppercase letter of the first K letters of the English alphabet in the grid.  This means that there is exactly one key for each lock, and one lock for each key; and also that the letters used to represent the keys and locks were chosen in the same order as the English alphabet.
 * <p>
 * Return the lowest number of moves to acquire all keys.  If it's impossible, return -1.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: ["@.a.#","###.#","b.A.B"]
 * Output: 8
 * Example 2:
 * <p>
 * Input: ["@..aA","..B#.","....b"]
 * Output: 6
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= grid.length <= 30
 * 1 <= grid[0].length <= 30
 * grid[i][j] contains only '.', '#', '@', 'a'-'f' and 'A'-'F'
 * The number of keys is in [1, 6].  Each key has a different letter and opens exactly one lock.
 *
 * @author Johnny
 */
public class Solution864 {
    public int shortestPathAllKeys(String[] grid) {
        int sr = -1;
        int sc = -1;
        int keys = 0;

        int m = grid.length;
        int n = grid[0].length();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c = grid[i].charAt(j);
                if (c == '@') {
                    sr = i;
                    sc = j;
                } else if (c >= 'a' && c <= 'f') {
                    keys |= (1 << (c - 'a')); // 000011, a,b
                }
            }
        }

        int steps = 0;
        int[] dr = new int[]{-1, 1, 0, 0};
        int[] dc = new int[]{0, 0, -1, 1};
        int[][][] visited = new int[m][n][64];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr, sc, 0});
        visited[sr][sc][0] = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int q = 0; q < size; q++) {
                int[] point = queue.poll();
                if (point[2] == keys) {
                    return steps;
                }
                for (int i = 0; i < 4; i++) {
                    int r = point[0] + dr[i];
                    int c = point[1] + dc[i];
                    if (r < 0 || r >= m || c < 0 || c >= n || grid[r].charAt(c) == '#') {
                        continue;
                    }
                    char ch = grid[r].charAt(c);
                    if (ch >= 'A' && ch <= 'F' && (point[2] & (1 << (ch - 'A'))) == 0) {
                        continue;
                    }
                    if (ch >= 'a' && ch <= 'f') {
                        point[2] |= (1 << (ch - 'a'));
                    }
                    if (visited[r][c][point[2]] == 1) {
                        continue;
                    }
                    queue.offer(new int[]{r, c, point[2]});
                    visited[r][c][point[2]] = 1;
                }
            }
            steps++;
        }
        return -1;
    }
}
