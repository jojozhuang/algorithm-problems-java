package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 886. Possible Bipartition
 * Given a set of N people (numbered 1, 2, ..., N), we would like to split everyone into two groups of any size.
 * <p>
 * Each person may dislike some other people, and they should not go into the same group.
 * <p>
 * Formally, if dislikes[i] = [a, b], it means it is not allowed to put the people numbered a and b into the same group.
 * <p>
 * Return true if and only if it is possible to split everyone into two groups in this way.
 * <p>
 * Example 1:
 * Input: N = 4, dislikes = [[1,2],[1,3],[2,4]]
 * Output: true
 * Explanation: group1 [1,4], group2 [2,3]
 * <p>
 * Example 2:
 * Input: N = 3, dislikes = [[1,2],[1,3],[2,3]]
 * Output: false
 * <p>
 * Example 3:
 * Input: N = 5, dislikes = [[1,2],[2,3],[3,4],[4,5],[1,5]]
 * Output: false
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= N <= 2000
 * 0 <= dislikes.length <= 10000
 * 1 <= dislikes[i][j] <= N
 * dislikes[i][0] < dislikes[i][1]
 * There does not exist i != j for which dislikes[i] == dislikes[j].
 * }</pre>
 *
 * @author Johnny
 */
public class Solution886 {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        if (dislikes == null) {
            return false;
        }

        List<Integer>[] graph = new ArrayList[N];
        int[] colors = new int[N]; // 0: initial, not colored, 1: colored to blue, -1: colored to red.

        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        for (int[] edge : dislikes) {
            graph[edge[0] - 1].add(edge[1] - 1);
            graph[edge[1] - 1].add(edge[0] - 1);
        }

        for (int i = 0; i < N; i++) {
            if (colors[i] == 0 && !dfs(graph, colors, 1, i)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(List<Integer>[] graph, int[] colors, int color, int node) {
        if (colors[node] != 0) {
            return colors[node] == color;
        }

        colors[node] = color;
        for (int next : graph[node]) {
            if (!dfs(graph, colors, -color, next)) {
                return false;
            }
        }

        return true;
    }
}
