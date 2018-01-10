package johnny.algorithm.leetcode;

import java.util.Stack;

/**
 * Evaluate Reverse Polish Notation.
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * 
 * Valid operators are +, -, *, /. Each operand may be an integer or another
 * expression.
 * 
 * Some examples:
 *   ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 *   ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 * 
 * @author Johnny
 */
public class Solution150 {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            return 0;
        }
        
        Stack<String> stack = new Stack<String>();
        int index = 0;
        while (index < tokens.length) {
            String str = tokens[index];            
            if (isOperator(str)) {
                int val1 = Integer.parseInt(stack.pop());
                int val2 = Integer.parseInt(stack.pop());
                int result = 0;
                switch (str) {
                    case "+":
                        result = val2 + val1;
                        break;
                    case "-":
                        result = val2 - val1;
                        break;
                    case "*":
                        result = val2 * val1;
                        break;
                    case "/":
                        result = val2 / val1;
                        break;
                }
                stack.push(String.valueOf(result));
            } else {
                stack.push(str);
            }
            index++;
        }
        
        String res = stack.pop();
        return Integer.parseInt(res);
    }
    
    private boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }
}
