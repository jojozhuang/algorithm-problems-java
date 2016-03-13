/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Additive Number.
 * 
 * Additive number is a string whose digits can form additive sequence.
 * 
 * A valid additive sequence should contain at least three numbers. Except for 
 * the first two numbers, each subsequent number in the sequence must be the sum
 * of the preceding two.
 * 
 * For example:
 * "112358" is an additive number because the digits can form an additive 
 * sequence: 1, 1, 2, 3, 5, 8.
 * 
 * 1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
 * "199100199" is also an additive number, the additive sequence is: 1, 99, 100, 199.
 * 1 + 99 = 100, 99 + 100 = 199
 * Note: Numbers in the additive sequence cannot have leading zeros, so sequence 1, 2, 03 or 1, 02, 3 is invalid.
 * 
 * Given a string containing only digits '0'-'9', write a function to determine if it's an additive number.
 *   
 * @author Johnny
 */
public class Solution306 {
    public boolean isAdditiveNumber(String num) {
        if (num == null || num.isEmpty()) {
            return false;
        }
        
        //compare length of the generated string with the original string
        int len = num.length();
        for (int i = 1; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                String s1 = num.substring(0, i);
                String s2 = num.substring(i, j);
                long d1 = Long.parseLong(s1), d2 = Long.parseLong(s2);
                if ((s1.length() > 1 && s1.charAt(0) == '0') || (s2.length() > 1 && s2.charAt(0) == '0')) {
                    continue;
                }
                long next = d1 + d2;
                String nexts = String.valueOf(next);
                String now = s1 + s2 + nexts;
                while (now.length() < len) {
                    d1 = d2;
                    d2 = next;
                    next = d1 + d2;
                    nexts = String.valueOf(next);
                    now += nexts;
                }
                if (now.equals(num)) {
                    return true;
                }
            }
        }        
        return false;
    }   
}
