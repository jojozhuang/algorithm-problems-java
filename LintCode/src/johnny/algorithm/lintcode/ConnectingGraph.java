/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Connecting Graph
 * 
 * Given n nodes in a graph labeled from 1 to n. There is no edges in the graph
 * at beginning.
 * 
 * You need to support the following method:
 * 1. connect(a, b), add an edge to connect node a and node b. 
 * 2.query(a, b)`, check if two nodes are connected
 * 
 * Example
 * 5 // n = 5
 * query(1, 2) return false
 * connect(1, 2)
 * query(1, 3) return false
 * connect(2, 4)
 * query(1, 4) return true
* 
 * @author Johnny
 */
public class ConnectingGraph {
    int[] nodes;
    
    public ConnectingGraph(int n) {
        nodes = new int[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = i;
        }
    }

    public void connect(int a, int b) {
        if (a <= 0 || a > nodes.length || b <= 0 || b > nodes.length) {
            return;
        }
        
        int group = nodes[a - 1];
        for (int i = 0; i < nodes.length; i++) {
            if(nodes[i] == group) {
                nodes[i] = nodes[b - 1];
            }
        }
    }
  

    public boolean query(int a, int b) {
        if (a <= 0 || a > nodes.length || b <= 0 || b > nodes.length) {
            return false;
        }
        
        return nodes[a - 1] == nodes[b - 1];
    }
}
/*
public class ConnectingGraph {
    Map<Integer, UndirectedGraphNode> map = new HashMap<Integer, UndirectedGraphNode>();
    Set<UndirectedGraphNode> visited = new HashSet<UndirectedGraphNode>();
    
    public ConnectingGraph(int n) {
        for (int i = 1; i <= n; i++) {
            map.put(i, new UndirectedGraphNode(i));
        }
    }

    public void connect(int a, int b) {
        UndirectedGraphNode node1 = map.get(a);
        UndirectedGraphNode node2 = map.get(b);
        if (node1 == null || node2 == null) {
            return;
        }

        node1.neighbors.add(node2);
        node2.neighbors.add(node1);
    }
  

    public boolean query(int a, int b) {
        UndirectedGraphNode node1 = map.get(a);
        UndirectedGraphNode node2 = map.get(b);
        if (node1 == null || node2 == null) {
            return false;
        }
        
        if (node1.neighbors == null || node1.neighbors.size() == 0 ||
            node2.neighbors == null || node2.neighbors.size() == 0 ) {
            return false;
        }
        
        visited = new HashSet<UndirectedGraphNode>();
        return dfs(node1, node2, visited);
    }
    
    private boolean dfs(UndirectedGraphNode node1, UndirectedGraphNode node2, Set<UndirectedGraphNode> visited) {
        if (node1.equals(node2)) {
            return true;
        }
        
        visited.add(node1);
        
        if (node1.neighbors.contains(node2)) {
            return true;
        }
        
        for (UndirectedGraphNode neighbor: node1.neighbors) {
            if (visited.contains(neighbor)) {
                continue;
            }
            visited.add(neighbor);
            if(dfs(neighbor, node2, visited)) {
                return true;
            }
        }
        
        return false;
    }
}*/
