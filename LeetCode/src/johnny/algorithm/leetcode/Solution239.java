package johnny.algorithm.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Sliding Window Maximum.
 * 
 * Given an array nums, there is a sliding window of size k which is moving from
 * the very left of the array to the very right. You can only see the k numbers 
 * in the window. Each time the sliding window moves right by one position.
 * 
 * For example,
 * Given nums = [1,3,-1,-3,5,3,6,7], and k = 3.
 * 
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 * Therefore, return the max sliding window as [3,3,5,5,6,7].
 * 
 * Note: 
 * You may assume k is always valid, ie: 1 ≤ k ≤ input array's size for non-empty array.
 *  
 * @author Johnny
 */
public class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[]{};
        if (nums == null) {
            return res;
        }
        
        int n = nums.length;
        if (k < 1 || k > n) {
            return res;
        }
        
        res = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<Integer>();
        
        int i = 0;
        while (i < k - 1) {
            while (!deque.isEmpty() && nums[i] > nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            i++;
        }
        
        for (i = k - 1; i < n; i++) {
            while (!deque.isEmpty() && nums[i] > nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i - k >= deque.peekFirst()) {
                deque.pollFirst();
            }
            res[i - k + 1] = nums[deque.peekFirst()];
        }
        
        return res;
    }
    public int[] maxSlidingWindow2(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1 || k > nums.length) {
            return new int[]{};
        }        
        
        int[] res = new int[nums.length - k + 1];
        
        Deque<Integer> deque = new LinkedList<Integer>();
        // initial deque
        for (int i = 0; i < k; i++) {
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.add(i);
        }
        
        res[0] = nums[deque.peekFirst()];
        
        for (int i = k; i < nums.length; i++) {
            while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.add(i);
            if (i - deque.peekFirst() >= k) {
                deque.pollFirst();
            }
            res[i - k + 1] = nums[deque.peekFirst()];
        }
        
        return res;
    }
}
