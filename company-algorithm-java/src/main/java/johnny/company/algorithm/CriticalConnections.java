package johnny.company.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Critical Connections
 *
 * Given an underected connected graph with n nodes labeled 1..n. A bridge (cut edge) is defined as an edge which, when removed, makes the graph disconnected (or more precisely, increases the number of connected components in the graph). Equivalently, an edge is a bridge if and only if it is not contained in any cycle. The task is to find all bridges in the given graph. Output an empty list if there are no bridges.
 *
 * Input:
 *
 * n, an int representing the total number of nodes.
 * edges, a list of pairs of integers representing the nodes connected by an edge.
 * Example 1:
 *
 * Input: n = 5, edges = [[1, 2], [1, 3], [3, 4], [1, 4], [4, 5]]
 *
 *
 * Output: [[1, 2], [4, 5]]
 * Explanation:
 * There are 2 bridges:
 * 1. Between node 1 and 2
 * 2. Between node 4 and 5
 * If we remove these edges, then the graph will be disconnected.
 * If we remove any of the remaining edges, the graph will remain connected.
 * Example 2:
 *
 * Input: n = 6, edges = [[1, 2], [1, 3], [2, 3], [2, 4], [2, 5], [4, 6], [5, 6]]
 *
 *
 * Output: []
 * Explanation:
 * We can remove any edge, the graph will remain connected.
 * Example 3:
 *
 * Input: n = 9, edges = [[1, 2], [1, 3], [2, 3], [3, 4], [3, 6], [4, 5], [6, 7], [6, 9], [7, 8], [8, 9]]
 *
 *
 * Output: [[3, 4], [3, 6], [4, 5]]
 *
 * Similar questions: https://leetcode.com/problems/critical-connections-in-a-network/
 *
 * https://leetcode.com/discuss/interview-question/372581
 */
public class CriticalConnections {
    List<int[]> list;
    Map<Integer, Boolean> visited;
    List<int[]> criticalConnections(int n, List<int[]> connections) {

        Map<Integer, HashSet<Integer>> map = new HashMap<>();
        for(int[] connection : connections){
            int u = connection[0];
            int v = connection[1];
            if(map.get(u) == null){
                map.put(u,new HashSet<>());
            }
            map.get(u).add(v);
            if(map.get(v) == null){
                map.put(v,new HashSet<>());
            }
            map.get(v).add(u);
        }

        list = new ArrayList<>();
        for(int i =0;i<connections.size();i++){
            visited = new HashMap<>();
            int[] p = connections.get(i);
            int x = p[0];
            int y = p[1];
            map.get(x).remove(y);
            map.get(y).remove(x);
            DFS(map,1);
            if(visited.size()!=n){
                if(p[0] > p[1])
                    list.add(new int[]{p[1],p[0]});
                else
                    list.add(p);
            }
            map.get(x).add(y);
            map.get(y).add(x);
        }
        return list;
    }

    public void DFS(Map<Integer, HashSet<Integer>> map, int u){
        visited.put(u, true);
        if(map.get(u).size()!=0){
            for(int v : map.get(u)){
                if(visited.getOrDefault(v, false)== false){
                    DFS(map,v);
                }
            }
        }
    }
}
