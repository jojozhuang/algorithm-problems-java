package johnny.leetcode.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Comparator;

/**
 * Kth Largest Element in an Array.
 * 
 * Find the kth largest element in an unsorted array. Note that it is the kth 
 * largest element in the sorted order, not the kth distinct element.
 * 
 * For example,
 * Given [3,2,1,5,6,4] and k = 2, return 5.
 * 
 * In array [1,2,3,4,5], the 1st largest element is 5,
 * 2nd largest element is 4, 3rd largest element is 3 and etc.
 *  
 * Note: 
 * You may assume k is always valid, 1 ≤ k ≤ array's length.
 * You can swap elements in the array
 * 
 * Challenge
 * O(n) time, O(1) extra memory.
 *  
 * @author Johnny
 */
public class Solution215 {
    // quick sort partition
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        return helper(nums, 0, nums.length - 1, k);
    }
    
    private int helper(int[] nums, int start, int end, int k) {
        // quick sort partition
        int index = partition(nums, start, end);
        if (end - index + 1 == k) {
            return nums[index];
        } else if (end - index + 1 > k) {
            return helper(nums, index + 1, end, k);
        } else {
            return helper(nums, start, index - 1, k - (end - index + 1));
        }
    }
    
    private int partition(int[] nums, int start, int end) {
        int pivot = start;

        for (int i = start + 1; i <= end; i++) {
            if (nums[i] < nums[start]) {
                pivot++;
                int temp = nums[pivot];
                nums[pivot] = nums[i];
                nums[i] = temp;
            }
        }

        int temp = nums[pivot];
        nums[pivot] = nums[start];
        nums[start] = temp;
        
        return pivot;
    }
    // heap
    public int findKthLargest2(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            if (pq.size() < k) {
                pq.offer(nums[i]);
            } else if (nums[i] >= pq.peek()) {
                pq.offer(nums[i]);
                pq.poll();
            }
        }
        
        return pq.poll();
    }
    
    // sorting
    public int findKthLargest3(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums);
        
        for (int i = nums.length - 1; i >= 0 ; i--) {
            k--;
            if (k == 0) {
                return nums[i];
            }
        }
        
        return 0;
    }
}
