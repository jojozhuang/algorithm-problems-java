package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Subsets.
 * Given a set of distinct integers, S, return all possible subsets.
 * 
 * Note:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example,
 * If S = [1,2,3], a solution is:
 * 
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 * 
 * @author Johnny
 */
public class Solution078 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ans;
        }

        //Arrays.sort(nums); // not necessary, just for unit test
        dfs(nums, 0, new ArrayList<>(), ans);

        return ans;
    }

    private void dfs(int[] nums, int pos, List<Integer> list, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(list));

        for (int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            dfs(nums, i + 1, list, ans);
            list.remove(list.size() - 1);
        }
    }
}
