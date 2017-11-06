/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

/**
 * Add Strings
 * 
 * Given two non-negative integers num1 and num2 represented as string, return 
 * the sum of num1 and num2.
 * 
 * Note:
 * 
 * 1. The length of both num1 and num2 is < 5100.
 * 2. Both num1 and num2 contains only digits 0-9.
 * 3. Both num1 and num2 does not contain any leading zero.
 * 4. You must not use any built-in BigInteger library or convert the inputs to integer directly.
 * 
 * @author Johnny
 */
public class Solution415 {
    public String addStrings(String num1, String num2) {
        if (num1 == null || num1.isEmpty()) {
            return num2;
        }
        if (num2 == null || num2.isEmpty()) {
            return num1;
        }
        
        int len1 = num1.length();
        int len2 = num2.length();
        
        if (len2 > len1) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
            len1 = num1.length();
            len2 = num2.length();
        }
        
        int index1 = len1 - 1;
        int index2 = len2 - 1;
        int extra = 0;
        StringBuilder sb = new StringBuilder();
        while(index2 >= 0) {
            int bit1 = Integer.parseInt(String.valueOf(num1.charAt(index1)));
            int bit2 = Integer.parseInt(String.valueOf(num2.charAt(index2)));
            int sum = bit1 + bit2 + extra;
            sb.append(sum%10);
            extra = sum / 10;
            index1--;
            index2--;
        }
        
        while(index1 >= 0) {
            if (extra == 0) {
                break;
            }
            int bit1 = Integer.parseInt(String.valueOf(num1.charAt(index1)));
            int sum = bit1 + extra;
            sb.append(sum%10);
            extra = sum / 10;
            index1--;
        }
        
        String res = sb.reverse().toString();
        if (index1 >= 0) {
            res = num1.substring(0, index1 + 1) + res;
        }
        if (extra > 0) {
            res = String.valueOf(extra) + res;
        }
        
        return res;
    }
}
