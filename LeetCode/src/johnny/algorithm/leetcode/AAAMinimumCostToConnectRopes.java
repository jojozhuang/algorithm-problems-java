package johnny.algorithm.leetcode;

import java.util.PriorityQueue;

//https://www.geeksforgeeks.org/connect-n-ropes-minimum-cost/
//similar question like 'assemble parts'
// https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=498030&extra=&page=1
public class AAAMinimumCostToConnectRopes {
    public int connect(int[] ropes) {
        if (ropes == null || ropes.length == 0) {
            return 0;
        }
        
        int cost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int rope : ropes) {
            pq.offer(rope);
        }
        
        while (pq.size() > 1) {
            int sum = pq.poll() + pq.poll();
            cost += sum;
            pq.offer(sum);
        }
        
        return cost;
    }
}
