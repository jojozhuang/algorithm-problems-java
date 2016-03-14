/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Combination Sum.
 * Given a set of candidate numbers (C) and a target number (T), find all unique
 * combinations in C where the candidate numbers sums to T.
 * 
 * The same repeated number may be chosen from C unlimited number of times.
 * 
 * Note:
 * All numbers (including target) will be positive integers.
 * Elements in a combination (a1, a2, … , ak) must be in non-descending order.
 * (ie, a1 ≤ a2 ≤ … ≤ ak).
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set 2,3,6,7 and target 7, 
 * A solution set is: 
 * [7] 
 * [2, 2, 3] 
 * 
 * @author Johnny
 */
public class Solution039 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (candidates == null || candidates.length == 0) {
            return ret;
        }
        
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<Integer>();
        helper(candidates, target, 0, list, ret);        
        return ret;
    }
    
    private void helper(int[] candidates, int target, int pos, List<Integer> list, List<List<Integer>> ret) {
        if (target == 0) {
            ret.add(new ArrayList(list));
            return;
        }
        
        for (int i = pos; i < candidates.length; i++) {
            if (candidates[i] > target) {
                return;
            }
            else {
                list.add(candidates[i]);
                helper(candidates, target - candidates[i], i, list, ret);
                list.remove(list.size() - 1);
            }
        }
    }
}
