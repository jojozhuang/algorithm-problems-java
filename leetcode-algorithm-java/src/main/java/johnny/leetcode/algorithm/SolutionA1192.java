package johnny.leetcode.algorithm;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 1192. Critical Connections in a Network
 *
 * There are n servers numbered from 0 to n-1 connected by undirected server-to-server connections forming a network where connections[i] = [a, b] represents a connection between servers a and b. Any server can reach any other server directly or indirectly through the network.
 *
 * A critical connection is a connection that, if removed, will make some server unable to reach some other server.
 *
 * Return all critical connections in the network in any order.
 *
 * Example 1:
 * Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
 * Output: [[1,3]]
 * Explanation: [[3,1]] is also accepted.
 *
 *
 * Constraints:
 *
 * 1 <= n <= 10^5
 * n-1 <= connections.length <= 10^5
 * connections[i][0] != connections[i][1]
 * There are no repeated connections.
 *
 */
public class SolutionA1192 {
    // Brute force, Union Find, Time Limit Exceeded
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < connections.size(); i++) {
            DSU dsu = new DSU(n);
            for (int j = 0; j < connections.size(); j++) {
                if (i != j) {
                    List<Integer> conn = connections.get(j);
                    dsu.union(conn.get(0), conn.get(1));
                }
            }
            Set<Integer> set = new HashSet<>();
            for (int k = 0; k < n; k++) {
                set.add(dsu.find(k));
            }
            if (set.size() != 1) {
                ans.add(connections.get(i));
            }
        }

        return ans;
    }

    class DSU {
        int[] parent;

        public DSU(int size) {
            parent = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
        }

        public int find(int i) {
            if (parent[i] != i) {
                return find(parent[i]);
            }
            return parent[i];
        }

        public void union(int i, int j) {
            int p1 = find(i);
            int p2 = find(j);
            parent[p1] = p2;
        }
    }
    /*
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet<>());
        }
        for (List<Integer> conn : connections) {
            graph.get(conn.get(0)).add(conn.get(1));
            graph.get(conn.get(1)).add(conn.get(0));
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < connections.size(); i++) {
            List<Integer> conn = connections.get(i);
            if (helper(graph, new int[]{conn.get(0), conn.get(1)})) {
                ans.add(conn);
            }
        }

        return ans;
    }

    public boolean helper(Map<Integer, Set<Integer>> graph, int[] edge) {
        graph.get(edge[0]).remove(edge[1]);
        graph.get(edge[1]).remove(edge[0]);

        DSU dsu = new DSU(graph.size());
        for (int[] edge : edges) {
            if (!dsu.union(edge[0], edge[1])) {
                return edge;
            }
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < graph.size(); i++) {
            set.add(dsu.find(i));
        }

        graph.get(edge[0]).add(edge[1]);
        graph.get(edge[1]).add(edge[0]);

        return set.size() == 1;
    }

    class DSU {
        int[] parent;

        public DSU(int size) {
            parent = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
        }

        public int find(int i) {
            if (parent[i] != i) {
                parent[i] = find(parent[i]);
            }
            return parent[i];
        }

        public boolean union(int i, int j) {
            int p1 = find(i);
            int p2 = find(j);
            if (p1 == p2) {
                return false;
            } else {
                parent[p1] = p2;
                return true;
            }
        }
    }
    */
}
