package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Contains Duplicate II.
 * 
 * Given an array of integers and an integer k, find out whether there are two 
 * distinct indices i and j in the array such that nums[i] = nums[j] and the 
 * difference between i and j is at most k.
 * 
 * @author Johnny
 */
public class Solution219 {
    // sliding window with length k
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }
        
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            if(i > k) {
                set.remove(nums[i-k-1]);  // keep sliding window with size k
            }
            if(set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int index = map.get(nums[i]);
                if (Math.abs(i - index) <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            } else {
                map.put(nums[i], i);
            }
        }
        
        return false;
    }
    
    // naive, O(n^2)
    public boolean containsNearbyDuplicate3(int[] nums, int k) {
        if (nums == null || nums.length < 2 || k < 0) {
            return false;
        }
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && j <= i + k; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
