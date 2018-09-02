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
        int[] res = {-1, -1};
        if (nums == null || nums.length == 0) {
            return res;
        }

        int leftIndex = firstGreaterEqual(nums, target);

        // assert that `leftIdx` is within the array bounds and that `target`
        // is actually in `nums`.
        if (leftIndex == nums.length || nums[leftIndex] != target) {
            return res;
        }
        
        int rightIndex = firstGreaterEqual(nums, target + 1) - 1;

        res[0] = leftIndex;
        res[1] = rightIndex;
        return res;
    }
    
    // find the number from left side, which is equal or larger than the target
    private int firstGreaterEqual(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        
        return start;
    }
    
    public int[] searchRange2(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        if (nums == null || nums.length == 0) {
            return res;
        }
        
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                res[0] = mid;
                res[1] = mid;
                // find the same value on the left side
                while(res[0] > 0) {
                    if (nums[res[0] - 1] != nums[res[0]]) {
                        break;
                    }
                    res[0]--;
                }
                // find the same value on the right side
                while(res[1] < nums.length - 1) {
                    if (nums[res[1]] != nums[res[1] + 1]) {
                        break;
                    }
                    res[1]++;
                }
                return res;
            } else if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        
        if (nums[start] == target) {
            res[0] = start;
            res[1] = start;
        }
        
        if (nums[end] == target) {
            res[1] = end;
            if (res[0] == -1) {
                res[0] = end;
            }
        }
        
        return res;
    }
}
