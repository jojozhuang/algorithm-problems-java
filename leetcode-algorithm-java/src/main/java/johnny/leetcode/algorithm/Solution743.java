package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 743. Network Delay Time
 * There are N network nodes, labelled 1 to N.
 * <p>
 * Given times, a list of travel times as directed edges times[i] = (u, v, w), where u is the source node, v is the target node, and w is the time it takes for a signal to travel from source to target.
 * <p>
 * Now, we send a signal from a certain node K. How long will it take for all nodes to receive the signal? If it is impossible, return -1.
 * <p>
 * Note:
 * N will be in the range [1, 100].
 * K will be in the range [1, N].
 * The length of times will be in the range [1, 6000].
 * All edges times[i] = (u, v, w) will have 1 <= u, v <= N and 1 <= w <= 100.
 *
 * @author Johnny
 */
public class Solution743 {
    public int networkDelayTime(int[][] times, int N, int K) {
        if (times == null || times.length == 0) {
            return -1;
        }
        // store the source node as key. The value is another map of the neighbor nodes and distance.
        Map<Integer, Map<Integer, Integer>> path = new HashMap<>();
        for (int[] time : times) {
            Map<Integer, Integer> sourceMap = path.get(time[0]);
            if (sourceMap == null) {
                sourceMap = new HashMap<>();
                path.put(time[0], sourceMap);
            }
            Integer dis = sourceMap.get(time[1]);
            if (dis == null || dis > time[2]) {
                sourceMap.put(time[1], time[2]);
            }

        }

        //Use PriorityQueue to get the node with shortest absolute distance 
        //and calculate the absolute distance of its neighbor nodes.
        Map<Integer, Integer> distanceMap = new HashMap<>();
        distanceMap.put(K, 0);
        PriorityQueue<int[]> pq = new PriorityQueue<>((i1, i2) -> {
            return i1[1] - i2[1];
        });
        pq.offer(new int[]{K, 0});
        int max = -1;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int node = cur[0];
            int distance = cur[1];

            // Ignore processed nodes
            if (distanceMap.containsKey(node) && distanceMap.get(node) < distance) {
                continue;
            }

            Map<Integer, Integer> sourceMap = path.get(node);
            if (sourceMap == null) {
                continue;
            }
            for (Map.Entry<Integer, Integer> entry : sourceMap.entrySet()) {
                int absoluteDistence = distance + entry.getValue();
                int targetNode = entry.getKey();
                if (distanceMap.containsKey(targetNode) && distanceMap.get(targetNode) <= absoluteDistence) {
                    continue;
                }
                distanceMap.put(targetNode, absoluteDistence);
                pq.offer(new int[]{targetNode, absoluteDistence});
            }
        }
        // get the largest absolute distance.
        for (int val : distanceMap.values()) {
            if (val > max) {
                max = val;
            }
        }
        return distanceMap.size() == N ? max : -1;
    }
}
