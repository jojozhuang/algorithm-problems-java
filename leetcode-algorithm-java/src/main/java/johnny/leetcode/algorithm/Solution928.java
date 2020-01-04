package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 928. Minimize Malware Spread II
 * (This problem is the same as Minimize Malware Spread, with the differences bolded.)
 * <p>
 * In a network of nodes, each node i is directly connected to another node j if and only if graph[i][j] = 1.
 * <p>
 * Some nodes initial are initially infected by malware.  Whenever two nodes are directly connected and at least one of those two nodes is infected by malware, both nodes will be infected by malware.  This spread of malware will continue until no more nodes can be infected in this manner.
 * <p>
 * Suppose M(initial) is the final number of nodes infected with malware in the entire network, after the spread of malware stops.
 * <p>
 * We will remove one node from the initial list, completely removing it and any connections from this node to any other node.  Return the node that if removed, would minimize M(initial).  If multiple nodes could be removed to minimize M(initial), return such a node with the smallest index.
 * <p>
 * Example 1:
 * Input: graph = [[1,1,0],[1,1,0],[0,0,1]], initial = [0,1]
 * Output: 0
 * <p>
 * Example 2:
 * Input: graph = [[1,1,0],[1,1,1],[0,1,1]], initial = [0,1]
 * Output: 1
 * <p>
 * Example 3:
 * Input: graph = [[1,1,0,0],[1,1,1,0],[0,1,1,1],[0,0,1,1]], initial = [0,1]
 * Output: 1
 * <p>
 * Note:
 * <pre>{@code
 * 1 < graph.length = graph[0].length <= 300
 * 0 <= graph[i][j] == graph[j][i] <= 1
 * graph[i][i] = 1
 * 1 <= initial.length < graph.length
 * 0 <= initial[i] < graph.length
 * }</pre>
 *
 * @author Johnny
 */
public class Solution928 {
    public int minMalwareSpread(int[][] graph, int[] initial) {
        int N = graph.length;
        int[] clean = new int[N];
        Arrays.fill(clean, 1);
        for (int x : initial)
            clean[x] = 0;

        // For each node u in initial, dfs to find
        // 'seen': all nodes not in initial that it can reach.
        ArrayList<Integer>[] infectedBy = new ArrayList[N];
        for (int i = 0; i < N; ++i)
            infectedBy[i] = new ArrayList<Integer>();

        for (int u : initial) {
            Set<Integer> seen = new HashSet<Integer>();
            dfs(graph, clean, u, seen);
            for (int v : seen)
                infectedBy[v].add(u);
        }

        // For each node u in initial, for every v not in initial
        // that is uniquely infected by u, add 1 to the contribution for u.
        int[] contribution = new int[N];
        for (int v = 0; v < N; ++v)
            if (infectedBy[v].size() == 1)
                contribution[infectedBy[v].get(0)]++;

        // Take the best answer.
        Arrays.sort(initial);
        int ans = initial[0], ansSize = -1;
        for (int u : initial) {
            int score = contribution[u];
            if (score > ansSize || score == ansSize && u < ans) {
                ans = u;
                ansSize = score;
            }
        }
        return ans;
    }

    public void dfs(int[][] graph, int[] clean, int u, Set<Integer> seen) {
        for (int v = 0; v < graph.length; ++v)
            if (graph[u][v] == 1 && clean[v] == 1 && !seen.contains(v)) {
                seen.add(v);
                dfs(graph, clean, v, seen);
            }
    }
}
