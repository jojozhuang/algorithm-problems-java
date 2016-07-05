/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Largest Divisible Subset.
 * Given a set of distinct positive integers, find the largest subset such that
 * every pair (Si, Sj) of elements in this subset satisfies: Si % Sj = 0 or Sj % Si = 0.
 * 
 * If there are multiple solutions, return any subset is fine.
 * 
 * Example 1:
 * 
 * nums: [1,2,3]
 * 
 * Result: [1,2] (of course, [1,3] will also be ok)
 * Example 2:
 * 
 * nums: [1,2,4,8]
 * 
 * Result: [1,2,4,8]
 *  
 * @author Johnny
 */
public class Solution368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        
        return res;
    }
}
