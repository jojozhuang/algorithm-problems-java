package johnny.algorithm.leetcode;

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
            if (map.get(num.charAt(left)) != num.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        if (num.length() % 2 == 0) {
            return true;
        } else {
            char c = num.charAt(num.length() / 2);
            if (c == '0' || c == '1' || c == '8') {
                return true;
            } else {
                return false;
            }
        }
    }
}
