package johnny.leetcode.algorithm;

import java.util.PriorityQueue;

/**
 * 703. Kth Largest Element in a Stream
 * Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * <p>
 * Your KthLargest class will have a constructor which accepts an integer k and an integer array nums, which contains initial elements from the stream. For each call to the method KthLargest.add, return the element representing the kth largest element in the stream.
 * <p>
 * Example:
 * <p>
 * int k = 3;
 * int[] arr = [4,5,8,2];
 * KthLargest kthLargest = new KthLargest(3, arr);
 * kthLargest.add(3);   // returns 4
 * kthLargest.add(5);   // returns 5
 * kthLargest.add(10);  // returns 5
 * kthLargest.add(9);   // returns 8
 * kthLargest.add(4);   // returns 8
 * Note:
 * You may assume that nums' length ≥ k-1 and k ≥ 1.
 *
 * @author Johnny
 */
public class Solution703 {
    int k = 0;
    private PriorityQueue<Integer> minHeap;

    public Solution703(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>();
        for (int i : nums) {
            if (this.minHeap.size() < k) {
                this.minHeap.offer(i);
            } else {
                if (i > this.minHeap.peek()) {
                    this.minHeap.poll();
                    this.minHeap.offer(i);
                }
            }
        }
    }

    public int add(int val) {
        if (this.minHeap.size() < k) {
            this.minHeap.offer(val);
        } else {
            if (val > this.minHeap.peek()) {
                this.minHeap.poll();
                this.minHeap.offer(val);
            }
        }
        return this.minHeap.peek();
    }
}