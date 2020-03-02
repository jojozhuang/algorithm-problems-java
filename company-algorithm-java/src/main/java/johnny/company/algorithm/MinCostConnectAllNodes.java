package johnny.company.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Min Cost to Connect All Nodes(City)
 *
 * Given an undirected graph with n nodes labeled 1..n. Some of the nodes are already connected. The i-th edge connects nodes edges[i][0] and edges[i][1] together. Your task is to augment this set of edges with additional edges to connect all the nodes. Find the minimum cost to add new edges between the nodes such that all the nodes are accessible from each other.
 *
 * Input:
 *
 * n, an int representing the total number of nodes.
 * edges, a list of integer pair representing the nodes already connected by an edge.
 * newEdges, a list where each element is a triplet representing the pair of nodes between which an edge can be added and the cost of addition, respectively (e.g. [1, 2, 5] means to add an edge between node 1 and 2, the cost would be 5).
 * Example 1:
 *
 * Input: n = 6, edges = [[1, 4], [4, 5], [2, 3]], newEdges = [[1, 2, 5], [1, 3, 10], [1, 6, 2], [5, 6, 5]]
 * Output: 7
 * Explanation:
 * There are 3 connected components [1, 4, 5], [2, 3] and [6].
 * We can connect these components into a single component by connecting node 1 to node 2 and node 1 to node 6 at a minimum cost of 5 + 2 = 7.
 * Solution
 * Related problems:
 *
 * Min Cost to Repair Edges
 * https://leetcode.com/problems/connecting-cities-with-minimum-cost (premium)
 *
 * https://leetcode.com/discuss/interview-question/356981
 */
public class MinCostConnectAllNodes {
    public int minCost(int n, List<int[]> edges, List<int[]> newEdges) {
        DSU dsu = new DSU(n);
        for (int[] edge: edges){
            dsu.union(edge[0], edge[1]);
        }
        Collections.sort(newEdges, (a, b) -> (a[2] - b[2]));
        int cost = 0;
        for (int[] edge : newEdges){
            if(!dsu.isConnected(edge[0], edge[1])){
                dsu.union(edge[0], edge[1]);
                cost += edge[2];
                if (dsu.group == 1) {
                    return cost;
                }
            }
        }
        return -1;

    }

    public class DSU { // Disjoint Set Union
        public int group;
        public int[] parents;

        public DSU(int size) {
            group = size;
            parents = new int[size + 1];
            for (int i = 0; i < parents.length; i++) {
                // Initially, all elements are in their own set.
                parents[i] = i;
            }
        }

        // find
        public int find(int i) {
            if (parents[i] != i) {
                parents[i] = find(parents[i]);
            }
            return parents[i];
        }

        // union
        public void union(int i, int j) {
            if (isConnected(i, j)) {
                return;
            }
            int p1 = find(i);
            int p2 = find(j);
            parents[p1] = p2;
            group--;
        }

        public boolean isConnected(int i, int j){
            return find(i) == find(j);
        }
    }
}
