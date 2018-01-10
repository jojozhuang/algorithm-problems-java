package johnny.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

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
    public boolean containsNearbyDuplicate(int[] nums, int k) {
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
}
