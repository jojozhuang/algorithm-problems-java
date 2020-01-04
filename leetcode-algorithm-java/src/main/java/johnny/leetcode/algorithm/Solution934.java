package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 * 934. Shortest Bridge
 * In a given 2D binary array A, there are two islands.  (An island is a 4-directionally connected group of 1s not connected to any other 1s.)
 * <p>
 * Now, we may change 0s to 1s so as to connect the two islands together to form 1 island.
 * <p>
 * Return the smallest number of 0s that must be flipped.  (It is guaranteed that the answer is at least 1.)
 * <p>
 * Example 1:
 * Input: [[0,1],[1,0]]
 * Output: 1
 * <p>
 * Example 2:
 * Input: [[0,1,0],[0,0,0],[0,0,1]]
 * Output: 2
 * <p>
 * Example 3:
 * Input: [[1,1,1,1,1],[1,0,0,0,1],[1,0,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]
 * Output: 1
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= A.length = A[0].length <= 100
 * A[i][j] == 0 or A[i][j] == 1
 * }</pre>
 *
 * @author Johnny
 */
public class Solution934 {
    //https://www.youtube.com/watch?v=JU-g1mNUaSE
    public int shortestBridge(int[][] A) {
        if (A == null || A.length == 0 || A[0].length == 0) {
            return 0;
        }

        int m = A.length;
        int n = A[0].length;
        Queue<int[]> queue = new LinkedList<int[]>();
        // add any node of the first island into queue 
        boolean found = false;
        for (int i = 0; i < m && !found; i++) {
            for (int j = 0; j < n && !found; j++) {
                if (A[i][j] == 1) {
                    dfs(A, m, n, i, j, queue);
                    found = true; // only one node is enough
                }
            }
        }

        int[] dr = new int[]{0, -1, 0, 1};
        int[] dc = new int[]{1, 0, -1, 0};

        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                int[] pos = queue.poll();
                for (int i = 0; i < 4; i++) {
                    int r = pos[0] + dr[i];
                    int c = pos[1] + dc[i];
                    if (r < 0 || r >= m || c < 0 || c >= n || A[r][c] == 2) {
                        continue;
                    }

                    if (A[r][c] == 1) {
                        return ans;
                    }

                    A[r][c] = 2;
                    queue.offer(new int[]{r, c});
                }
                size--;
            }
            ans++;
        }

        return ans;
    }

    private void dfs(int[][] grid, int m, int n, int i, int j, Queue<int[]> queue) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != 1) {
            return;
        }
        grid[i][j] = 2; // mark as growing
        queue.offer(new int[]{i, j});
        dfs(grid, m, n, i - 1, j, queue);
        dfs(grid, m, n, i + 1, j, queue);
        dfs(grid, m, n, i, j - 1, queue);
        dfs(grid, m, n, i, j + 1, queue);
    }

    public int shortestBridge2(int[][] A) {
        int R = A.length, C = A[0].length;
        int[][] colors = getComponents(A);

        Queue<Node> queue = new LinkedList<Node>();
        Set<Integer> target = new HashSet<Integer>();

        for (int r = 0; r < R; ++r)
            for (int c = 0; c < C; ++c) {
                if (colors[r][c] == 1) {
                    queue.add(new Node(r, c, 0));
                } else if (colors[r][c] == 2) {
                    target.add(r * C + c);
                }
            }

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (target.contains(node.r * C + node.c))
                return node.depth - 1;
            for (int nei : neighbors(A, node.r, node.c)) {
                int nr = nei / C, nc = nei % C;
                if (colors[nr][nc] != 1) {
                    queue.add(new Node(nr, nc, node.depth + 1));
                    colors[nr][nc] = 1;
                }
            }
        }

        throw null;
    }

    public int[][] getComponents(int[][] A) {
        int R = A.length, C = A[0].length;
        int[][] colors = new int[R][C];
        int t = 0;

        for (int r0 = 0; r0 < R; ++r0)
            for (int c0 = 0; c0 < C; ++c0)
                if (colors[r0][c0] == 0 && A[r0][c0] == 1) {
                    // Start dfs
                    Stack<Integer> stack = new Stack<Integer>();
                    stack.push(r0 * C + c0);
                    colors[r0][c0] = ++t;

                    while (!stack.isEmpty()) {
                        int node = stack.pop();
                        int r = node / C, c = node % C;
                        for (int nei : neighbors(A, r, c)) {
                            int nr = nei / C, nc = nei % C;
                            if (A[nr][nc] == 1 && colors[nr][nc] == 0) {
                                colors[nr][nc] = t;
                                stack.push(nr * C + nc);
                            }
                        }
                    }
                }

        return colors;
    }

    public List<Integer> neighbors(int[][] A, int r, int c) {
        int R = A.length, C = A[0].length;
        List<Integer> ans = new ArrayList<Integer>();
        if (0 <= r - 1) ans.add((r - 1) * R + c);
        if (0 <= c - 1) ans.add(r * R + (c - 1));
        if (r + 1 < R) ans.add((r + 1) * R + c);
        if (c + 1 < C) ans.add(r * R + (c + 1));
        return ans;
    }

    class Node {
        int r, c, depth;

        Node(int r, int c, int d) {
            this.r = r;
            this.c = c;
            depth = d;
        }
    }
}
