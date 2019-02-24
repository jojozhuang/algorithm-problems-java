package johnny.algorithm.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *675. Cut Off Trees for Golf Event
 *You are asked to cut off trees in a forest for a golf event. The forest is represented as 
 *a non-negative 2D map, in this map:

0 represents the obstacle can't be reached.
1 represents the ground can be walked through.
The place with number bigger than 1 represents a tree can be walked through, and this positive 
number represents the tree's height.
You are asked to cut off all the trees in this forest in the order of tree's height - always cut
 off the tree with lowest height first. And after cutting, the original place has the tree will
  become a grass (value 1).

You will start from the point (0, 0) and you should output the minimum steps you need to walk to
 cut off all the trees. If you can't cut off all the trees, output -1 in that situation.

You are guaranteed that no two trees have the same height and there is at least one tree needs to 
be cut off.

Example 1:
Input: 
[
 [1,2,3],
 [0,0,4],
 [7,6,5]
]
Output: 6
Example 2:
Input: 
[
 [1,2,3],
 [0,0,0],
 [7,6,5]
]
Output: -1
Example 3:
Input: 
[
 [2,3,4],
 [0,0,5],
 [8,7,6]
]
Output: 6
Explanation: You started from the point (0,0) and you can cut off the tree in (0,0) directly without
 walking.
Hint: size of the given matrix will not exceed 50x50.

 * @author Johnny
 */
public class Solution675 {
    public int cutOffTree(List<List<Integer>> forest) {
        if (forest == null || forest.size() == 0) {
            return 0;
        }
        
        int m = forest.size();
        int n = forest.get(0).size();
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->a[2]-b[2]);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (forest.get(i).get(j) > 0) {
                    pq.offer(new int[] {i,j,forest.get(i).get(j)});
                }
            }
        }
        
        int sr = 0;
        int sc = 0;
        int ans = 0;
        while (!pq.isEmpty()) {
            int[] tree = pq.poll();
            int steps = bfs(forest, sr, sc, tree[0], tree[1]);
            if (steps < 0) { // not found
                return -1;
            }
            
            ans += steps;
            sr = tree[0];
            sc = tree[1];
        }
        
        return ans;
    }
    
    
    private int bfs(List<List<Integer>> forest, int sr, int sc, int tr, int tc) {
        int[][] dir = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        int m = forest.size();
        int n = forest.get(0).size();
        boolean[][] visited = new boolean[m][n];
        
        int steps = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {sr, sc});
        visited[sr][sc] = true;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                if (curr[0] == tr && curr[1] == tc) {
                    return steps;
                }
                for (int[] d : dir) {
                    int nr = curr[0] + d[0];
                    int nc = curr[1] + d[1];
                    if (nr < 0 || nr >= m || nc < 0 || nc >= n 
                            || forest.get(nr).get(nc) == 0 
                            || visited[nr][nc]) {
                        continue;
                    }
                    visited[nr][nc] = true;
                    queue.offer(new int[] {nr, nc});
                }
            }
            steps++;
        }
        
        return -1;
    }
}
