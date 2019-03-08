package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ans;
        }
        
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(nums, visited, list, ans);
        return ans;
    }
    
    private void dfs(int[] nums, boolean[] visited, List<Integer> list, List<List<Integer>> ans) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                continue;
            }
            visited[i] = true;
            list.add(nums[i]);
            dfs(nums, visited, list, ans);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }
}
