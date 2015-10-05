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
        if (nums == null) {
            return new ArrayList<List<Integer>>();
        }
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        subsetHelper(ret, list, nums, 0);
        return ret;
    }
    private void subsetHelper(List<List<Integer>> ret, List<Integer> list, int[] nums, int pos) {
        ret.add(new ArrayList<Integer>(list));
        
        for(int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            subsetHelper(ret, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
    
    /*
    public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (S==null||S.length==0)
            return ret;
        else if (S.length==1) {
            List<Integer> item = new ArrayList<Integer>();
            ret.add(item);
            item = new ArrayList<Integer>();
            item.add(S[0]);
            ret.add(item);
            return ret;
        }
        else {
            Arrays.sort(S);
            int[] subS = Arrays.copyOf(S, S.length-1);
            List<List<Integer>> list = subsets(subS);
            ret.addAll(list);
            for (int i=0; i<list.size(); i++) {
                List<Integer> item = new ArrayList<Integer>();
                item.addAll(list.get(i));
                item.add(S[S.length-1]);
                ret.add(item);
            }

            return ret;
        }
    }*/
}
