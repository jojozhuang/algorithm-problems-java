package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 882. Reachable Nodes In Subdivided Graph
 * <p>
 * Starting with an undirected graph (the "original graph") with nodes from 0 to N-1, subdivisions are made to some of the edges.
 * <p>
 * The graph is given as follows: edges[k] is a list of integer pairs (i, j, n) such that (i, j) is an edge of the original graph,
 * <p>
 * and n is the total number of new nodes on that edge.
 * <p>
 * Then, the edge (i, j) is deleted from the original graph, n new nodes (x_1, x_2, ..., x_n) are added to the original graph,
 * <p>
 * and n+1 new edges (i, x_1), (x_1, x_2), (x_2, x_3), ..., (x_{n-1}, x_n), (x_n, j) are added to the original graph.
 * <p>
 * Now, you start at node 0 from the original graph, and in each move, you travel along one edge.
 * <p>
 * Return how many nodes you can reach in at most M moves.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: edges = [[0,1,10],[0,2,1],[1,2,2]], M = 6, N = 3
 * Output: 13
 * Explanation:
 * The nodes that are reachable in the final graph after M = 6 moves are indicated below.
 * <p>
 * Example 2:
 * <p>
 * Input: edges = [[0,1,4],[1,2,6],[0,2,8],[1,3,1]], M = 10, N = 4
 * Output: 23
 * <p>
 * <p>
 * Note:
 * <p>
 * 0 <= edges.length <= 10000
 * 0 <= edges[i][0] < edges[i][1] < N
 * There does not exist any i != j for which edges[i][0] == edges[j][0] and edges[i][1] == edges[j][1].
 * The original graph has no parallel edges.
 * 0 <= edges[i][2] <= 10000
 * 0 <= M <= 10^9
 * 1 <= N <= 3000
 * A reachable node is a node that can be travelled to using at most M moves starting from node 0.
 *
 * @author Johnny
 */
public class Solution882 {
    public int reachableNodes(int[][] edges, int M, int N) {
        Map<Integer, Map<Integer, Integer>> graph = new HashMap<Integer, Map<Integer, Integer>>();
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            graph.computeIfAbsent(u, x -> new HashMap<Integer, Integer>()).put(v, w);
            graph.computeIfAbsent(v, x -> new HashMap<Integer, Integer>()).put(u, w);
        }

        PriorityQueue<ANode> pq = new PriorityQueue<ANode>(
                (a, b) -> Integer.compare(a.dist, b.dist));
        pq.offer(new ANode(0, 0));

        Map<Integer, Integer> dist = new HashMap<Integer, Integer>();
        dist.put(0, 0);
        Map<Integer, Integer> used = new HashMap<Integer, Integer>();
        int ans = 0;

        while (!pq.isEmpty()) {
            ANode anode = pq.poll();
            int node = anode.node;
            int d = anode.dist;

            if (d > dist.getOrDefault(node, 0)) continue;
            // Each node is only visited once.  We've reached
            // a node in our original graph.
            ans++;

            if (!graph.containsKey(node)) continue;
            for (int nei : graph.get(node).keySet()) {
                // M - d is how much further we can walk from this node;
                // weight is how many new nodes there are on this edge.
                // v is the maximum utilization of this edge.
                int weight = graph.get(node).get(nei);
                int v = Math.min(weight, M - d);
                used.put(N * node + nei, v);

                // d2 is the total distance to reach 'nei' (neighbor) node
                // in the original graph.
                int d2 = d + weight + 1;
                if (d2 < dist.getOrDefault(nei, M + 1)) {
                    pq.offer(new ANode(nei, d2));
                    dist.put(nei, d2);
                }
            }
        }

        // At the end, each edge (u, v, w) can be used with a maximum
        // of w new nodes: a max of used[u, v] nodes from one side,
        // and used[v, u] nodes from the other.
        // [We use the encoding (u, v) = u * N + v.]
        for (int[] edge : edges) {
            ans += Math.min(edge[2], used.getOrDefault(edge[0] * N + edge[1], 0) +
                    used.getOrDefault(edge[1] * N + edge[0], 0));
        }

        return ans;
    }

    class ANode {
        int node, dist;

        ANode(int n, int d) {
            node = n;
            dist = d;
        }
    }
}