/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Course Schedule II.
 * 
 * There are a total of n courses you have to take, labeled from 0 to n - 1.
 * 
 * Some courses may have prerequisites, for example to take course 0 you have to
 * first take course 1, which is expressed as a pair: [0,1]
 * 
 * Given the total number of courses and a list of prerequisite pairs, return 
 * the ordering of courses you should take to finish all courses.
 * 
 * There may be multiple correct orders, you just need to return one of them. If
 * it is impossible to finish all courses, return an empty array.
 * 
 * For example:
 * 
 * 2, [[1,0]]
 * There are a total of 2 courses to take. To take course 1 you should have 
 * finished course 0. So the correct course order is [0,1]
 * 
 * 4, [[1,0],[2,0],[3,1],[3,2]]
 * There are a total of 4 courses to take. To take course 3 you should have 
 * finished both courses 1 and 2. Both courses 1 and 2 should be taken after you
 * finished course 0. So one correct course order is [0,1,2,3]. Another correct
 * ordering is[0,2,1,3].
 * 
 * @author Johnny
 */
public class Solution210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ret = new int[numCourses];
        
        if (numCourses <= 0) {
            return ret;
        }
        if (prerequisites == null || prerequisites.length == 0) {              
            for(int i = 0; i < numCourses; i++){
                ret[i] = i;
            }
            return ret;
        }
        
        int len = prerequisites.length;
        //  prerequisit count of each course
        int[] pCounter = new int[numCourses];
        for (int i = 0; i < len; i++) {
            pCounter[prerequisites[i][0]]++;
        }
        
        Queue<Integer> queue = new LinkedList<Integer>();
        // courses without prerequisite
        for (int i = 0; i < numCourses; i++) {
            if (pCounter[i] == 0) {
                queue.offer(i);
            }
        }
        
        int j = 0;
        while(!queue.isEmpty()) {
            int course =  queue.poll();            
            ret[j] = course;
            j++;
            // find our any other course depends on it
            for (int i = 0; i < len; i++) {
                if (prerequisites[i][1] == course) {
                    pCounter[prerequisites[i][0]]--; // remove dependency
                    if (pCounter[prerequisites[i][0]] == 0) {
                        // no dependency, it is free to select
                        queue.add(prerequisites[i][0]);
                    }
                }
            }
        }
        
        if (j == numCourses) {
            return ret;
        } else {
            return new int[0];
        }
    }
}
