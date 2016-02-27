/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Permutations II.
 * Given a collection of numbers that might contain duplicates, return all 
 * possible unique permutations.
 * 
 * For example,
 * [1,1,2] have the following unique permutations:
 * [1,1,2], [1,2,1], and [2,1,1].
 * 
 * @author Johnny
 */
public class Solution047 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0) {
            return ret;
        }
        
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
        boolean[] visited = new boolean[nums.length];
        helper(ret, list, nums, visited);
        return ret;
    }
    
    private void helper(List<List<Integer>> ret, List<Integer> list, int[] nums, boolean[] visited) {
        if (list.size() == nums.length) {
            ret.add(new ArrayList<Integer>(list));
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || i != 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                continue;
            }
            visited[i] = true;
            list.add(nums[i]);
            helper(ret, list, nums, visited);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }
}
