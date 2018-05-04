package johnny.algorithm.leetcode;

/**
 * Find Peak Element.
 * A peak element is an element that is greater than its neighbors.
 * 
 * Given an input array where num[i] ≠ num[i+1], find a peak element and 
 * return its index.
 * 
 * The array may contain multiple peaks, in that case return the index to any 
 * one of the peaks is fine.
 * 
 * You may imagine that num[-1] = num[n] = -∞.
 * 
 * For example, in array [1, 2, 3, 1], 3 is a peak element and your function 
 * should return the index number 2.
 * 
 * click to show spoilers.
 * 
 * Note:
 * Your solution should be in logarithmic complexity.
 * 
 * @author Johnny
 */
public class Solution162 {
    // Iterative Binary Search: log2(N)
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
    // Iterative Binary Search: log2(N)
    public int findPeakElement3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        int start = 0;
        int end = nums.length - 1;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] < nums[mid - 1]){
                end = mid;
            } else {
                start = mid;
            }
        }
        
        return nums[start] > nums[end] ? start : end;
    }
    
    // Linear Scan O(N) 
    public int findPeakElement2(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return i;
        }
        return nums.length - 1;
    }
}
