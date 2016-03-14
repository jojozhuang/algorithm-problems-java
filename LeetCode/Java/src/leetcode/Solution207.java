/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    //http://www.programcreek.com/2014/05/leetcode-course-schedule-java/
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses <= 0) {
            return false;
        }
        if (prerequisites == null || prerequisites.length == 0) {              
            return true;
        }
        
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < prerequisites.length; i++) {
            int[] pre = prerequisites[i];
            if (map.containsKey(pre[1])) {
                List<Integer> list = map.get(pre[1]);
                list.add(pre[0]);
                map.put(pre[1], list);
            } else {
                List<Integer> list = new ArrayList<Integer>();
                list.add(pre[0]);
                map.put(pre[1], list);
            }
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
