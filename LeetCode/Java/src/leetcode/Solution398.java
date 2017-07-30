/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Random Pick Index
 * 
 * Given an array of integers with possible duplicates, randomly output the index 
 * of a given target number. You can assume that the given target number must 
 * exist in the array.
 * 
 * Note:
 * The array size can be very large. Solution that uses too much extra space will
 * not pass the judge.
 * 
 * Example:
 * int[] nums = new int[] {1,2,3,3,3};
 * Solution solution = new Solution(nums);
 * // pick(3) should return either index 2, 3, or 4 randomly. Each index should
 * have equal probability of returning.
 * solution.pick(3);
 * // pick(1) should return 0. Since in the array only nums[0] is equal to 1.
 * solution.pick(1);
 * 
 * @author Johnny
 */
public class Solution398 {
    Map<Integer, List<Integer>> map = null;
    public Solution398(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map.put(nums[i], list);
            } else {
                map.get(nums[i]).add(i);
            }
        }
    }
    
    public int pick(int target) {
        if (map != null && map.containsKey(target)) {
            List<Integer> list = map.get(target);
            int index = getRandom(list.size());
            return list.get(index);
        }
        return 0;
    }
    
    private int getRandom(int max) {
        return new Random().nextInt(max);
    }
}
