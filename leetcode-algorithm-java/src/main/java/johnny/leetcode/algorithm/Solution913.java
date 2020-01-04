package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 913. Cat and Mouse
 * A game on an undirected graph is played by two players, Mouse and Cat, who alternate turns.
 * <p>
 * The graph is given as follows: graph[a] is a list of all nodes b such that ab is an edge of the graph.
 * <p>
 * Mouse starts at node 1 and goes first, Cat starts at node 2 and goes second, and there is a Hole at node 0.
 * <p>
 * During each player's turn, they must travel along one edge of the graph that meets where they are.  For example, if the Mouse is at node 1, it must travel to any node in graph[1].
 * <p>
 * Additionally, it is not allowed for the Cat to travel to the Hole (node 0.)
 * <p>
 * Then, the game can end in 3 ways:
 * <p>
 * If ever the Cat occupies the same node as the Mouse, the Cat wins.
 * If ever the Mouse reaches the Hole, the Mouse wins.
 * If ever a position is repeated (ie. the players are in the same position as a previous turn, and it is the same player's turn to move), the game is a draw.
 * Given a graph, and assuming both players play optimally, return 1 if the game is won by Mouse, 2 if the game is won by Cat, and 0 if the game is a draw.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [[2,5],[3],[0,4,5],[1,4,5],[2,3],[0,2,3]]
 * Output: 0
 * Explanation:
 * 4---3---1
 * |   |
 * 2---5
 * \ /
 * 0
 * <p>
 * <p>
 * Note:
 * <p>
 * 3 <= graph.length <= 50
 * It is guaranteed that graph[1] is non-empty.
 * It is guaranteed that graph[2] contains a non-zero element.
 *
 * @author Johnny
 */
public class Solution913 {
    public int catMouseGame(int[][] graph) {
        int N = graph.length;
        final int DRAW = 0, MOUSE = 1, CAT = 2;

        int[][][] color = new int[50][50][3];
        int[][][] degree = new int[50][50][3];

        // degree[node] : the number of neutral children of this node
        for (int m = 0; m < N; ++m)
            for (int c = 0; c < N; ++c) {
                degree[m][c][1] = graph[m].length;
                degree[m][c][2] = graph[c].length;
                for (int x : graph[c])
                    if (x == 0) {
                        degree[m][c][2]--;
                        break;
                    }
            }

        // enqueued : all nodes that are colored
        Queue<int[]> queue = new LinkedList<int[]>();
        for (int i = 0; i < N; ++i)
            for (int t = 1; t <= 2; ++t) {
                color[0][i][t] = MOUSE;
                queue.add(new int[]{0, i, t, MOUSE});
                if (i > 0) {
                    color[i][i][t] = CAT;
                    queue.add(new int[]{i, i, t, CAT});
                }
            }

        // percolate
        while (!queue.isEmpty()) {
            // for nodes that are colored :
            int[] node = queue.remove();
            int i = node[0], j = node[1], t = node[2], c = node[3];
            // for every parent of this node i, j, t :
            for (int[] parent : parents(graph, i, j, t)) {
                int i2 = parent[0], j2 = parent[1], t2 = parent[2];
                // if this parent is not colored :
                if (color[i2][j2][t2] == DRAW) {
                    // if the parent can make a winning move (ie. mouse to MOUSE), do so
                    if (t2 == c) {
                        color[i2][j2][t2] = c;
                        queue.add(new int[]{i2, j2, t2, c});
                    } else {
                        // else, this parent has degree[parent]--, and enqueue
                        // if all children of this parent are colored as losing moves
                        degree[i2][j2][t2]--;
                        if (degree[i2][j2][t2] == 0) {
                            color[i2][j2][t2] = 3 - t2;
                            queue.add(new int[]{i2, j2, t2, 3 - t2});
                        }
                    }
                }
            }
        }

        return color[1][2][1];
    }

    // What nodes could play their turn to
    // arrive at node (m, c, t) ?
    public List<int[]> parents(int[][] graph, int m, int c, int t) {
        List<int[]> ans = new ArrayList<int[]>();
        if (t == 2) {
            for (int m2 : graph[m])
                ans.add(new int[]{m2, c, 3 - t});
        } else {
            for (int c2 : graph[c])
                if (c2 > 0)
                    ans.add(new int[]{m, c2, 3 - t});
        }
        return ans;
    }
}
