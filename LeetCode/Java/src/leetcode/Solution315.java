/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Count of Smaller Numbers After Self.
 * 
 * You are given an integer array nums and you have to return a new counts array. 
 * The counts array has the property where counts[i] is the number of smaller
 * elements to the right of nums[i].
 * 
 * Example:
 * 
 * Given nums = [5, 2, 6, 1]
 * 
 * To the right of 5 there are 2 smaller elements (2 and 1).
 * To the right of 2 there is only 1 smaller element (1).
 * To the right of 6 there is 1 smaller element (1).
 * To the right of 1 there is 0 smaller element.
 * 
 * Return the array [2, 1, 1, 0].
 * 
 * @author RZHUANG
 */
public class Solution315 {
    //http://www.cnblogs.com/grandyang/p/5078490.html
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        // Binary insert, the position of the new array is the count
        int n = nums.length;
        //int[] sorted = new int[n];
        List<Integer> sorted = new ArrayList<Integer>();
        
        for (int i = n - 1; i >= 0; i--) {
            int start = 0;
            int end = sorted.size();
            while(start < end) {
                int mid = start + (end - start) / 2;
                if (sorted.get(mid) >= nums[i]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }
            res.add(0, end);
            sorted.add(end, nums[i]);            
        }
        
        return res;
    }
    public List<Integer> countSmaller2(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        
        SortedSet<Integer> set = new TreeSet<Integer>();
        int min = Integer.MAX_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < min) {
                res.add(0);                
            } else {
                SortedSet<Integer> subSet = set.subSet(min, nums[i]);
                res.add(subSet.size());
            }
            set.add(nums[i]);
            min = Math.min(min, nums[i]);
        }
        
        Collections.reverse(res);
        
        return res;        
    }
}
