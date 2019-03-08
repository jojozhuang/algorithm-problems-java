package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ans;
        }

        Arrays.sort(nums);
        dfs(nums, 0, new ArrayList<>(), ans);

        return ans;
    }

    private void dfs(int[] nums, int pos, List<Integer> list, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(list));

        for (int i = pos; i < nums.length; i++) {
            if (i > pos && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
            dfs(nums, i + 1, list, ans);
            list.remove(list.size() - 1);
        }
    }
}
