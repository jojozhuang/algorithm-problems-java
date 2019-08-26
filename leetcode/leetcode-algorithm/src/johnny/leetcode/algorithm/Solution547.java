package johnny.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Friend Circles
 * 
 * There are N students in a class. Some of them are friends, while some are not.
 * Their friendship is transitive in nature. For example, if A is a direct 
 * friend of B, and B is a direct friend of C, then A is an indirect friend of 
 * C. And we defined a friend circle is a group of students who are direct or 
 * indirect friends.
 * 
 * Given a N*N matrix M representing the friend relationship between students 
 * in the class. If M[i][j] = 1, then the ith and jth students are direct 
 * friends with each other, otherwise not. And you have to output the total 
 * number of friend circles among all the students.
 * 
 * Example 1:
 * Input: 
 * [[1,1,0],
 * [1,1,0],
 * [0,0,1]]
 * Output: 2
 * Explanation:The 0th and 1st students are direct friends, so they are in a 
 * friend circle. 
 * The 2nd student himself is in a friend circle. So return 2.
 * 
 * Example 2:
 * Input: 
 * [[1,1,0],
 * [1,1,1],
 * [0,1,1]]
 * Output: 1
 * Explanation:The 0th and 1st students are direct friends, the 1st and 2nd 
 * students are direct friends, 
 * so the 0th and 2nd students are indirect friends. All of them are in the same
 * friend circle, so return 1.
 * 
 * Note:
 * 1. N is in range [1,200].
 * 2. M[i][i] = 1 for all students.
 * 3. If M[i][j] = 1, then M[j][i] = 1.
 * 
 * @author Johnny
 */
public class Solution547 {
    public class DSU { // Disjoint Set Union with Rank
        public int[] parents;
        public int[] rank;

        public DSU(int size) {
            parents = new int[size];
            for (int i = 0; i < parents.length; i++) {
                // Initially, all elements are in their own set.
                parents[i] = i;
            }
            rank = new int[size];
        }

        // Path Compression
        public int find(int i) {
            while (parents[i] != i) {
                parents[i] = parents[parents[i]];
                i = parents[i];
            }
            return parents[i];
        }

        // Union by rank
        public void union(int i, int j) {
            int p1 = find(i);
            int p2 = find(j);
            if (p1 == p2) {
                return;
            }

            // If root1’s rank is less than root2’s rank
            if (rank[p1] < rank[p2]) {
                // Then move root1 under root2
                parents[p1] = p2;
            // If root1’s rank is larger than root2’s rank
            } else if (rank[p1] > rank[p2]) {
                // Then move root2 under root1
                parents[p2] = p1;
            // if ranks are the same
            } else {
                // Then move root1 under root2 (doesn't matter which one goes where)
                parents[p1] = p2;
                rank[p2]++;
            }
        }
    }
    
    public int findCircleNum(int[][] M) {
        DSU dsu = new DSU(M.length);
        for (int i = 0; i < M.length - 1; i++) {
            for (int j = i + 1; j < M.length; j++) {
                if (M[i][j] == 1) {
                    dsu.union(i, j);
                }
            }
        }
        
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < M.length; i++) {
            set.add(dsu.find(i));
        }
        
        return set.size();
    }
    /*
    public class DSU { // Disjoint Set Union with Rank
        public int count;
        public int[] parents;
        public int[] rank;

        public DSU(int size) {
            count = size;
            parents = new int[size];
            for (int i = 0; i < parents.length; i++) {
                // Initially, all elements are in their own set.
                parents[i] = i;
            }
            rank = new int[size];
        }

        // Path Compression
        public int find(int i) {
            while (parents[i] != i) {
                parents[i] = parents[parents[i]];
                i = parents[i];
            }
            return parents[i];
        }

        // Union by rank
        public void union(int i, int j) {
            int p1 = find(i);
            int p2 = find(j);
            if (p1 == p2) {
                return;
            }

            // If root1’s rank is less than root2’s rank
            if (rank[p1] < rank[p2]) {
                // Then move root1 under root2
                parents[p1] = p2;
            // If root1’s rank is larger than root2’s rank
            } else if (rank[p1] > rank[p2]) {
                // Then move root2 under root1
                parents[p2] = p1;
            // if ranks are the same
            } else {
                // Then move root1 under root2 (doesn't matter which one goes where)
                parents[p1] = p2;
                rank[p2]++;
            }
            count--;
        }
    }
    
    public int findCircleNum(int[][] M) {
        DSU dsu = new DSU(M.length);
        for (int i = 0; i < M.length - 1; i++) {
            for (int j = i + 1; j < M.length; j++) {
                if (M[i][j] == 1) {
                    dsu.union(i, j);
                }
            }
        }
        
        return dsu.count;
    }*/
    
    public int findCircleNum2(int[][] M) {
        int[] visited = new int[M.length];
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (visited[i] == 0) {
                dfs(M, visited, i);
                count++;
            }
        }
        return count;
    }  
    public void dfs(int[][] M, int[] visited, int i) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(M, visited, j);
            }
        }
    }
    
    // change original matrix
    public int findCircleNum3(int[][] M) {
        if (M == null || M.length == 0 || M[0].length == 0) {
            return 0;
        }
        
        int n = M.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (M[i][i] == 1) {
                dfs(M, i, n);
                ans++;
            }
        }
        
        return ans;
    }
    
    private void dfs(int[][] grid, int curr, int n) {
        for (int i = 0; i < n; i++) {
            if (grid[curr][i] == 1) {
                grid[curr][i] = 0;
                grid[i][curr] = 0;
                dfs(grid, i, n);
            }
        }
    }
}
