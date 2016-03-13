/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Restore IP Addresses.
 * Given a string containing only digits, restore it by returning all possible 
 * valid IP address combinations.
 * 
 * For example:
 * Given "25525511135",
 * 
 * return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 * 
 * @author Johnny
 */
public class Solution093 {
    public List<String> restoreIpAddresses(String s) {  
        List<String> ret = new ArrayList<String>();  
        if (s.length() < 4 || s.length() > 12) {
            return ret;
        }  
        dfs(s, "", ret, 0);  
        return ret;  
    }  
      
    private void dfs(String s, String tmp, List<String> ret, int count){  
        if (count == 3 && isValid(s)) {  
            ret.add(tmp + s);  
            return;  
        }  
        for(int i = 1; i < 4 && i < s.length(); i++){  
            String substr = s.substring(0, i);  
            if (isValid(substr)){  
                dfs(s.substring(i), tmp + substr + '.', ret, count + 1);  
            }  
        }  
    }  
      
    private boolean isValid(String s){  
        if (s.charAt(0) == '0') {
            return s.equals("0");
        }  
        int num = Integer.parseInt(s);  
        return num <= 255 && num > 0;  
    } 
}
