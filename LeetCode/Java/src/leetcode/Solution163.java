/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Search for a Range.
 * Given a sorted integer array where the range of elements are [lower, upper] 
 * inclusive, return its missing ranges.
 * 
 * For example, given [0, 1, 3, 50, 75], lower = 0 and upper = 99, 
 * return ["2", "4->49", "51->74", "76->99"].
 * 
 * @author Johnny
 */
public class Solution163 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<String>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == lower) {
                lower++;
                continue;
            } else {
                if (nums[i] - lower == 1) {
                    res.add("" + lower);
                } else {
                    res.add("" + lower + "->" + (nums[i] - 1));
                }
                lower = nums[i] + 1;
            }            
        }
        
        if (nums[n - 1] < upper) {
            if (upper - nums[n - 1] == 1) {
                res.add("" + upper);
            } else {
                res.add("" + (nums[nums.length - 1] + 1) + "->" + upper);
            }
        }
        
        return res;
    }
}
