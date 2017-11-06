/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Encode and Decode Strings.
 * Design an algorithm to encode a list of strings to a string. The encoded 
 * string is then sent over the network and is decoded back to the original list
 * of strings.
 * 
 * Machine 1 (sender) has the function:
 * string encode(vector<string> strs) { // ... your code return encoded_string; } 
 * Machine 2 (receiver) has the function: 
 * vector<string> decode(string s) { //... your code return strs; }
 * 
 * So Machine 1 does:
 * string encoded_string = encode(strs); 
 * and Machine 2 does:
 * vector<string> strs2 = decode(encoded_string); 
 * strs2 in Machine 2 should be the same as strs in Machine 1.
 * 
 * Implement the encode and decode methods.
 * 
 * Note: The string may contain any possible characters out of 256 valid ascii 
 * characters. Your algorithm should be generalized enough to work on any 
 * possible characters. Do not use class member/global/static variables to 
 * store states. Your encode and decode algorithms should be stateless. Do not 
 * rely on any library method such as eval or serialize methods. You should 
 * implement your own encode/decode algorithm.
 * 
 * @author Johnny
 */
public class Solution271 {
    //https://segmentfault.com/a/1190000003791865
    public String encode(List<String> strs) {
        if (strs == null || strs.size() == 0) {
            return "";
        }
        StringBuilder output = new StringBuilder();
        for(String str : strs){
            output.append(String.valueOf(str.length())+"#");
            output.append(str);
        }
        return output.toString();
    }
    
    public List<String> decode(String s) {
        List<String> res = new LinkedList<String>();
        if (s == null || s.length() == 0) {
            return res;
        }
        int start = 0;
        while(start < s.length()){
            int idx = s.indexOf('#', start);
            int size = Integer.parseInt(s.substring(start, idx));
            res.add(s.substring(idx + 1, idx + size + 1));
            start = idx + size + 1;
        }
        return res;
    }
}
