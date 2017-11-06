/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Different Ways to Add Parentheses.
 * 
 * Given a string of numbers and operators, return all possible results from 
 * computing all the different possible ways to group numbers and operators. 
 * The valid operators are +, - and *.
 *  
 * Example 1
 * Input: "2-1-1".
 * 
 * ((2-1)-1) = 0
 * (2-(1-1)) = 2
 * Output: [0, 2]
 *  
 * Example 2
 * Input: "2*3-4*5"
 * 
 * (2*(3-(4*5))) = -34
 * ((2*3)-(4*5)) = -14
 * ((2*(3-4))*5) = -10
 * (2*((3-4)*5)) = -10
 * (((2*3)-4)*5) = 10
 * Output: [-34, -14, -10, -10, 10]
 * 
 * @author Johnny
 */
public class Solution241 {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> ret = new ArrayList<Integer>();
        if (input == null || input.isEmpty()) {
            return ret;
        }
                
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!operator(c)) {
                continue;
            }
            
            List<Integer> left = diffWaysToCompute(input.substring(0, i));
            List<Integer> right = diffWaysToCompute(input.substring(i + 1));
            
            for (int j = 0; j < left.size(); j++) {
                for (int k = 0; k < right.size(); k++) {
                    int result = calculate(left.get(j), right.get(k), c);
                    ret.add(result);
                }
            }            
        }
        
        if (ret.isEmpty()) {
            ret.add(Integer.parseInt(input));
        }
        
        return ret;
    }
    
    private int calculate(int val1, int val2, char op) {
        int ret = 0;
        if (op == '+') {
            ret = val1 + val2;
        } else if (op == '-') {
            ret = val1 - val2;
        } else if (op == '*') {
            ret = val1 * val2;
        }
        return ret;
    }
    
    private boolean operator(char op) {
        return (op == '+' || op == '-' || op == '*');
    }
}
