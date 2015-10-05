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
        if (n<=0)
            return "";
        
        int index = 1;
        String strSay = "1";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int i;
        while(index<n) {       
            for(i=1; i<strSay.length(); i++) {
                if (strSay.charAt(i)==strSay.charAt(i-1)) {
                    count++;
                }
                else {
                    sb.append(count).append(strSay.charAt(i-1));                    
                    count = 1;
                }
            }
            sb.append(count).append(strSay.charAt(i-1));
            strSay = sb.toString();
            sb.setLength(0);
            count = 1;
            index++;
        }
        return strSay;
    }    
}
