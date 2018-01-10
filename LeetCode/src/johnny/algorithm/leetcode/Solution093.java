package johnny.algorithm.leetcode;

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
        List<String> res = new ArrayList<String>();  
        if (s.length() < 4 || s.length() > 12) {
            return res;
        }  
        dfs(s, "", 0, res);  
        return res;  
    }  
      
    private void dfs(String s, String tmp, int count, List<String> res){  
        if (count == 3 && isValid(s)) {  
            res.add(tmp + s);  
            return;  
        }  
        for(int i = 1; i < 4 && i < s.length(); i++){  
            String substr = s.substring(0, i);  
            if (isValid(substr)){  
                dfs(s.substring(i), tmp + substr + '.', count + 1, res);  
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
