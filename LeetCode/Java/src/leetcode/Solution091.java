/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        if (s == null || s.isEmpty()) {
            return 0;
        }
        
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        
        if (isValid(s.substring(0, 1))) {
            dp[1] = 1;
        } else {
            dp[1] = 0;
        }
        for (int i = 2; i <= s.length(); i++) {
            if (isValid(s.substring(i - 1, i))) {
                dp[i] += dp[i - 1];
            }
            if (isValid(s.substring(i - 2, i))) {
                dp[i] += dp[i - 2];
            }           
        }
        
        return dp[dp.length - 1];
    }
    
    private boolean isValid(String s) {
        if (s.charAt(0) == '0') {
            return false;
        }
        int val = Integer.parseInt(s);
        return val >= 1 && val <= 26;
    }
    
    public int numDecodings2(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }        
        
        Map<String, Character> map = new HashMap<String, Character>();
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        for (int i = 0; i < alphabet.length; i++) {
            map.put(String.valueOf(i + 1), alphabet[i]);
        }
        
        List<Character> list = new ArrayList<Character>();
        List<List<Character>> ret = new ArrayList<List<Character>>();
        helper(s, 0, list, ret, map);
        
        return ret.size();
    }
    
    private void helper(String s, int index, List<Character> list, List<List<Character>> ret, Map<String, Character> map) {
        if (index >= s.length()) {
            ret.add(new ArrayList(list));
            return;
        }
        int len = s.length();
        if (len - index > 1) {
            String str = s.substring(index, index + 2);
            if (map.containsKey(str)) {
                list.add(map.get(str));
                helper(s, index + 2, list, ret, map);
                list.remove(list.size() - 1);
            }
        }
        if (len - index > 0) {
            String str = s.substring(index, index + 1);
            if (map.containsKey(str)) {
                list.add(map.get(str));
                helper(s, index + 1, list, ret, map);
                list.remove(list.size() - 1);
            }
        }
    }
    
    
    public int numDecodings3(String s) {
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
