package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 787. Cheapest Flights Within K Stops
 * There are n cities connected by m flights. Each fight starts from city u and arrives at v with a price w.
 * <p>
 * Now given all the cities and fights, together with starting city src and the destination dst, your task is to find the cheapest price from src to dst with up to k stops. If there is no such route, output -1.
 * <p>
 * Example 1:
 * Input:
 * n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
 * src = 0, dst = 2, k = 1
 * Output: 200
 * Explanation:
 * The graph looks like this:
 * <p>
 * <p>
 * The cheapest price from city 0 to city 2 with at most 1 stop costs 200, as marked red in the picture.
 * Example 2:
 * Input:
 * n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
 * src = 0, dst = 2, k = 0
 * Output: 500
 * Explanation:
 * The graph looks like this:
 * <p>
 * <p>
 * The cheapest price from city 0 to city 2 with at most 0 stop costs 500, as marked blue in the picture.
 * Note:
 * <p>
 * The number of nodes n will be in range [1, 100], with nodes labeled from 0 to n - 1.
 * The size of flights will be in range [0, n * (n - 1) / 2].
 * The format of each flight will be (src, dst, price).
 * The price of each flight will be in the range [1, 10000].
 * k is in the range of [0, n - 1].
 * There will not be any duplicated flights or self cycles.
 *
 * @author Johnny
 */
public class Solution787 {
    // bfs
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        if (flights.length == 0 || flights[0].length == 0) {
            return 0;
        }
        // construct graph
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<int[]>());
        }
        for (int[] flight : flights) {
            graph.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }

        int ans = Integer.MAX_VALUE;
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{src, 0});
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] flight = queue.poll();
                if (flight[0] == dst) {
                    ans = Math.min(ans, flight[1]);
                }
                for (int[] next : graph.get(flight[0])) {
                    if (flight[1] + next[1] > ans) {
                        continue;// pruning
                    }
                    queue.offer(new int[]{next[0], flight[1] + next[1]});
                }
            }
            count++;
            if (count > K + 1) {
                break;
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public int findCheapestPrice2(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, Map<Integer, Integer>> prices = new HashMap<>();
        for (int[] f : flights) {
            if (!prices.containsKey(f[0])) prices.put(f[0], new HashMap<>());
            prices.get(f[0]).put(f[1], f[2]);
        }
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> (Integer.compare(a[0], b[0])));
        pq.add(new int[]{0, src, k + 1});
        while (!pq.isEmpty()) {
            int[] top = pq.remove();
            int price = top[0];
            int city = top[1];
            int stops = top[2];
            if (city == dst) return price;
            if (stops > 0) {
                Map<Integer, Integer> adj = prices.getOrDefault(city, new HashMap<>());
                for (int a : adj.keySet()) {
                    pq.add(new int[]{price + adj.get(a), a, stops - 1});
                }
            }
        }
        return -1;
    }

    // dfs
    public int findCheapestPrice3(int n, int[][] flights, int src, int dst, int K) {
        if (flights.length == 0 || flights[0].length == 0) {
            return 0;
        }
        // construct graph
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<int[]>());
        }
        for (int[] flight : flights) {
            graph.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }

        // search via DFS
        int[] ans = new int[]{Integer.MAX_VALUE};
        boolean[] visited = new boolean[n];
        dfs(graph, src, dst, 0, 0, visited, K, ans);

        return ans[0] == Integer.MAX_VALUE ? -1 : ans[0];
    }

    private void dfs(List<List<int[]>> graph, int src, int dst, int cost, int count, boolean[] visited, int K, int[] ans) {
        if (count > K + 1) {
            return;
        }

        if (src == dst) {
            if (cost < ans[0]) {
                ans[0] = cost;
            }
            return;
        }

        visited[src] = true;
        for (int[] flight : graph.get(src)) {
            if (cost > ans[0] || visited[flight[0]]) { // pruning
                continue;
            }
            dfs(graph, flight[0], dst, cost + flight[1], count + 1, visited, K, ans);
        }

        visited[src] = false;
    }
}
