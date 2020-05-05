package johnny.lintcode.algorithm;

import johnny.algorithm.common.Point;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Climbing Stairs II
 * <p>
 * A child is running up a staircase with n steps, and can hop either 1 step,
 * 2 steps, or 3 steps at a time. Implement a method to count how many possible
 * ways the child can run up the stairs.
 * <p>
 * n=3
 * 1+1+1=2+1=1+2=3=3
 * <p>
 * return 4
 *
 */
public class KnightShortestPath {
    /**
     * @param grid: a chessboard included 0 (false) and 1 (true)
     * @param source: a point
     * @param destination: a point
     * @return: the shortest path
     */
    public int shortestPath(int[][] grid, Point source, Point destination) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<Point> queue = new LinkedList<>();
        queue.offer(source);
        visited[source.x][source.y] = true;
        int[] ix = new int[]{1,1,-1,-1,2,2,-2,-2};
        int[] iy = new int[]{2,-2,2,-2,1,-1,1,-1};

        int step = 0;
        while (!queue.isEmpty()) {
            step++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Point p = queue.poll();
                for (int k = 0; k < 8; k++) {
                    int x = p.x + ix[k];
                    int y = p.y + iy[k];
                    if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 1 || visited[x][y]) {
                        continue;
                    }
                    if (x == destination.x && y == destination.y) {
                        return step;
                    }
                    queue.offer(new Point(x, y));
                    visited[x][y] = true;
                }
            }
        }

        return -1;
    }
}
