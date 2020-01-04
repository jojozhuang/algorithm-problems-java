package johnny.leetcode.algorithm;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Number of Islands.
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands
 * horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 * <p>
 * Example 1:
 * <p>
 * 11110
 * 11010
 * 11000
 * 00000
 * Answer: 1
 * <p>
 * Example 2:
 * <p>
 * 11000
 * 11000
 * 00100
 * 00011
 * Answer: 3
 *
 * @author Johnny
 */
public class Solution200 {
    // BFS: change values of given grid, space: min(m,n), time: (m*n)
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        int[] dr = new int[]{0, -1, 0, 1};
        int[] dc = new int[]{1, 0, -1, 0};
        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    Queue<int[]> queue = new LinkedList<>();
                    queue.offer(new int[]{i, j});
                    while (!queue.isEmpty()) {
                        Set<Integer> set = new HashSet<>();
                        int size = queue.size();
                        for (int k = 0; k < size; k++) {
                            int[] pos = queue.poll();
                            grid[pos[0]][pos[1]] = '0';
                            for (int p = 0; p < 4; p++) {
                                int r = pos[0] + dr[p];
                                int c = pos[1] + dc[p];
                                if (r < 0 || r >= m || c < 0 || c >= n || grid[r][c] == '0') {
                                    continue;
                                }
                                if (!set.contains(r * n + c)) {
                                    queue.offer(new int[]{r, c});
                                    set.add(r * n + c);
                                }
                            }
                        }
                    }
                }
            }
        }

        return ans;
    }

    // DFS: change values of given grid, space: O(1), time: (m*n)
    public int numIslands2(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    dfs(grid, i, j);
                }
            }
        }

        return ans;
    }

    // set adjacent cell to 0
    private void dfs(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }

        if (grid[i][j] == '1') {
            grid[i][j] = '0';
            dfs(grid, i - 1, j); // up
            dfs(grid, i + 1, j); // down
            dfs(grid, i, j - 1); // left
            dfs(grid, i, j + 1); // right
        }
    }

    // DFS: space: O(m*n), time: (m*n)
    public int numIslands3(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid, i, j, visited);
                    ans++;
                }
            }
        }

        return ans;
    }

    private void dfs(char[][] grid, int r, int c, boolean[][] visited) {
        int m = grid.length;
        int n = grid[0].length;
        if (r < 0 || r >= m || c < 0 || c >= n || visited[r][c] || grid[r][c] == '0') {
            return;
        }

        visited[r][c] = true;
        dfs(grid, r - 1, c, visited); // up
        dfs(grid, r + 1, c, visited); // down
        dfs(grid, r, c - 1, visited); // left
        dfs(grid, r, c + 1, visited); // right
    }

    // union find
    //https://discuss.leetcode.com/topic/47691/easy-to-understand-simplify-java-union-find-version
    public int numIslands4(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        int[] dx = new int[]{-1, 0, 1, 0}; //top, right, bottom, left
        int[] dy = new int[]{0, 1, 0, -1};

        UF uf = new UF(grid);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    for (int k = 0; k < 4; k++) {
                        int row = i + dx[k];
                        int col = j + dy[k];
                        uf.union(i, j, row, col);
                    }
                }
            }
        }

        return uf.count;
    }

    class UF {
        int count = 0;
        int[] parent;
        int m = 0;
        int n = 0;
        char[][] mygrid;

        public UF(char[][] grid) {
            mygrid = grid;
            m = grid.length;
            n = grid[0].length;
            // initial, set parent to itself
            parent = new int[m * n];
            for (int i = 0; i < parent.length; i++) {
                parent[i] = i;
            }
            // calcuate count of islands
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1') {
                        count++;
                    }
                }
            }
        }

        public int find(int row, int col) {
            int pos = row * n + col;
            while (pos != parent[pos]) {
                parent[pos] = parent[parent[pos]];
                pos = parent[pos];
            }
            return pos;
        }

        public void union(int row1, int col1, int row2, int col2) {
            if (row2 < 0 || row2 >= m || col2 < 0 || col2 >= n) {
                return;
            }
            if (mygrid[row2][col2] != '1') {
                return;
            }

            int root1 = find(row1, col1);
            int root2 = find(row2, col2);

            if (root1 == root2) {
                return;
            } else {
                parent[root1] = root2;
                count--;
            }
        }
    }
}
