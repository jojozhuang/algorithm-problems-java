package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 996. Number of Squareful Arrays
 * 
 * Given an array A of non-negative integers, the array is squareful if for every pair of adjacent elements, their sum is a perfect square.

Return the number of permutations of A that are squareful.  Two permutations A1 and A2 differ if and only if there is some index i such that A1[i] != A2[i].

 

Example 1:

Input: [1,17,8]
Output: 2
Explanation: 
[1,8,17] and [17,8,1] are the valid permutations.
Example 2:

Input: [2,2,2]
Output: 1
 

Note:

1 <= A.length <= 12
0 <= A[i] <= 1e9


 * @author Johnny
 */
public class Solution996 {
    public int numSquarefulPerms(int[] A) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        List<Integer> list = new ArrayList<Integer>();
        helper(A, list, res);
        return res.size();
    }
    
    private void helper(int[] A,List<Integer> list, List<List<Integer>> res) {
        if (list.size() == A.length) {
            res.add(new ArrayList<Integer>(list));
        }
        
        for (int i = 0; i < A.length; i++) {
            if (list.contains(A[i])) {
                continue;
            }
            if (list.size() == 0 || squareful(list.get(list.size() - 1) + A[i])) {
                list.add(A[i]);
                helper(A, list, res);
                list.remove(list.size() - 1);
            }
        }
    }
    
    /*
    public int numSquarefulPerms(int[] A) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(A); // must sort

        for (int i = 0; i < A.length; i++) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(A[i]);
            helper(A, i + 1, list, ans);
        }
        return ans.size() * 2;
    }
    
    private void helper(int[] nums, int pos, List<Integer> list, List<List<Integer>> ans) {
        if (pos == nums.length) {
            if (list.size() == nums.length) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        for (int i = pos; i < nums.length; i++) {
            if (squareful(nums[pos - 1] + nums[i])) {
                list.add(nums[i]);
                helper(nums, i + 1, list, ans);
                list.remove(list.size() - 1);
            }
        }
    }
    
    private void dfs(int[] A, int pos, List<Integer> list, List<List<Integer>> ans) {
        if (pos == A.length - 1) {
            if (list.size() == A.length) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = pos + 1; i < A.length; i++) {
            if (squareful(A[pos] + A[i])) {
                list.add(A[pos]); 
                dfs(A, pos + 1, list, ans);
                list.remove(list.size() - 1);
            }
        }
    }*/
    
    private boolean squareful(int num) {
        return Math.sqrt(num) * Math.sqrt(num) == num;
    }
}
