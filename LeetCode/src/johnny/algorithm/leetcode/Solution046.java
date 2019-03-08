package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Permutations.
 * Given a collection of numbers, return all possible permutations.
 * 
 * For example,
 * [1,2,3] have the following permutations:
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 * 
 * @author Johnny
 */
public class Solution046 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ans;
        }
        
        boolean[] visited = new boolean[nums.length];
        dfs(nums, visited, new ArrayList<>(), ans);
        return ans;
    }
    
    private void dfs(int[] nums, boolean[] visited, List<Integer> list, List<List<Integer>> ans) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            list.add(nums[i]);
            dfs(nums, visited, list, ans);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }
    /*
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ans;
        }
        
        List<Integer> list = new ArrayList<>();
        dfs(nums, list, ans);
        return ans;
    }
    
    private void dfs(int[] nums, List<Integer> list, List<List<Integer>> ans) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            dfs(nums, list, ans);
            list.remove(list.size() - 1);
        }
    }*/
}
