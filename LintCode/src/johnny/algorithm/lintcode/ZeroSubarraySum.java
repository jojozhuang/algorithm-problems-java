/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Subarray Sum.
 * Given an integer array, find a subarray where the sum of numbers is zero. Your code should return the index of the first number and the index of the last number.
 * 
 * Example
 * Given [-3, 1, 2, -3, 4], return [0, 2] or [1, 3].
 * 
 * Note
 * There is at least one subarray that it's sum equals to zero.
 * 
 * @author Johnny
 */
public class ZeroSubarraySum {
    public ArrayList<Integer> subarraySum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        
        ArrayList<Integer> ret = new ArrayList<Integer>();
        
        //key is the sum until current index, value is the index of numbers
        /*
        key contains the sum for each step, it same key appears, that means there must a subarray between them, which is zero. eg.
        nums = [5, -1, 2, -1, 2]
        [0] = 0
        [5] = 1
        [4] = 2
        [6] = 3
        [5] = 4 -> back to 5        
        */
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        // initial, in case the sub array starts from index = 0;
        map.put(0, 0); 
        
        // sum for the all of the previous numbers
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (map.containsKey(sum)) {
                ret.add(map.get(sum));
                ret.add(i);
                break;
            } else {
                map.put(sum, i + 1);
            }
        }
        
        return ret;
        
    }
}
