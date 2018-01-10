package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

/**
 * Generate Parentheses.
 * Given n pairs of parentheses, write a function to generate all combinations 
 * of well-formed parentheses.
 * For example, given n = 3, a solution set is:
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 * 
 * @author Johnny
 */
public class Solution022 {        
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();  
        if (n <= 0) {
            return res;
        }
            
        CombinationPar(res, "", n, n);  
        return res;         
    }   
    
    private void CombinationPar(List<String> res, String item, int left, int right) {  
        if (left > right) {//deal wiith ")("
             return;
        }

        if (left == 0 && right == 0){  
            res.add(item);  
            return;  
        }

        if (left > 0) { 
            CombinationPar(res, item + '(', left - 1, right);  
        }
        if (right > 0) { 
            CombinationPar(res, item + ')', left, right - 1);  
        }
    }
}
