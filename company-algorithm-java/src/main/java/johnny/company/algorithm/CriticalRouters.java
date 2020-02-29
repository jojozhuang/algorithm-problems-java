package johnny.company.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Critical Routers
 *
 * You are given an undirected connected graph. An articulation point (or cut vertex) is defined as a vertex which, when removed along with associated edges, makes the graph disconnected (or more precisely, increases the number of connected components in the graph). The task is to find all articulation points in the given graph.
 *
 * Input:
 * The input to the function/method consists of three arguments:
 *
 * numNodes, an integer representing the number of nodes in the graph.
 * numEdges, an integer representing the number of edges in the graph.
 * edges, the list of pair of integers - A, B representing an edge between the nodes A and B.
 * Output:
 * Return a list of integers representing the critical nodes.
 *
 * Example:
 *
 * Input: numNodes = 7, numEdges = 7, edges = [[0, 1], [0, 2], [1, 3], [2, 3], [2, 5], [5, 6], [3, 4]]
 *
 *
 * Output: [2, 3, 5]
 * Related problems:
 *
 * Critical Connections
 * https://www.geeksforgeeks.org/articulation-points-or-cut-vertices-in-a-graph/
 * https://cp-algorithms.com/graph/cutpoints.html
 *
 * https://leetcode.com/discuss/interview-question/436073/
 */
public class CriticalRouters {
    public List<Integer> getCriticalNodes2(int numLinks, int numRouters, List<int[]> edge) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int i=0;i<numRouters;i++) {
            map.put(i, new HashSet<>());
        }
        for(int[] link : edge) {
            map.get(link[0]).add(link[1]);
            map.get(link[1]).add(link[0]);
        }
        Set<Integer> set = new HashSet<>();
        int[] low = new int[numRouters];
        int[] ids = new int[numRouters];
        int parent[] = new int[numRouters];
        Arrays.fill(ids, -1);
        Arrays.fill(parent, -1);
        for(int i=0;i<numRouters;i++) {
            if(ids[i] == -1)
                dfs(map, low, ids, parent, i, set, new int[1]);
        }
        return new ArrayList<>(set);
    }


    private void dfs(Map<Integer, Set<Integer>> map, int[] low, int[] ids, int[] parent, int cur, Set<Integer> res, int[] time) {
        int children = 0;
        ids[cur] = low[cur]= ++time[0];
        for(int nei : map.get(cur)) {
            if(ids[nei] == -1) {
                children++;
                parent[nei] = cur;
                dfs(map, low, ids, parent,nei, res, time);
                low[cur] = Math.min(low[cur], low[nei]);
                if((parent[cur] == -1 && children > 1) || (parent[cur] != -1 && low[nei] >= ids[cur]))
                    res.add(cur);
            }
            else if(nei != parent[cur])
                low[cur] = Math.min(low[cur], ids[nei]);
        }
    }

    public List<Integer> getCriticalNodes(int numLinks, int numRouters, List<int[]> edges) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numRouters; i++) {
            //i is the edge I'm ignoring
            if (!helper(edges, i, numRouters)) {
                list.add(i);
            }
        }

        return list;
    }


    public boolean helper(List<int[]> edges, int v, int total) {
        HashSet<Integer> set = new HashSet<>();
        boolean firstAdd = false;

        for(int i=0; i< edges.size(); i++){
            //ignores edges that have v as starting or ending point
            if(edges.get(i)[0] == v || edges.get(i)[1] == v)
                continue;

            //adding any edge as the starting point, both vertices
            //will fail if the edges are self edges
            if(!firstAdd){
                set.add(edges.get(i)[0]);
                set.add(edges.get(i)[1]);
                firstAdd = true;
            }

            //if the next edge has one of the edges already in the set, I can visit it
            if(set.contains(edges.get(i)[0]) || set.contains(edges.get(i)[1])){
                set.add(edges.get(i)[0]);
                set.add(edges.get(i)[1]);
            }
        }

        //if total visited elements equals all vertices - removed vertice
        return set.size() == total - 1;
    }
}
