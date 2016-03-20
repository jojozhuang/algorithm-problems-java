/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Expression Add Operators.
 * 
 * Given a string that contains only digits 0-9 and a target value, return all 
 * possibilities to add binary operators (not unary) +, -, or * between the 
 * digits so they evaluate to the target value.
 * 
 * Examples: 
 * "123", 6 -> ["1+2+3", "1*2*3"] 
 * "232", 8 -> ["2*3+2", "2+3*2"]
 * "105", 5 -> ["1*0+5","10-5"]
 * "00", 0 -> ["0+0", "0-0", "0*0"]
 * "3456237490", 9191 -> []
 *  
 * @author RZHUANG
 */
public class Solution282 {
    //http://www.cnblogs.com/grandyang/p/4814506.html
    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<String>();
        if (num == null || num.isEmpty()) {
            return res;
        }
        
        List<String> list = new ArrayList<String>();
        helper(num, target, 0, 0, "", list);
        return list;
    }
    
    private void helper(String num, int target, long diff, long curVal, String prefix, List<String> list) {
        if (num.length()== 0 && curVal == target) {
            list.add(prefix);
        }
        for (int i = 1; i <= num.length(); i++) {
            String cur = num.substring(0, i);
            if (cur.length() > 1 && cur.charAt(0) == '0') {
                return;
            }
            String next = num.substring(i);
            if (prefix.length() > 0) {
                helper(next, target, Long.parseLong(cur), curVal + Long.parseLong(cur), prefix + "+" + cur, list);
                helper(next, target, -Long.parseLong(cur), curVal - Long.parseLong(cur), prefix + "-" + cur, list);
                helper(next, target, diff * Long.parseLong(cur), (curVal - diff) + diff * Long.parseLong(cur), prefix + "*" + cur, list);
            } else {
                helper(next, target, Long.parseLong(cur), Long.parseLong(cur), cur, list);
            }
        }
    }
}
