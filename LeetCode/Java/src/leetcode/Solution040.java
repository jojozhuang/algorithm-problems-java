/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Combination Sum II.
 * Given a collection of candidate numbers (C) and a target number (T), find all
 * unique combinations in C where the candidate numbers sums to T.
 * 
 * Each number in C may only be used once in the combination.
 * 
 * Note:
 * All numbers (including target) will be positive integers.
 * Elements in a combination (a1, a2, … , ak) must be in non-descending order. 
 * (ie, a1 ≤ a2 ≤ … ≤ ak).
 * 
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set 10,1,2,7,6,1,5 and target 8, 
 * A solution set is: 
 * [1, 7] 
 * [1, 2, 5] 
 * [2, 6] 
 * [1, 1, 6] 
 * 
 * @author Johnny
 */
public class Solution040 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (candidates == null || candidates.length == 0) {
            return ret;
        }
        
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<Integer>();
        helper(candidates, target, 0, list, ret);
        
        HashSet<List<Integer>> set = new HashSet<List<Integer>>(ret); 
        //remove duplicate lists
        ret.clear();
        ret.addAll(set);
    
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
                helper(candidates, target - candidates[i], i + 1, list, ret);
                list.remove(list.size() - 1);
            }
        }
    }
}
