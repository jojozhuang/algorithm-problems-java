/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Summary Ranges.
 * 
 * Given a sorted integer array without duplicates, return the summary of its ranges.
 * 
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 * 
 * @author Johnny
 */
public class Solution228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> ret = new ArrayList<String>();
        if (nums == null || nums.length == 0) {
            return ret;
        }
        
        if (nums.length == 1) {
            ret.add(String.valueOf(nums[0]));
            return ret;
        }
        
        int head = 1;
        int tail = 0;
        while(head < nums.length) {            
            if (nums[head - 1] + 1 < nums[head]) {
                if (head - 1 - tail == 0) {
                    ret.add(String.valueOf(nums[tail]));
                } else {
                    ret.add(String.valueOf(nums[tail]) + "->" + String.valueOf(nums[head - 1]));
                }
                tail = head;
            }
            head++;
        }
        
        if (nums.length - 1 == tail) {
            ret.add(String.valueOf(nums[tail]));
        } else {
            ret.add(String.valueOf(nums[tail]) + "->" + String.valueOf(nums[nums.length - 1]));
        }
        
        return ret;
    }
}
