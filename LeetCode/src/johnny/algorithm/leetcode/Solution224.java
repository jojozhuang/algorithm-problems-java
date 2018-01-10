package johnny.algorithm.leetcode;

import java.util.Stack;

/**
 * Basic Calculator.
 * 
 * Implement a basic calculator to evaluate a simple expression string.
 * 
 * The expression string may contain open ( and closing parentheses ), the 
 * plus + or minus sign -, non-negative integers and empty spaces .
 *
 * You may assume that the given expression is always valid.
 * 
 * Some examples:
 * "1 + 1" = 2
 * " 2-1 + 2 " = 3
 * "(1+(4+5+2)-3)+(6+8)" = 23
 * 
 * @author Johnny
 */
public class Solution224 {
    //https://segmentfault.com/a/1190000003796804
    public int calculate(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        s = s.replace(" ", "");
        // use stack to record the sign for ();
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(1); // the first sign is positive, like the whole expression surrounded by +();
        int i = 0, res = 0;
        int sign = 1; // use it to record sign change
        while(i < s.length()){
            char c = s.charAt(i);
            if(c == '+'){
                sign = 1;
                i++;
            } else if(c == '-'){
                sign = -1;
                i++;
            } else if(c == '('){
                stk.push(sign * stk.peek());
                sign = 1;
                i++;
            } else if(c == ')'){
                stk.pop();
                i++;
            } else {
                int num = 0;
                // get the whole number
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    num = num * 10 + s.charAt(i) - '0';
                    i++;
                }
                res += num * sign * stk.peek(); // current sign and sign before '('
            }
        }
        return res;
    }
}
