package johnny.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Find the Duplicate Number.
 * 
 * Given an array nums containing n + 1 integers where each integer is between 1
 * and n (inclusive), prove that at least one duplicate number must exist. 
 * Assume that there is only one duplicate number, find the duplicate one.
 * 
 * Note:
 * You must not modify the array (assume the array is read only).
 * You must use only constant, O(1) extra space.
 * Your runtime complexity should be less than O(n2).
 * There is only one duplicate number in the array, but it could be repeated more than once.
 *  
 * @author Johnny
 */
public class Solution287 {
    //Floyd's Tortoise and Hare, O(n), no modification to the original array
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        // Find the intersection point of the two runners.
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Find the "entrance" to the cycle.
        int ptr1 = nums[0];
        int ptr2 = tortoise;
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }

        return ptr1;
    }
    
    // Set to negative value, O(n), original array is modified. This approach won't work if zero is duplicated.
    public int findDuplicate2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i])] >= 0) {
                nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
            } else {
                // if it is negative, it must be set by some previous same element.
                return Math.abs(nums[i]);
            }
        }
        
        return -1;
    }

    // Move element to its proper position, O(n), original array is modified
    public int findDuplicate3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1) {
                if (nums[nums[i] - 1] == nums[i]) {
                    break;
                }
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        
        // scan to see which one is not in its position
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return nums[i];
            }
        }
        
        return -1;
    }
    
    // Hashset, time: O(n), space: O(n), no modification to the original array
    public int findDuplicate4(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            } else {
                set.add(nums[i]);
            }
        }
        
        return -1;
    }
    
    // Sorting, nLog(n), no modification to the original array
    public int findDuplicate5(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }
        
        return -1;
    }
    
    // Naive, Time: O(n^2), no modification to the original array
    public int findDuplicate6(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    return nums[i];
                }
            }
        }
        
        return -1;
    }
}
