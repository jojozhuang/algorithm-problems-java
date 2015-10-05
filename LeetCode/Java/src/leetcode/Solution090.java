/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
            if (i > 0 && i != pos && nums[i] == nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            subsetHelper(ret, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }   
    
    /*
    public List<List<Integer>> subsetsWithDup(int[] num) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (num==null||num.length==0)
            return ret;
        else if (num.length==1) {
            List<Integer> item = new ArrayList<Integer>();
            ret.add(item);
            item = new ArrayList<Integer>();
            item.add(num[0]);
            ret.add(item);
            return ret;
        }
        else {
            Arrays.sort(num);
            int[] subS = Arrays.copyOf(num, num.length-1);
            List<List<Integer>> list = subsetsWithDup(subS);
            ret.addAll(list);
            HashMap map = new HashMap();
            for (int i=0; i<list.size(); i++) {
                map.put(buildName(list.get(i)), list.get(i));
            }
            for (int i=0; i<list.size(); i++) {
                List<Integer> item = new ArrayList<Integer>();
                item.addAll(list.get(i));
                item.add(num[num.length-1]);
                if (!map.containsKey(buildName(item)))
                    ret.add(item);
            }

            return ret;
        }
    }
    
    private String buildName(List<Integer> nums) {
        if (nums==null||nums.size()==0)
            return "";
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<nums.size(); i++) {
            sb.append(nums.get(i));
            sb.append(",");
        }
        return sb.toString();
    }*/
}
