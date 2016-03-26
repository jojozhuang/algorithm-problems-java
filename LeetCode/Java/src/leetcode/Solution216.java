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
 * Combination Sum III.
 * Find all possible combinations of k numbers that add up to a number n, given
 * that only numbers from 1 to 9 can be used and each combination should be a 
 * unique set of numbers.
 * 
 * Ensure that numbers within the set are sorted in ascending order.
 *  
 * Example 1:
 * Input: k = 3, n = 7
 * Output: [[1,2,4]]
 * 
 * Example 2:
 * Input: k = 3, n = 9
 * Output: [[1,2,6], [1,3,5], [2,3,4]]
 * 
 * @author Johnny
 */
public class Solution216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (k <= 0 || n <= 0) {
            return ret;
        }

        List<Integer> list = new ArrayList<Integer>();
        helper(k, n, 1, list, ret);        
        return ret;
    }
    
    private void helper(int k, int n, int pos, List<Integer> list, List<List<Integer>> ret) {
        if (k == list.size() && n == 0) {
            ret.add(new ArrayList(list));
            return;
        }
        
        for (int i = pos; i <= 9; i++) {
            if (i > n) {
                return;
            } else {
                list.add(i);
                helper(k, n - i, i + 1, list, ret);
                list.remove(list.size() - 1);
            }
        }
    }
}
