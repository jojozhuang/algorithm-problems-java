/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Number of Connected Components in an Undirected Graph.
 * 
 * Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each 
 * edge is a pair of nodes), write a function to find the number of connected 
 * components in an undirected graph.
 * 
 * Example 1:
 *      0          3
 *      |          |
 *      1 --- 2    4
 * Given n = 5 and edges = [[0, 1], [1, 2], [3, 4]], return 2.
 * 
 * Example 2:
 *      0           4
 *      |           |
 *      1 --- 2 --- 3
 * Given n = 5 and edges = [[0, 1], [1, 2], [2, 3], [3, 4]], return 1.
 * Note:
 * You can assume that no duplicate edges will appear in edges. Since all edges 
 * are undirected, [0, 1] is the same as [1, 0] and thus will not appear together
 * in edges.
 *  
 * @author Johnny
 */
public class Solution323 {
    //http://buttercola.blogspot.com/2016/01/leetcode-number-of-connected-components.html
    //https://segmentfault.com/a/1190000004224298
    // union - find
    public int countComponents(int n, int[][] edges) {
        if (n <= 0 || edges == null || edges.length == 0) {
            return 0;
        }
        // make set, initial
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i; // every node is its own root
        }
        // union group
        for (int i = 0; i < edges.length; i++) {
            union(parent, edges[i][0], edges[i][1]);
        }

        // Count
        int count = 0;
        for (int i = 0; i < n; i++){ 
            if (parent[i] == i) {
                count++;
            }
        }
        return count;
    }
 
    // find root
    private int find(int[] parent, int node) {
        while(parent[node] != node) {
            parent[node] = parent[parent[node]];
        }
        return parent[node];
    }

    // union
    private void union(int[] parent, int node1, int node2) {
        int root1 = find(parent, node1);
        int root2 = find(parent, node2);
        parent[root1] = root2;
    }
    
    // dfs
    public int countComponents2(int n, int[][] edges) {
        if (n <= 0 || edges == null || edges.length == 0) {
            return 0;
        }
        
        boolean[] visited = new boolean[n];
        List[] list = new List[n];
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < edges.length; i++) {
            int from = edges[i][0];
            int to = edges[i][1];
            list[from].add(to);
            list[to].add(from);
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(i, list, visited);
            }
        }
        return count;
    }
    
    private void dfs(int index, List[] list, boolean[] visited) {
        if (visited[index]) {
            return;
        }
        visited[index] = true;
        
        List<Integer> neighbors =  list[index];
        for (int i = 0; i < neighbors.size(); i++) {
            dfs(neighbors.get(i), list, visited);
        }
    }
}
