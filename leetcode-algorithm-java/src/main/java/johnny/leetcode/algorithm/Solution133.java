package johnny.leetcode.algorithm;

import johnny.algorithm.common.UndirectedGraphNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Clone Graph.
 * Clone an undirected graph. Each node in the graph contains a label and a
 * list of its neighbors.
 * <p>
 * <p>
 * OJ's undirected graph serialization:
 * Nodes are labeled uniquely.
 * <p>
 * We use # as a separator for each node, and , as a separator for node label
 * and each neighbor of the node.
 * As an example, consider the serialized graph {0,1,2#1,2#2,2}.
 * <p>
 * The graph has a total of three nodes, and therefore contains three parts as
 * separated by #.
 * <p>
 * 1. First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
 * 2. Second node is labeled as 1. Connect node 1 to node 2.
 * 3. Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming
 * a self-cycle.
 * <p>
 * Visually, the graph looks like the following:
 * <p>
 * 1
 * / \
 * /   \
 * 0 --- 2
 * / \
 * \_/
 *
 * @author Johnny
 */
public class Solution133 {
    // dfs, hashmap
    public UndirectedGraphNode cloneGraph2(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }

        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        UndirectedGraphNode head = new UndirectedGraphNode(node.label);
        map.put(node, head);

        DFS(map, node);//DFS
        return head;
    }

    private void DFS(HashMap<UndirectedGraphNode, UndirectedGraphNode> map, UndirectedGraphNode node) {
        if (node == null) {
            return;
        }

        for (UndirectedGraphNode neighbor : node.neighbors) {
            if (!map.containsKey(neighbor)) {
                UndirectedGraphNode newneighbor = new UndirectedGraphNode(neighbor.label);
                map.put(neighbor, newneighbor);
                DFS(map, neighbor);//DFS
            }
            map.get(node).neighbors.add(map.get(neighbor));
        }
    }

    // bfs
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }

        Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        queue.offer(node);

        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        map.put(node, clone);

        while (!queue.isEmpty()) {
            UndirectedGraphNode ugn = queue.poll();
            for (UndirectedGraphNode neighbor : ugn.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new UndirectedGraphNode(neighbor.label));
                    queue.offer(neighbor);
                }
                map.get(ugn).neighbors.add(map.get(neighbor));
            }
        }

        return map.get(node);
    }
}
