/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Factor Combinations.
 * 
 * Numbers can be regarded as product of its factors. For example, 
 * 8 = 2 x 2 x 2;
 *   = 2 x 4.
 * Write a function that takes an integer n and return all possible combinations
 * of its factors. 
 * 
 * Note: 
 * 
 * Each combination's factors must be sorted ascending, for example: 
 * The factors of 2 and 6 is [2, 6], not [6, 2]. 
 * You may assume that n is always positive. 
 * Factors should be greater than 1 and less than n.
 *  
 * Examples: 
 * input: 1, output: []
 * input: 37, output: []
 * input: 12, output: [[2, 6],[2, 2, 3],[3, 4]]
 * input: 32
 * output:
 * 
 * [
 *   [2, 16],
 *   [2, 2, 8],
 *   [2, 2, 2, 4],
 *   [2, 2, 2, 2, 2],
 *   [2, 4, 4],
 *   [4, 8]
 * ]
 * 
 * @author Johnny
 */
public class Solution254 {
    //http://www.cnblogs.com/airwindow/p/4822572.html
    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(n, 2, new ArrayList<Integer>(), res);
        return res;
    }
    
    private void helper(int n, int factor, List<Integer> list, List<List<Integer>> res) {
        if (n == 1) {
            if (list.size() > 1) {
                res.add(new ArrayList<Integer>(list));
            }
            return;
        }
        
        for (int i = factor; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                helper(n / i, i, list, res);
                list.remove(list.size() - 1);
            }
        }
    }
}
