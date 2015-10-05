/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Combinations.
 * Given two integers n and k, return all possible combinations of k numbers 
 * out of 1 ... n.
 * 
 * For example,
 * If n = 4 and k = 2, a solution is:
 * 
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 * 
 * @author Johnny
 */
public class Solution077 {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<Integer>();
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        
        if (n<1||k<1||k>n)
            return ret;
               
        int count;
        for (int i=1; i<=n; i++) {
            if (n-i+1>=k) {
                list = new ArrayList<Integer>();
                list.add(i);
                count = 1;
                for (int j=i+1; j<=n; j++) {
                    if (count<k) {
                        list.add(j+1);                
                        count++;
                    }
                    else {
                        break;
                    }
                }
                ret.add(list);
            }
        }
        
        return ret;
    }
}
