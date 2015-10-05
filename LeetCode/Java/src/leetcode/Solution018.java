/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * 4Sum.
 * Given an array S of n integers, are there elements a, b, c, and d in S such 
 * that a + b + c + d = target? Find all unique quadruplets in the array which 
 * gives the sum of target.
 * 
 * Note:
 * Elements in a quadruplet (a,b,c,d) must be in non-descending order. 
 * (ie, a ≤ b ≤ c ≤ d)
 * The solution set must not contain duplicate quadruplets.
 *     For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
 * 
 *     A solution set is:
 *     (-1,  0, 0, 1)
 *     (-2, -1, 1, 2)
 *     (-2,  0, 0, 2)
 * 
 * @author Johnny
 */
public class Solution018 {
    public List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        
        if (num==null||num.length<3)
            return ret;
        
        Arrays.sort(num);

        HashSet<List<Integer>> hashSet = new HashSet<List<Integer>>();        

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int k = j + 1;
                int l = num.length - 1;

                while (k < l) {
                    int sum = num[i] + num[j] + num[k] + num[l];
                    if (sum == target) {
                        ArrayList<Integer> item = new ArrayList<Integer>();
                        item.add(num[i]);
                        item.add(num[j]);
                        item.add(num[k]);
                        item.add(num[l]);

                        if (!hashSet.contains(item)) {
                            hashSet.add(item);
                            ret.add(item);
                        }

                        k++;
                        l--;
                    }
                    else if (sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } 
                }
            }
        }

        return ret;
    }
}
