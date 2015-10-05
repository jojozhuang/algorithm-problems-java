/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
    public int majorityElement(int[] num) {
        if (num==null || num.length==0)
            return Integer.MIN_VALUE;
       
        if (num.length==1)
            return num[0];
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int element;
        int count;
        
        for(int i=0; i<num.length; i++) {
            element = num[i];
            if(!map.containsKey(element)) {
                map.put(element, 1);
            }
            else {
                count = map.get(element);
                count++;
                if (count>num.length/2)
                    return element;
                else
                    map.replace(element, count);
            }
        }
        
        return Integer.MIN_VALUE;
    }
}
