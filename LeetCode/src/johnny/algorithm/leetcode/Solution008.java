/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

/**
 * Implement atoi to convert a string to an integer.
 * Hint: Carefully consider all possible input cases. If you want a challenge, 
 *   please do not see below and ask yourself what are the possible input cases.
 * Notes: It is intended for this problem to be specified vaguely (ie, 
 *   no given input specs). You are responsible to gather all the input 
 *   requirements up front.
 * 
 * int: [-2147483648, 2147483647]
 * 
 * @author Johnny
 */
public class Solution008 {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
 
        str = str.trim();
        int flag = 1;
        int i = 0;
        if (str.charAt(0) == '-') {
            flag = -1;
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        
        long result = 0;
        char ch;
        while (i < str.length()) {
            ch = str.charAt(i);
            if (ch <= '9' && ch >= '0') {
                result = result * 10 + (ch - '0');
                if (result * flag > Integer.MAX_VALUE) {
                    result = Integer.MAX_VALUE;
                    break;
                } else if (result * flag < Integer.MIN_VALUE) {
                    result = Integer.MIN_VALUE;
                    break;
                }
            } else {
                break;
            }
            i++;
        }
        
        return (int)(result * flag);
    }
    public int myAtoi2(String str) {
        if (str == null || str.length() == 0) return 0;

        // trim left and right spaces
        String strTrim = str.trim();
        int len = strTrim.length();
        // sign symbol for positive and negative
        int sign = 1;
        // index for iteration
        int i = 0;
        if (strTrim.charAt(i) == '+') {
            i++;
        } else if (strTrim.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        // store the result as long to avoid overflow
        long result = 0;
        while (i < len) {
            if (strTrim.charAt(i) < '0' || strTrim.charAt(i) > '9') {
                break;
            }
            result = 10 * result + sign * (strTrim.charAt(i) - '0');
            // overflow
            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int)result;        
    }
}
