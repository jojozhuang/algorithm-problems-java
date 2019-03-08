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
    public int calculate(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int n = s.length();
        int sign = 1; // 1: +, -1: -
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c >= '0' &&  c <= '9') {
                int sum = c - '0';
                while (i + 1 < n && Character.isDigit(s.charAt(i + 1))) {
                    sum = 10 * sum + (s.charAt(i + 1) - '0');
                    i++;
                }
                ans += sum * sign;
            } else if (c == '+') {
                sign = 1;
            } else if (c == '-') {
                sign = -1;
            } else if (c == '(') {
                stack.push(ans);
                stack.push(sign);
                ans = 0;
                sign = 1;
            } else if (c == ')') {
                ans = ans * stack.pop() + stack.pop();
            }
        }
        
        return ans;
    }
    public int calculate3(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int res = 0;
        int number = 0;
        int sign = 1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                number = 10 * number + (c - '0');
            }else if(c == '+'){
                res += sign * number;
                number = 0;
                sign = 1;
            }else if(c == '-'){
                res += sign * number;
                number = 0;
                sign = -1;
            }else if(c == '('){
                //we push the result first, then sign;
                stack.push(res);
                stack.push(sign);
                //reset the sign and result for the value in the parenthesis
                sign = 1;
                res = 0;
            }else if(c == ')'){
                res += sign * number;
                number = 0;
                res *= stack.pop();    //stack.pop() is the sign before the parenthesis
                res += stack.pop();   //stack.pop() now is the result calculated before the parenthesis
            }
        }
        
        if (number != 0) {
            res += sign * number;
        }
        
        return res;
    }
    
    //https://segmentfault.com/a/1190000003796804
    public int calculate2(String s) {
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
