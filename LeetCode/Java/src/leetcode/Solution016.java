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
 * 3Sum Closest.
 * Given an array S of n integers, find three integers in S such that the sum 
 * is closest to a given number, target. Return the sum of the three integers. 
 * You may assume that each input would have exactly one solution.
 * 
 *     For example, given array S = {-1 2 1 -4}, and target = 1.
 * 
 *     The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * 
 * @author Johnny
 */
public class Solution016 {
    public int threeSumClosest(int[] num, int target) {

        if (num==null||num.length<3)
            return 0;
        
        int min = Integer.MAX_VALUE;
        int ret = 0;
 
        Arrays.sort(num);

        for (int i = 0; i < num.length; i++) {
            int j = i + 1;
            int k = num.length - 1;
            while (j < k) {
                int sum = num[i] + num[j] + num[k];
                int diff = Math.abs(sum - target);

                if(diff == 0) return sum;

                if (diff < min) {
                    min = diff;
                    ret = sum;
                }
                if (sum <= target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        
        return ret;
    }
}
