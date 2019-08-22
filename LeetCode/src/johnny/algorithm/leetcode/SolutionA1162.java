package johnny.algorithm.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Johnny
 */
public class SolutionA1162 {
    public int maxDistance(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = -1;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    max = Math.max(bfs(grid, i, j), max);
                }
            }
        }
        
        return max;
    }
    
    public int bfs(int[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        
        int[] dr = new int[]{0, -1, 0, 1};
        int[] dc = new int[]{1, 0, -1, 0};
        int dis = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            dis++;
            int size = queue.size();
            while (size > 0) {
                int[] pos = queue.poll();
                visited[pos[0]][pos[1]] = true;
                for (int k = 0; k < 4; k++) {
                    int r = pos[0] + dr[k];
                    int c = pos[1] + dc[k];
                    if (r < 0 || r >= m || c < 0 || c >= n || visited[r][c]) {
                        continue;
                    }
                    if (grid[r][c] == 1) {
                        return dis;
                    }
                    queue.offer(new int[]{r, c});
                }
                size--;
            }
        }
        
        return -1;
    }
}
