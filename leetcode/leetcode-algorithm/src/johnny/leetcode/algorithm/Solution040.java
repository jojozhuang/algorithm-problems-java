package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

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
        List<List<Integer>> ans = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return ans;
        }
        
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        dfs(candidates, target, 0, list, ans);
        return ans;
    }
    
    private void dfs(int[] candidates, int target, int pos, List<Integer> list, List<List<Integer>> ans) {
        if (target <= 0) {
            if (target == 0) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        
        for (int i = pos; i < candidates.length; i++) {
            if (i > pos && candidates[i] == candidates[i-1]) {
                continue;
            }
            if (candidates[i] > target) { 
                break;
            }
            list.add(candidates[i]);
            dfs(candidates, target - candidates[i], i + 1, list, ans);
            list.remove(list.size() - 1);
        }
    }
}
