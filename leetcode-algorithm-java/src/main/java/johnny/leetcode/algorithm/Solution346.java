package johnny.leetcode.algorithm;

import java.util.LinkedList;

/**
 * Moving Average from Data Stream.
 * Given a stream of integers and a window size, calculate the moving average
 * of all integers in the sliding window.
 *
 * @author Johnny
 */
public class Solution346 {
    LinkedList<Integer> queue;
    int size;
    int sum = 0;

    /**
     * Initialize your data structure here.
     */
    public Solution346(int size) {
        this.queue = new LinkedList<Integer>();
        this.size = size;
    }

    public double next(int val) {
        queue.offer(val);
        sum += val;
        if (queue.size() > size) {
            sum -= queue.poll();
        }

        return (double) sum / queue.size();
    }
}
