package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Course Schedule II.
 * <p>
 * There are a total of n courses you have to take, labeled from 0 to n - 1.
 * <p>
 * Some courses may have prerequisites, for example to take course 0 you have to
 * first take course 1, which is expressed as a pair: [0,1]
 * <p>
 * Given the total number of courses and a list of prerequisite pairs, return
 * the ordering of courses you should take to finish all courses.
 * <p>
 * There may be multiple correct orders, you just need to return one of them. If
 * it is impossible to finish all courses, return an empty array.
 * <p>
 * For example:
 * <p>
 * 2, [[1,0]]
 * There are a total of 2 courses to take. To take course 1 you should have
 * finished course 0. So the correct course order is [0,1]
 * <p>
 * 4, [[1,0],[2,0],[3,1],[3,2]]
 * There are a total of 4 courses to take. To take course 3 you should have
 * finished both courses 1 and 2. Both courses 1 and 2 should be taken after you
 * finished course 0. So one correct course order is [0,1,2,3]. Another correct
 * ordering is[0,2,1,3].
 *
 * @author Johnny
 */
public class Solution210 {
    // https://www.youtube.com/watch?v=ddTC4Zovtbc
    // https://www.youtube.com/watch?v=Qqgck2ijUjU
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ans = new int[]{};
        if (numCourses <= 0) {
            return ans;
        }
        if (prerequisites == null || prerequisites.length == 0) {
            ans = new int[numCourses];
            for (int i = 0; i < numCourses; i++) {
                ans[i] = i;
            }
            return ans;
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
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < numCourses; i++) {
            if (dfs(graph, visited, i, stack)) {
                return ans;
            }
        }

        ans = new int[numCourses];
        int i = 0;
        while (!stack.isEmpty()) {
            ans[i] = stack.pop();
            i++;
        }
        return ans;
    }

    // true - cycle found, false - not found yet
    private boolean dfs(List<List<Integer>> graph, int[] visited, int index, Stack stack) {
        if (visited[index] == 1) {
            return true;
        }
        if (visited[index] == 2) {
            return false;
        }
        visited[index] = 1;

        // neighbors
        for (Integer i : graph.get(index)) {
            if (dfs(graph, visited, i, stack)) {
                return true;
            }
        }

        visited[index] = 2;
        stack.push(index);
        return false;
    }

    public int[] findOrder2(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];

        if (numCourses <= 0) {
            return res;
        }
        if (prerequisites == null || prerequisites.length == 0) {
            for (int i = 0; i < numCourses; i++) {
                res[i] = i;
            }
            return res;
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
        while (!queue.isEmpty()) {
            int course = queue.poll();
            res[j] = course;
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
            return res;
        } else {
            return new int[0];
        }
    }
}
