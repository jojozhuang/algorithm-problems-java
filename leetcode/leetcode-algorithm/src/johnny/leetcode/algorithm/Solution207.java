package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Course Schedule.
 * 
 * There are a total of n courses you have to take, labeled from 0 to n - 1.
 * 
 * Some courses may have prerequisites, for example to take course 0 you have to
 * first take course 1, which is expressed as a pair: [0,1]
 * 
 * Given the total number of courses and a list of prerequisite pairs, is it 
 * possible for you to finish all courses?
 * 
 * For example:
 * 
 * 2, [[1,0]]
 * There are a total of 2 courses to take. To take course 1 you should have 
 * finished course 0. So it is possible.
 * 
 * 2, [[1,0],[0,1]]
 * There are a total of 2 courses to take. To take course 1 you should have 
 * finished course 0, and to take course 0 you should also have finished 
 * course 1. So it is impossible.
 * 
 * @author Johnny
 */
public class Solution207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses <= 0) {
            return false;
        }
        if (prerequisites == null || prerequisites.length == 0) {
            return true;
        }
        
        List<List<Integer>> graph = new ArrayList<List<Integer>>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<Integer>());
        }
        
        for (int[] prer : prerequisites) {
            graph.get(prer[1]).add(prer[0]);
        }
        
        // status: 0-initial, 1-visiting, 2-visited
        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (dfs(graph, visited, i)) {
                return false;
            }
        }
        
        return true;
    }
    
    // true - cycle found, false - not found yet
    private boolean dfs (List<List<Integer>> graph, int[] visited, int index) {
        if (visited[index] == 1) {
            return true;
        }
        if (visited[index] == 2) {
            return false;
        }
        visited[index] = 1;
        
        // neighbors
        for (Integer i : graph.get(index)) {
            if (dfs(graph, visited, i)) {
                return true;
            }
        }
        
        visited[index] = 2;
        return false;
    }
    // BFS
    public boolean canFinish3(int numCourses, int[][] prerequisites) {
        if (numCourses <= 0) {
            return false;
        }
        if (prerequisites == null || prerequisites.length == 0) {
            return true;
        }
        int[][] matrix = new int[numCourses][numCourses]; // i -> j
        int[] indegree = new int[numCourses];
        
        for (int i=0; i<prerequisites.length; i++) {
            int ready = prerequisites[i][0];
            int pre = prerequisites[i][1];
            if (matrix[pre][ready] == 0)
                indegree[ready]++; //duplicate case
            matrix[pre][ready] = 1;
        }
        
        int count = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i=0; i<indegree.length; i++) {
            if (indegree[i] == 0) queue.offer(i);
        }
        while (!queue.isEmpty()) {
            int course = queue.poll();
            count++;
            for (int i=0; i<numCourses; i++) {
                if (matrix[course][i] != 0) {
                    if (--indegree[i] == 0)
                        queue.offer(i);
                }
            }
        }
        return count == numCourses;
    }
    // DFS
    public boolean canFinish4(int numCourses, int[][] prerequisites) {
        if (numCourses <= 0) {
            return false;
        }
        if (prerequisites == null || prerequisites.length == 0) {
            return true;
        }
        
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<Integer>();
        }
            
        boolean[] visited = new boolean[numCourses];
        for(int i = 0; i < prerequisites.length; i++){
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
        }

        for (int i = 0; i < numCourses; i++){
            if (!dfs(graph,visited,i)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(ArrayList<Integer>[] graph, boolean[] visited, int course){
        if (visited[course]) {
            return false;
        } else {
            visited[course] = true;;
        }

        for (int i = 0; i < graph[course].size(); i++) {
            if (!dfs(graph, visited, (int)graph[course].get(i))) {
                return false;
            }
        }
        visited[course] = false;
        return true;
    }
    
    //DFS
    //http://www.programcreek.com/2014/05/leetcode-course-schedule-java/
    public boolean canFinish2(int numCourses, int[][] prerequisites) {
        if (numCourses <= 0) {
            return false;
        }
        if (prerequisites == null || prerequisites.length == 0) {
            return true;
        }
        
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < prerequisites.length; i++) {
            int[] pre = prerequisites[i];
            if (!map.containsKey(pre[1])) {
                map.put(pre[1], new ArrayList<Integer>());
            }
            map.get(pre[1]).add(pre[0]);
        }
        
        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(map, visited, i)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean dfs(Map<Integer, List<Integer>> map, int[] visited, int i) {
        if (visited[i] == -1) {
            return false;
        } else if (visited[i] == 1) {
            return true;
        }
        
        visited[i] = -1;
        if (map.containsKey(i)) {
            for (int j : map.get(i)) {
                if (!dfs(map, visited, j)) {
                    return false;
                }
            }
        }
        visited[i] = 1;
        return true;
    }
}
