/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Range Sum Query - Mutable.
 * 
 * Given an integer array nums, find the sum of the elements between indices
 * i and j (i ≤ j), inclusive.
 * 
 * The update(i, val) function modifies nums by updating the element at 
 * index i to val.
 * 
 * Example:
 * Given nums = [1, 3, 5]
 * 
 * sumRange(0, 2) -> 9
 * update(1, 2)
 * sumRange(0, 2) -> 8
 * 
 * Note:
 * The array is only modifiable by the update function.
 * You may assume the number of calls to update and sumRange function is distributed evenly.
 *  
 * @author Johnny
 */
public class Solution307 {
    private int[] nums;
    private int[] sum;
    private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    private TreeSet<Integer> set = new TreeSet<Integer>();
    
    public Solution307(int[] nums) {
        this.nums = nums;
        if (nums == null || nums.length == 0) {
            sum = new int[] {0, 0};            
        } else {
            sum = new int[nums.length + 1];
            sum[0] = 0;
            for (int i = 0; i < nums.length; i++) {
                sum[i + 1] = sum[i] + nums[i];
            }
        }
    }

    void update(int i, int val) {
        if (i >=0 && i < nums.length) {
            set.add(i);        
            map.put(i, val - nums[i]);
        }
    }

    public int sumRange(int i, int j) {
        if (i < 0 || j > sum.length - 2 || i > j) {
            return 0;
        }
        
        int total = sum[j + 1] - sum[i];
        SortedSet<Integer> subSet = set.subSet(i, j + 1);
        for (Integer index : subSet) {
            total = total + map.get(index);
        }
        return total;
    }
}
