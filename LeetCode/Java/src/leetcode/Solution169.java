/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Majority Element.
 * Given an array of size n, find the majority element. The majority element 
 * is the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 * 
 * @author Johnny
 */
public class Solution169 {
    //http://www.programcreek.com/2014/02/leetcode-majority-element-java/
    //hashmap
    public int majorityElement2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }
       
        if (nums.length == 1) {
            return nums[0];
        }
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int element;
        int count;
        
        for(int i = 0; i < nums.length; i++) {
            element = nums[i];
            if(!map.containsKey(element)) {
                map.put(element, 1);
            } else {
                count = map.get(element);
                count++;
                if (count > nums.length / 2)
                    return element;
                else
                    map.replace(element, count);
            }
        }
        
        return Integer.MIN_VALUE;
    }
    
    //sort
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }
        
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
    
    //vote
    public int majorityNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }

        int key = 0, count = 0;
        for (int num : nums) {
            if (count == 0) {
                key = num;
                count = 1;
            } else if (key == num) {
                count++;
                if (count > nums.length / 2) {
                    return key;
                }
            } else {
                count--;
            }
        }

        return key;
    }
}
