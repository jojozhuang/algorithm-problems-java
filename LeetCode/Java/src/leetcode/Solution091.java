/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Decode Ways.
 * A message containing letters from A-Z is being encoded to numbers using the 
 * following mapping:
 * 
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Given an encoded message containing digits, determine the total number of
 * ways to decode it.
 * 
 * For example,
 * Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 * 
 * The number of ways decoding "12" is 2.
 * 
 * @author Johnny
 */
public class Solution091 {
    public int numDecodings(String s) {
        if (s==null||s.length()==0)
            return 0;
        else if (s.length()==1) {
            if (s.equals("0"))
                return Integer.MIN_VALUE; //invalid input
            else
                return 1;
        }
        else {
            String last = s.substring(s.length()-1, s.length());
            String tail;
            if (last.equals("0")) {
                tail = s.substring(s.length()-2, s.length());
                if (Integer.valueOf(tail)==10||Integer.valueOf(tail)==20) {
                    int twobits = numDecodings(s.substring(0, s.length()-2));
                    if (twobits==0)
                        return 1;
                    else
                        return twobits;
                }
                else {
                    return Integer.MIN_VALUE; //invalid input
                }
            }
            else {
                int onebit = numDecodings(s.substring(0, s.length()-1));
                tail = s.substring(s.length()-2, s.length());
                if (Integer.valueOf(tail)>=10&&Integer.valueOf(tail)<=26) {
                    int twobits = numDecodings(s.substring(0, s.length()-2));
                    if (twobits==0)
                        return onebit + 1;
                    else
                        return onebit + twobits;
                }
                else
                    return onebit;
            }
        }
    }
}
