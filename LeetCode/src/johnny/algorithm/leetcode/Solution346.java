package johnny.algorithm.leetcode;

import java.util.LinkedList;

/**
 * Moving Average from Data Stream.
 * Given a stream of integers and a window size, calculate the moving average 
 * of all integers in the sliding window.
 * @author Johnny
 */
public class Solution346 {
    //http://www.programcreek.com/2014/05/leetcode-moving-average-from-data-stream-java/
    LinkedList<Integer> queue;
    int size;
 
    /** Initialize your data structure here. */
    public Solution346(int size) {
        this.queue = new LinkedList<Integer>();
        this.size = size;
    }
 
    public double next(int val) {
        queue.offer(val);
        if (queue.size() > this.size){
            queue.poll();
        }
        int sum = 0;
        for (int i: queue) {
            sum = sum + i;
        }
 
        return (double)sum / queue.size();
    }
}
