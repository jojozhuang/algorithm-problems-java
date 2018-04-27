package johnny.algorithm.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Walls and Gates.
 * 
 * You are given a m x n 2D grid initialized with these three possible values.
 * 
 * -1 - A wall or an obstacle.
 * 0 - A gate.
 * INF - Infinity means an empty room. We use the value 2^31 - 1 = 2147483647 to 
 * represent INF as you may assume that the distance to a gate is less than 2147483647.
 * Fill each empty room with the distance to its nearest gate. If it is 
 * impossible to reach a gate, it should be filled with INF.
 * 
 * For example, given the 2D grid:
 * 
 * INF  -1  0  INF
 * INF INF INF  -1
 * INF  -1 INF  -1
 *   0  -1 INF INF
 *  After running your function, the 2D grid should be:
 * 
 *   3  -1   0   1
 *   2   2   1  -1
 *   1  -1   2  -1
 *   0  -1   3   4
 * 
 * @author Johnny
 */
public class Solution286 {
    //https://leetcode.com/discuss/82264/benchmarks-of-dfs-and-bfs
    //https://segmentfault.com/a/1190000003906674
    public void wallsAndGates(int[][] rooms) {
        if (rooms == null || rooms.length == 0 || rooms[0].length == 0) {
            return;
        }
        
        int m = rooms.length;
        int n = rooms[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rooms[i][j] == 0) {
                    bfs(rooms, i, j);
                    //dfs(rooms, i, j, 0);
                }
            }
        }
    }
    public void dfs(int[][] rooms, int i, int j, int distance) {
        if (i < 0 || i >= rooms.length || j < 0 ||  j >= rooms[0].length) {
            return ;
        }
        if (rooms[i][j] < distance) {
            return ;
        }

        rooms[i][j] = distance;
        dfs(rooms, i + 1, j, distance + 1);
        dfs(rooms, i - 1, j, distance + 1);
        dfs(rooms, i, j + 1, distance + 1);
        dfs(rooms, i, j - 1, distance + 1);
    }
    
    public static final int[] d = {0, 1, 0, -1, 0};
    private void bfs(int[][] rooms, int i, int j) {
        int m = rooms.length, n = rooms[0].length;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(i * n + j); // Put gate in the queue
        while (!queue.isEmpty()) {
            int x = queue.poll();
            i = x / n; j = x % n;
            for (int k = 0; k < 4; ++k) { // left, right, top, bottom
                int p = i + d[k], q = j + d[k + 1];
                if (0 <= p && p < m && 0 <= q && q < n && rooms[p][q] > rooms[i][j] + 1) {
                    rooms[p][q] = rooms[i][j] + 1;
                    queue.offer(p * n + q);
                }
            }
        }
    }
}
