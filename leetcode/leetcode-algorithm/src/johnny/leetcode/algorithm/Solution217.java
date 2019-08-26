package johnny.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Contains Duplicate.
 * Given an array of integers, find if the array contains any duplicates. Your 
 * function should return true if any value appears at least twice in the array, 
 * and it should return false if every element is distinct.
 * 
 * @author Johnny
 */
public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        
        Set<Integer> keys = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (keys.contains(nums[i])) {
                return true;
            } else {
                keys.add(nums[i]);
            }
        }
        
        return false;
    }
}
