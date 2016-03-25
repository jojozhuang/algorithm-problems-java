/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Count and Say.
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 * Note: The sequence of integers will be represented as a string.
 * 
 * @author Johnny
 */
public class Solution038 {
    public String countAndSay(int n) {
        if (n <= 0) {
            return "";
        }
        
        String str = "1";  
        for (int i = 1; i < n; i++) {
            int count = 1;
            StringBuilder sb = new StringBuilder();       
            char c = str.charAt(0);
            for(int j = 1; j < str.length(); j++) {
                if (c != str.charAt(j)){
                    sb.append(count);
                    sb.append(c);
                    c = str.charAt(j);
                    count = 1;
                } else {
                    count++;
                }
            }
            sb.append(count);
            sb.append(c);
            str = sb.toString();
        }
        
        return str;
    }
}
