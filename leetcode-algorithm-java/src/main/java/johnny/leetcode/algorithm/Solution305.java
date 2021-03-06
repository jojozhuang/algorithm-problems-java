package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Number of Islands II.
 * <p>
 * A 2d grid map of m rows and n columns is initially filled with water. We may
 * perform an addLand operation which turns the water at position (row, col)
 * into a land. Given a list of positions to operate, count the number of
 * islands after each addLand operation. An island is surrounded by water and
 * is formed by connecting adjacent lands horizontally or vertically. You may
 * assume all four edges of the grid are all surrounded by water.
 * <p>
 * Example:
 * <p>
 * Given m = 3, n = 3, positions = [[0,0], [0,1], [1,2], [2,1]].
 * Initially, the 2d grid grid is filled with water. (Assume 0 represents water
 * and 1 represents land).
 * <p>
 * 0 0 0
 * 0 0 0
 * 0 0 0
 * Operation #1: addLand(0, 0) turns the water at grid[0][0] into a land.
 * <p>
 * 1 0 0
 * 0 0 0   Number of islands = 1
 * 0 0 0
 * Operation #2: addLand(0, 1) turns the water at grid[0][1] into a land.
 * <p>
 * 1 1 0
 * 0 0 0   Number of islands = 1
 * 0 0 0
 * <p>
 * Operation #3: addLand(1, 2) turns the water at grid[1][2] into a land.
 * <p>
 * 1 1 0
 * 0 0 1   Number of islands = 2
 * 0 0 0
 * Operation #4: addLand(2, 1) turns the water at grid[2][1] into a land.
 * <p>
 * 1 1 0
 * 0 0 1   Number of islands = 3
 * 0 1 0
 * We return the result as an array: [1, 1, 2, 3]
 *
 * @author Johnny
 */
public class Solution305 {
    int[][] dirs = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        List<Integer> result = new ArrayList<>();
        if (m <= 0 || n <= 0) return result;

        int count = 0;                      // number of islands
        int[] roots = new int[m * n];       // one island = one tree
        Arrays.fill(roots, -1);

        for (int[] p : positions) {
            int root = n * p[0] + p[1];     // assume new point is isolated island
            roots[root] = root;             // add new island
            count++;

            for (int[] dir : dirs) {
                int x = p[0] + dir[0];
                int y = p[1] + dir[1];
                int nb = n * x + y;
                if (x < 0 || x >= m || y < 0 || y >= n || roots[nb] == -1) continue;

                int rootNb = findIsland(roots, nb);
                if (root != rootNb) {        // if neighbor is in another island
                    roots[root] = rootNb;   // union two islands 
                    root = rootNb;          // current tree root = joined tree root
                    count--;
                }
            }

            result.add(count);
        }
        return result;
    }

    public int findIsland(int[] roots, int id) {
        while (id != roots[id]) id = roots[id];
        return id;
    }

    public List<Integer> numIslands24(int m, int n, int[][] positions) {
        List<Integer> res = new ArrayList<Integer>();
        if (m == 0 || n == 0 || positions == null || positions.length == 0 || positions[0].length != 2) {
            return res;
        }
        int count = 0;
        // inital parent array
        int[] parent = new int[m * n];
        Arrays.fill(parent, -1);

        int[] dx = new int[]{-1, 0, 1, 0}; //top, right, bottom, left
        int[] dy = new int[]{0, 1, 0, -1};

        // calculate
        for (int i = 0; i < positions.length; i++) {
            count++;
            int row = positions[i][0];
            int col = positions[i][1];
            int index = row * n + col;
            parent[index] = index;

            for (int j = 0; j < 4; j++) {
                int adrow = row + dx[j];
                int adcol = col + dy[j];
                if (adrow < 0 || adrow >= m || adcol < 0 || adcol >= n || parent[adrow * n + adcol] == -1) {
                    continue;
                }

                int root = find4(parent, adrow, adcol, n);
                if (root != index) {
                    parent[root] = adrow * n + adcol;
                    count--;
                }
            }
            res.add(count);
        }

        return res;
    }

    private int find4(int[] parent, int row, int col, int n) {
        int pos = row * n + col;
        while (pos != parent[pos]) {
            pos = parent[parent[pos]];
        }
        return pos;
    }
}
