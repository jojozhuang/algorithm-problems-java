/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

/**
 * Decode Ways.
 * @author Johnny
 */
public class DecodeWays {
    public int numDecodings(String s) {
        // Write your code here
        int res = helper(s);
        return res == -1 ? 0 : res;
    }
    
    private int helper(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        if (s.length() == 1) {
            return isValid(s) ? 1 : -1;
        }

        int res1 = 0;
        if (isValid(s.substring(0,1))) { // one digit
            int right = helper(s.substring(1,  s.length()));
            if (right == -1) {
                res1 = -1;
            } else {
                res1 += right;
            }
        } else {
            res1 = -1;
        }
        int res2 = 0;
        if (isValid(s.substring(0,2))) { // two digits
            int right = helper(s.substring(2,  s.length()));
            if (right == -1) {
                res2 = -1;
            } else if (right == 0) {
                res2 += 1;
            } else {
                res2 += right;
            }
        } else {
            res2 = -1;
        }
        
        if (res1 == -1 && res2 == -1) {
            return -1;
        }
        if (res1 == -1) {
            return res2;
        }
        if (res2 == -1) {
            return res1;
        }
        return res1 + res2;
    }

    private boolean isValid(String str) {
        if (str.startsWith("0")) {
            return false;
        }
        int num = Integer.parseInt(str);
        if (num >= 1 && num <= 26) {
            return true;
        } else {
            return false;
        }
    }
}
