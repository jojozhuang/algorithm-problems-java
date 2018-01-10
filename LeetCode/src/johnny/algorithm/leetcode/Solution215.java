package johnny.algorithm.leetcode;

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
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        return helper(nums, 0, nums.length - 1, k);
    }
    
    private int helper(int[] nums, int start, int end, int k) {
        // quick sort partition
        int index = partition(nums, start, end);
        if (end - k + 1 == index) {
            return nums[index];
        } else if (end - k + 1 > index) {
            return helper(nums, index + 1, end, k);
        } else {
            return helper(nums, start, index - 1, k - (end - index + 1));
        }
    }
    
    private int partition(int[] nums, int start, int end) {
        int index = start;
        int pivot = nums[index];

        for (int i = start; i <= end; i++) {
            if (nums[i] < pivot) {
                index++;
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }

        int temp = nums[index];
        nums[index] = nums[start];
        nums[start] = temp;
        
        return index;
    }
}
