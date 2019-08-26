package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * 924. Minimize Malware Spread
In a network of nodes, each node i is directly connected to another node j if and only if graph[i][j] = 1.

Some nodes initial are initially infected by malware.  Whenever two nodes are directly connected and at least one of those two nodes is infected by malware, both nodes will be infected by malware.  This spread of malware will continue until no more nodes can be infected in this manner.

Suppose M(initial) is the final number of nodes infected with malware in the entire network, after the spread of malware stops.

We will remove one node from the initial list.  Return the node that if removed, would minimize M(initial).  If multiple nodes could be removed to minimize M(initial), return such a node with the smallest index.

Note that if a node was removed from the initial list of infected nodes, it may still be infected later as a result of the malware spread.

 

Example 1:

Input: graph = [[1,1,0],[1,1,0],[0,0,1]], initial = [0,1]
Output: 0
Example 2:

Input: graph = [[1,0,0],[0,1,0],[0,0,1]], initial = [0,2]
Output: 0
Example 3:

Input: graph = [[1,1,1],[1,1,1],[1,1,1]], initial = [1,2]
Output: 1
 

Note:

1 < graph.length = graph[0].length <= 300
0 <= graph[i][j] == graph[j][i] <= 1
graph[i][i] = 1
1 <= initial.length < graph.length
0 <= initial[i] < graph.length

 * @author Johnny
 */
public class Solution924 {
    public int minMalwareSpread(int[][] graph, int[] initial) {
        // 1. Color each component.
        // colors[node] = the color of this node.

        int N = graph.length;
        int[] colors = new int[N];
        Arrays.fill(colors, -1);
        int C = 0;

        for (int node = 0; node < N; ++node)
            if (colors[node] == -1)
                dfs(graph, colors, node, C++);

        // 2. Size of each color.
        int[] size = new int[C];
        for (int color: colors)
            size[color]++;

        // 3. Find unique colors.
        int[] colorCount = new int[C];
        for (int node: initial)
            colorCount[colors[node]]++;

        // 4. Answer
        int ans = Integer.MAX_VALUE;
        for (int node: initial) {
            int c = colors[node];
            if (colorCount[c] == 1) {
                if (ans == Integer.MAX_VALUE)
                    ans = node;
                else if (size[c] > size[colors[ans]])
                    ans = node;
                else if (size[c] == size[colors[ans]] && node < ans)
                    ans = node;
            }
        }

        if (ans == Integer.MAX_VALUE)
            for (int node: initial)
                ans = Math.min(ans, node);

        return ans;
    }

    public void dfs(int[][] graph, int[] colors, int node, int color) {
        colors[node] = color;
        for (int nei = 0; nei < graph.length; ++nei)
            if (graph[node][nei] == 1 && colors[nei] == -1)
                dfs(graph, colors, nei, color);
    }
}
