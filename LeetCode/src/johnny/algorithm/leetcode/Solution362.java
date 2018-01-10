package johnny.algorithm.leetcode;

/**
 * Design Hit Counter.
 * Design a hit counter which counts the number of hits received in the past 5 
 * minutes.
 * 
 * Each function accepts a timestamp parameter (in seconds granularity) and you 
 * may assume that calls are being made to the system in chronological order 
 * (ie, the timestamp is monotonically increasing). You may assume that the 
 * earliest timestamp starts at 1.
 * 
 * It is possible that several hits arrive roughly at the same time.
 * 
 * @author Johnny
 */
public class Solution362 {
    /*
    Queue<Integer> queue = new LinkedList<Integer>();
    // Initialize your data structure here.
    public Solution362() {
        
    }
    
    // Record a hit.
    //    @param timestamp - The current timestamp (in seconds granularity).
    public void hit(int timestamp) {
        queue.offer(timestamp);
    }
    
    public int getHits(int timestamp) {
        while (!queue.isEmpty()) {
            if (timestamp - queue.peek() >= 300) {
                queue.poll();
            } else {
                break;
            }
        }
        
        return queue.size();
    }*/
    
    int[] times = new int[300];
    int[] hits = new int[300];
     /** Initialize your data structure here. */
    public Solution362() {
        
    }
    
     /** Record a hit.
        @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
        int index = timestamp % 300;
        if (times[index] != timestamp) {
            times[index] = timestamp;
            hits[index] = 1;
        } else {
            hits[index]++;
        }
    }
    
    public int getHits(int timestamp) {
        int sum = 0;
        for (int i = 0; i < 300; i++) {
            if (timestamp - times[i] < 300) {
                sum += hits[i];
            }
        }
        
        return sum;
    }
}
