package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *684. Redundant Connection
 *In this problem, a tree is an undirected graph that is connected and has no cycles.

The given input is a graph that started as a tree with N nodes (with distinct values 1, 2, ..., N),
 with one additional edge added. The added edge has two different vertices chosen from 1 to N, and 
 was not an edge that already existed.

The resulting graph is given as a 2D-array of edges. Each element of edges is a pair [u, v] with
 u < v, that represents an undirected edge connecting nodes u and v.

Return an edge that can be removed so that the resulting graph is a tree of N nodes. If there are
 multiple answers, return the answer that occurs last in the given 2D-array. The answer 
 edge [u, v] should be in the same format, with u < v.

Example 1:
Input: [[1,2], [1,3], [2,3]]
Output: [2,3]
Explanation: The given undirected graph will be like this:
  1
 / \
2 - 3
Example 2:
Input: [[1,2], [2,3], [3,4], [1,4], [1,5]]
Output: [1,4]
Explanation: The given undirected graph will be like this:
5 - 1 - 2
    |   |
    4 - 3
Note:
The size of the input 2D-array will be between 3 and 1000.
Every integer represented in the 2D-array will be between 1 and N, where N is the size of the 
input array.

Update (2017-09-26):
We have overhauled the problem description + test cases and specified clearly the graph is an
 undirected graph. For the directed graph follow up please see Redundant Connection II). We
  apologize for any inconvenience caused.

 
 * @author Johnny
 */
public class Solution684 {
    class DSU {
        int[] rank;
        int[] parent;
        public DSU(int size) {
            parent = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
            rank = new int[size];
        }

        public int find(int i) {
            while (parent[i] != i) {
                parent[i] = parent[parent[i]];
                i = parent[i];
            }
            return parent[i];
        }

        public boolean union(int i, int j) {
            int p1 = find(i);
            int p2 = find(j);
            if (p1 == p2) {
                return false;
            } else if (rank[p1] < rank[p2]) {
                parent[p1] = p2;
            } else if (rank[p1] > rank[p2]) {
                parent[p2] = p1;
            } else {
                parent[p2] = p1;
                rank[p1]++;
            }
            return true;
        }
    }
    
    public int[] findRedundantConnection(int[][] edges) {
        DSU dsu = new DSU(edges.length + 1);
        for (int[] edge: edges) {
            if (!dsu.union(edge[0], edge[1])) {
                return edge;
            }
        }
        return new int[] {0,0};
    }
    
    public int[] findRedundantConnection4(int[][] edges) {
        int[] parents = new int[edges.length + 1];
        for (int i = 0; i < parents.length; i++) {
            parents[i] = i;
        }
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int pu = find(u, parents);
            int pv = find(v, parents);
            if (pu == pv) {
                return edge;
            }
            parents[pv] = pu;
        }
        
        return new int[] {0,0};
    }
    
    private int find(int curr, int[] parents) {
        while (parents[curr] != curr) {
            parents[curr] = parents[parents[curr]];
            curr = parents[curr];
        }
        
        return curr;
    }
    // dfs
    public int[] findRedundantConnection3(int[][] edges) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            if (!map.containsKey(edge[0])) {
                map.put(edge[0], new ArrayList<Integer>());
            }
            if (!map.containsKey(edge[1])) {
                map.put(edge[1], new ArrayList<Integer>());
            }
            Set<Integer> visited = new HashSet<>();
            if (dfs(map, edge[0], edge[1], visited)) {
                return edge;
            }
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        
        return new int[]{0,0};
    }
    
    private boolean dfs(Map<Integer, List<Integer>> map, int start, int target, Set<Integer> visited) {
        
        if (start == target) {
            return true;
        }
        visited.add(start);
        if (!map.containsKey(start) || !map.containsKey(target)) {
            return false;
        }
        for (int nei : map.get(start)) {
            if (visited.contains(nei)) {
                continue;
            }
            if (dfs(map, nei, target, visited)) {
                return true;
            }
        }
        
        return false;
    }
    
    // union find
    public int[] findRedundantConnection2(int[][] edges) {
        int[] parent = new int[2001];
        for (int i = 0; i < parent.length; i++) parent[i] = i;
        
        for (int[] edge: edges){
            int f = edge[0], t = edge[1];
            if (find(parent, f) == find(parent, t)) return edge;
            else parent[find(parent, f)] = find(parent, t);
        }
        
        return new int[2];
    }
    
    private int find(int[] parent, int f) {
        if (f != parent[f]) {
          parent[f] = find(parent, parent[f]);  
        }
        return parent[f];
    }
}