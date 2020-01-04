package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Combination Sum.
 * Given a set of candidate numbers (C) and a target number (T), find all unique
 * combinations in C where the candidate numbers sums to T.
 * <p>
 * The same repeated number may be chosen from C unlimited number of times.
 * <p>
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
            list.add(candidates[i]);
            dfs(candidates, target - candidates[i], i, list, ans);
            list.remove(list.size() - 1);
        }
    }
}
