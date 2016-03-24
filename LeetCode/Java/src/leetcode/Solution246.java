/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;

/**
 * Strobogrammatic Number.
 * 
 * A strobogrammatic number is a number that looks the same when rotated 180 
 * degrees (looked at upside down).
 * 
 * Write a function to determine if a number is strobogrammatic. The number is 
 * represented as a string.
 * 
 * For example, the numbers "69", "88", and "818" are all strobogrammatic.
 * 
 * @author Johnny
 */
public class Solution246 {
    public boolean isStrobogrammatic(String num) {
        if (num == null || num.isEmpty()) {
            return false;
        }
        
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');
        
        int left = 0;
        int right = num.length() - 1;
        while(left < right) {
            if (!map.containsKey(num.charAt(left))) {
                return false;
            }
            char c = map.get(num.charAt(left));
            if (c != num.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        if (num.length() % 2 == 0) {
            return true;
        } else {
            if (num.charAt(left) == '0' || num.charAt(left) == '1' || num.charAt(left) == '8') {
                return true;
            } else {
                return false;
            }
        }
    }
}
