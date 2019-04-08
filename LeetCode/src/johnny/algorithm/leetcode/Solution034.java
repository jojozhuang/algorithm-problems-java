package johnny.algorithm.leetcode;

/**
 * Search for a Range.
 * Given a sorted array of integers, find the starting and ending position of 
 * a given target value.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * If the target is not found in the array, return [-1, -1].
 * 
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 * 
 * @author Johnny
 */
public class Solution034 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1,-1};
        if (nums == null || nums.length == 0) {
            return ans;
        }
        
        int lower = binarySearch(nums, target, true);
        if (lower == -1) {
            return ans;
        }
        int upper = binarySearch(nums, target, false);
        ans[0] = lower;
        ans[1] = upper;
        return ans;
    }
    
    public int binarySearch(int[] nums, int target, boolean lower) {
        int start = 0;
        int end = nums.length - 1;
        if (lower) {
            // search for lower bound
            while (start + 1 < end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
            // check start first
            if (nums[start] == target) {
                return start;
            }
            if (nums[end] == target) {
                return end;
            }
        } else {
            // search for upper bound
            while (start + 1 < end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid;
                }
            }
            // check end first
            if (nums[end] == target) {
                return end;
            }
            if (nums[start] == target) {
                return start;
            }
        }
        
        return -1;
    }
}
