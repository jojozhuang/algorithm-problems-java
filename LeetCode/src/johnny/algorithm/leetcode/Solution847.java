package johnny.algorithm.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;

/**
 * 847. Shortest Path Visiting All Nodes
 * 
 * An undirected, connected graph of N nodes (labeled 0, 1, 2, ..., N-1) is given as graph.

graph.length = N, and j != i is in the list graph[i] exactly once, if and only if nodes i and j are connected.

Return the length of the shortest path that visits every node. You may start and stop at any node, you may revisit nodes multiple times, and you may reuse edges.

 

Example 1:

Input: [[1,2,3],[0],[0],[0]]
Output: 4
Explanation: One possible path is [1,0,2,0,3]
Example 2:

Input: [[1],[0,2,4],[1,3,4],[2],[1,2]]
Output: 4
Explanation: One possible path is [0,1,4,2,3]
 

Note:

1 <= graph.length <= 12
0 <= graph[i].length < graph.length

 * @author Johnny
 */
public class Solution847 {
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        int mask = (1 << n) - 1; // eg. 1101 -> 0,2,3 are visited.
        int[][] visited = new int[n][1<<n];
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(new int[] {i, 1 << i});
        }
        
        int steps = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] node = queue.poll(); // node[0] is the identity, node[1] is the state of visited nodes
                if (node[1] == mask) {
                    return steps;
                }
                if (visited[node[0]][node[1]] == 1) {
                    continue;
                }
                visited[node[0]][node[1]] = 1;
                for (int next : graph[node[0]]) {
                    queue.offer(new int[] {next, node[1] | (1 << next)});
                }
            }
            steps++;
        }
        return -1;
    }
    public int shortestPathLength2(int[][] graph) {
        int N = graph.length;
        Queue<State> queue = new LinkedList<State>();
        int[][] dist = new int[1<<N][N];
        for (int[] row: dist) Arrays.fill(row, N*N);

        for (int x = 0; x < N; ++x) {
            queue.offer(new State(1<<x, x));
            dist[1 << x][x] = 0;
        }

        while (!queue.isEmpty()) {
            State node = queue.poll();
            int d = dist[node.cover][node.head];
            if (node.cover == (1<<N) - 1) return d;

            for (int child: graph[node.head]) {
                int cover2 = node.cover | (1 << child);
                if (d + 1 < dist[cover2][child]) {
                    dist[cover2][child] = d + 1;
                    queue.offer(new State(cover2, child));

                }
            }
        }

        throw null;
    }
    class State {
        int cover, head;
        State(int c, int h) {
            cover = c;
            head = h;
        }
    }
}
