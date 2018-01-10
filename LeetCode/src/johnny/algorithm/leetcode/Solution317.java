package johnny.algorithm.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Shortest Distance from All Buildings.
 * You want to build a house on an empty land which reaches all buildings in 
 * the shortest amount of distance. You can only move up, down, left and right. 
 * You are given a 2D grid of values 0, 1 or 2, where:
 * 
 * Each 0 marks an empty land which you can pass by freely.
 * Each 1 marks a building which you cannot pass through.
 * Each 2 marks an obstacle which you cannot pass through.
 * 
 * For example, given three buildings at (0,0), (0,4), (2,2), and an obstacle 
 * at (0,2). The point (1,2) is an ideal empty land to build a house, as the 
 * total travel distance of 3+3+1=7 is minimal. So return 7.
 *  
 * @author Johnny
 */
public class Solution317 {
    //https://segmentfault.com/a/1190000004187914
    public int shortestDistance(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return -1;
        }
        int rows = grid.length;
        int cols = grid[0].length;
 
        // 记录到各个building距离和
        int[][] dist = new int[rows][cols];
        
        // 记录到能到达的building的数量
        int[][] nums = new int[rows][cols];            
        int buildingNum = 0;
        
        // 从每个building开始BFS
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    buildingNum++;
                    bfs(grid, i, j, dist, nums);
                }
            }
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0 && dist[i][j] != 0 && nums[i][j] == buildingNum)
                    min = Math.min(min, dist[i][j]);
            }
        }
        if (min < Integer.MAX_VALUE)
            return min;
        return -1;
    }
    
    private void bfs(int[][] grid, int row, int col, int[][] dist, int[][] nums) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{row, col});
        int[][] dirs = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        
        // 记录访问过的点
        boolean[][] visited = new boolean[rows][cols];
        int level = 0;
        while (!q.isEmpty()) {
            level++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] coords = q.remove();
                for (int k = 0; k < dirs.length; k++) {
                    int x = coords[0] + dirs[k][0];
                    int y = coords[1] + dirs[k][1];
                    if (x >= 0 && x < rows && y >= 0 && y < cols && !visited[x][y] && grid[x][y] == 0) {
                        visited[x][y] = true;
                        dist[x][y] += level;
                        nums[x][y]++;
                        q.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}
