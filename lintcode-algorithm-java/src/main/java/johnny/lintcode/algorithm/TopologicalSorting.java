package johnny.lintcode.algorithm;

import johnny.algorithm.common.DirectedGraphNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Topological Sorting.
 *
 * @author Johnny
 */
public class TopologicalSorting {
    public List<DirectedGraphNode> topSort(List<DirectedGraphNode> graph) {
        if (graph == null || graph.size() == 0) {
            return null;
        }
        // calculate indegree
        Map<DirectedGraphNode, Integer> map = new HashMap<>();
        for (DirectedGraphNode node : graph) {
            for (DirectedGraphNode neighbor : node.neighbors) {
                map.put(neighbor, map.getOrDefault(neighbor, 0) + 1);
            }
        }

        ArrayList<DirectedGraphNode> ans = new ArrayList<>();
        // queue
        Queue<DirectedGraphNode> queue = new LinkedList<>();
        for (DirectedGraphNode node : graph) {
            if (!map.containsKey(node)) {
                queue.offer(node);
                ans.add(node);
            }
        }

        // bfs
        while (!queue.isEmpty()) {
            DirectedGraphNode node = queue.poll();
            for (DirectedGraphNode neighbor : node.neighbors) {
                map.put(neighbor, map.get(neighbor) - 1);
                if (map.get(neighbor) == 0) {
                    queue.offer(neighbor);
                    ans.add(neighbor);
                }
            }
        }

        return ans;
    }
    /*
    public List<DirectedGraphNode> topSort(List<DirectedGraphNode> graph) {
        if (graph == null || graph.size() == 0) {
            return null;
        }

        List<DirectedGraphNode> ans = new ArrayList<>();
        Map<DirectedGraphNode, Integer> map = getInDegree(graph);

        for (DirectedGraphNode node : graph) {
            if (!map.containsKey(node)) {
                helper(node, map, ans);
            }
        }

        return ans;
    }

    private void helper(DirectedGraphNode node,
                        Map<DirectedGraphNode, Integer> map,
                        List<DirectedGraphNode> ans) {
        ans.add(node);
        //map.put(node, map.get(node) - 1);
        for (int i = 0; i < node.neighbors.size(); i++) {
            DirectedGraphNode neighbor = node.neighbors.get(i);
            map.put(neighbor, map.get(neighbor) - 1);
            if (map.get(neighbor) == 0) {
                helper(neighbor, map, ans);
            }
        }
    }

    private Map<DirectedGraphNode, Integer> getInDegree(List<DirectedGraphNode> graph) {
        Map<DirectedGraphNode, Integer> map = new HashMap<>();
        for (int i = 0; i < graph.size(); i++) {
            DirectedGraphNode node = graph.get(i);
            for (int j = 0; j < node.neighbors.size(); j++) {
                DirectedGraphNode neighbor = node.neighbors.get(j);
                map.put(neighbor, map.getOrDefault(neighbor, 0) + 1);
            }
        }

        return map;
    }*/
}
