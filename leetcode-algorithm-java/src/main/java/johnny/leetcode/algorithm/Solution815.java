package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 *815. Bus Routes
We have a list of bus routes. Each routes[i] is a bus route that the i-th bus repeats forever. For example if routes[0] = [1, 5, 7], this means that the first bus (0-th indexed) travels in the sequence 1->5->7->1->5->7->1->... forever.

We start at bus stop S (initially not on a bus), and we want to go to bus stop T. Travelling by buses only, what is the least number of buses we must take to reach our destination? Return -1 if it is not possible.

Example:
Input: 
routes = [[1, 2, 7], [3, 6, 7]]
S = 1
T = 6
Output: 2
Explanation: 
The best strategy is take the first bus to the bus stop 7, then take the second bus to the bus stop 6.
Note:

1 <= routes.length <= 500.
1 <= routes[i].length <= 500.
0 <= routes[i][j] < 10 ^ 6.
 * @author Johnny
 */
public class Solution815 {
    public int numBusesToDestination(int[][] routes, int S, int T) {
        if (S == T) {
            return 0;
        }
        
        // map, stop -> buses
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < routes.length; i++) {
            for (int stop : routes[i]) {
                List<Integer> buses = map.getOrDefault(stop, new ArrayList<>());
                buses.add(i);
                map.put(stop, buses);
            }
        }
        // visited bus
        boolean[] visited = new boolean[routes.length];

        int ans = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(S);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            ans++;
            for (int i = 0; i < size; i++) {
                int curr = queue.poll();
                for (int bus : map.get(curr)) {
                    if (visited[bus]) {
                        continue;
                    }
                    visited[bus] = true;
                    for (int stop : routes[bus]) {
                        if (stop == T) {
                            return ans;
                        }
                        queue.offer(stop);
                    }
                }
            }
        }
        
        return -1;
    }
    public int numBusesToDestination2(int[][] routes, int S, int T) {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int ret = 0; 
         
        if (S==T) return 0; 
         
        for(int i = 0; i < routes.length; i++){
             for(int j = 0; j < routes[i].length; j++){
                 ArrayList<Integer> buses = map.getOrDefault(routes[i][j], new ArrayList<>());
                 buses.add(i);
                 map.put(routes[i][j], buses);
             }       
         }
                 
        q.offer(S); 
        while (!q.isEmpty()) {
            int len = q.size();
            ret++;
            for (int i = 0; i < len; i++) {
                int cur = q.poll();
                ArrayList<Integer> buses = map.get(cur);
                for (int bus: buses) {
                     if (visited.contains(bus)) continue;
                     visited.add(bus);
                     for (int j = 0; j < routes[bus].length; j++) {
                         if (routes[bus][j] == T) return ret;
                         q.offer(routes[bus][j]);  
                    }
                }
            }
         }
         return -1;
    }
}
