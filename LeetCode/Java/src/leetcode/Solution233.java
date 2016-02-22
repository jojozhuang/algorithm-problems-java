/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;

/**
 * Number of Digit One.
 * 
 * Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
 * 
 * For example:
 * Given n = 13,
 * Return 6, because digit 1 occurred in the following numbers: 1, 10, 11, 12, 13.
 * 
 * @author Johnny
 */
public class Solution233 {
    public int countDigitOne(int n) {
        if (n <= 0) {
            return 0;
        }
        
        int count = 0;
        for (int i = 1; i <= n; i++) {
            char[] arr = String.valueOf(i).toCharArray();
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == '1') {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public int countDigitOne2(int n) {
        if (n <= 0) {
            return 0;
        }
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int count = 0;
        for (int i = 1; i <= n; i++) {            
            String str = String.valueOf(i);
            if (!str.contains("1")) {
                continue;
            }
            if (str.substring(0, 1).equals("1")) {
                count++;
            }            
            if (str.length() > 1) {
                String prev = str.substring(1);
                if (prev.isEmpty() || !prev.contains("1")) {
                    continue;
                }
                if (map.containsKey(prev)) {
                    count += map.get(prev);
                }
            }
            map.put(str, count);
        }
        
        return count;
    }
}
