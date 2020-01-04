package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Number of Connected Components in an Undirected Graph.
 * <p>
 * Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each
 * edge is a pair of nodes), write a function to find the number of connected
 * components in an undirected graph.
 * <p>
 * Example 1:
 * 0          3
 * |          |
 * 1 --- 2    4
 * Given n = 5 and edges = [[0, 1], [1, 2], [3, 4]], return 2.
 * <p>
 * Example 2:
 * 0           4
 * |           |
 * 1 --- 2 --- 3
 * Given n = 5 and edges = [[0, 1], [1, 2], [2, 3], [3, 4]], return 1.
 * Note:
 * You can assume that no duplicate edges will appear in edges. Since all edges
 * are undirected, [0, 1] is the same as [1, 0] and thus will not appear together
 * in edges.
 *
 * @author Johnny
 */
public class Solution323 {
    public int countComponents(int n, int[][] edges) {
        if (n <= 0 || edges == null) {
            return 0;
        }
        int[] roots = new int[n];
        for (int i = 0; i < n; i++) roots[i] = i;

        for (int[] e : edges) {
            int root1 = find(roots, e[0]);
            int root2 = find(roots, e[1]);
            if (root1 != root2) {
                roots[root1] = root2;  // union
                n--;
            }
        }
        return n;
    }

    public int find(int[] roots, int id) {
        while (roots[id] != id) {
            roots[id] = roots[roots[id]];  // optional: path compression
            id = roots[id];
        }
        return id;
    }

    //http://buttercola.blogspot.com/2016/01/leetcode-number-of-connected-components.html
    //https://segmentfault.com/a/1190000004224298
    // union - find
    public int countComponents4(int n, int[][] edges) {
        if (n <= 0 || edges == null || edges.length == 0) {
            return 0;
        }

        // make set
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            Node node = new Node();
            node.Rank = 0;
            node.Val = i;
            node.Parent = node;
            nodes[i] = node;
        }

        // union
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            union4(nodes[edge[0]], nodes[edge[1]]);
        }
        // find root
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nodes[i].Parent == nodes[i]) {
                count++;
            }
        }

        return count;
    }

    private void union4(Node node1, Node node2) {
        if (node1 == null || node2 == null) {
            return;
        }
        Node root1 = find4(node1);
        Node root2 = find4(node2);
        if (root1.Rank > root2.Rank) {
            root2.Parent = root1;
        } else if (root1.Rank < root2.Rank) {
            root1.Parent = root2;
        } else {
            root2.Parent = root1;
            root1.Rank++;
        }
    }

    private Node find4(Node node) {
        if (node == null) {
            return null;
        }
        Node root = node;
        while (root.Parent != root) {
            root = root.Parent;
        }
        return root;
    }

    public int countComponents3(int n, int[][] edges) {
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
            union3(parent, edges[i][0], edges[i][1]);
        }

        // Count
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (parent[i] == i) {
                count++;
            }
        }
        return count;
    }

    // find root
    private int find3(int[] parent, int node) {
        while (parent[node] != node) {
            parent[node] = parent[parent[node]];
        }
        return parent[node];
    }

    // union
    private void union3(int[] parent, int node1, int node2) {
        int root1 = find3(parent, node1);
        int root2 = find3(parent, node2);
        parent[root1] = root2;
    }

    // dfs
    public int countComponents2(int n, int[][] edges) {
        if (n <= 0 || edges == null || edges.length == 0) {
            return 0;
        }

        boolean[] visited = new boolean[n];
        List<Integer>[] list = new List[n];
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

    private void dfs(int index, List<Integer>[] list, boolean[] visited) {
        if (visited[index]) {
            return;
        }
        visited[index] = true;

        List<Integer> neighbors = list[index];
        for (int i = 0; i < neighbors.size(); i++) {
            dfs(neighbors.get(i), list, visited);
        }
    }

    class Node {
        public int Rank;
        public int Val;
        public Node Parent;
        /*public Node(int rank, int val, Node parent) {
            Rank = rank;
            Val = val;
            Parent = parent;
        }*/
    }
}
