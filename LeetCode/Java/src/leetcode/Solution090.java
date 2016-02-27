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

/**
 * Subsets II.
 * Given a collection of integers that might contain duplicates, S, return all
 * possible subsets.
 * 
 * Note:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example,
 * If S = [1,2,2], a solution is:
 * 
 * [
 *   [2],
 *   [1],
 *   [1,2,2],
 *   [2,2],
 *   [1,2],
 *   []
 * ]
 * 
 * @author Johnny
 */
public class Solution090 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (nums == null) {
            return ret;
        }
        
        Arrays.sort(nums);
        
        List<Integer> list = new ArrayList<Integer>();
        subsetHelper(ret, list, nums, 0);
        return ret;
    }
    private void subsetHelper(List<List<Integer>> ret, List<Integer> list, int[] nums, int pos) {
        ret.add(new ArrayList<Integer>(list));
        
        for(int i = pos; i < nums.length; i++) {
            if (i > 0 && i != pos && nums[i] == nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            subsetHelper(ret, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }    
}
