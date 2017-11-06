/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Maximum Gap.
 * Given an unsorted array, find the maximum difference between the successive 
 * elements in its sorted form.
 * 
 * Try to solve it in linear time/space.
 * 
 * Return 0 if the array contains less than 2 elements.
 * 
 * You may assume all elements in the array are non-negative integers and fit 
 * in the 32-bit signed integer range.
 * 
 * @author Johnny
 */
public class Solution164 {
    //http://blog.csdn.net/u012162613/article/details/41936569
    //http://www.programcreek.com/2014/03/leetcode-maximum-gap-java/
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        
        // size of each bucket
        int size = (max - min) / n + 1;
        // length of buckets
        int len = (max - min) / size + 1;
        int[][] bucket = new int[len][2]; //bucket[0] = low; bucket[1] high
        for (int i = 0; i < bucket.length; i++) {
            bucket[i][0] = -1; //low value
            bucket[i][1] = -1; //high value
        }
        for (int i = 0; i < n; i++) {
            int index = (nums[i] - min) / size;
            if (bucket[index][0] == -1) {
                bucket[index][0] = nums[i];
                bucket[index][1] = nums[i];
            } else {
                bucket[index][0] = Math.min(bucket[index][0], nums[i]);
                bucket[index][1] = Math.max(bucket[index][1], nums[i]);
            }
        }
        
        int gap = 0;
        int prev = 0;
        for (int i = 1; i < bucket.length; i++) {
            if (bucket[i][0] != -1) {
                gap = Math.max(gap, bucket[i][0] - bucket[prev][1]);
                prev = i;
            }
        }
        
        return gap;
    }
}
