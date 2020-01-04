package johnny.lintcode.algorithm;

import johnny.algorithm.common.DirectedGraphNode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Topological Sorting.
 *
 * @author Johnny
 */
public class TopologicalSorting {
    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
        // write your code here
        if (graph == null || graph.size() == 0) {
            return null;
        }

        ArrayList<DirectedGraphNode> res = new ArrayList<>();
        HashMap<DirectedGraphNode, Integer> map = new HashMap<>();
        getInDegree(graph, map);

        for (DirectedGraphNode node : graph) {
            if (!map.containsKey(node)) {
                helper(node, map, res);
            }
        }

        return res;
    }

    private void helper(DirectedGraphNode node,
                        HashMap<DirectedGraphNode, Integer> map,
                        ArrayList<DirectedGraphNode> res) {
        res.add(node);
        //map.put(node, map.get(node) - 1);
        for (int i = 0; i < node.neighbors.size(); i++) {
            DirectedGraphNode neighbor = node.neighbors.get(i);
            map.put(neighbor, map.get(neighbor) - 1);
            if (map.get(neighbor) == 0) {
                helper(neighbor, map, res);
            }
        }
    }

    private void getInDegree(ArrayList<DirectedGraphNode> graph,
                             HashMap<DirectedGraphNode, Integer> map) {
        for (int i = 0; i < graph.size(); i++) {
            DirectedGraphNode node = graph.get(i);
            for (int j = 0; j < node.neighbors.size(); j++) {
                DirectedGraphNode neighbor = node.neighbors.get(j);
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, 1);
                } else {
                    map.put(neighbor, map.get(neighbor) + 1);
                }
            }
        }
    }
}
