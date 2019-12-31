package johnny.leetcode.algorithm;

import java.util.Stack;

/**
 * Basic Calculator II.
 * 
 * Implement a basic calculator to evaluate a simple expression string.
 * 
 * The expression string contains only non-negative integers, +, -, *, / operators 
 * and empty spaces . The integer division should truncate toward zero.
 * 
 * You may assume that the given expression is always valid.
 * 
 * Some examples:
 * "3+2*2" = 7
 * " 3/2 " = 1
 * " 3+5 / 2 " = 5
 * 
 * @author Johnny
 */
public class Solution227 {
    public int calculate(String s) {
        int len;
        if(s==null || (len = s.length())==0) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        int num = 0;
        char sign = '+';
        for(int i=0;i<len;i++){
            if(Character.isDigit(s.charAt(i))){
                num = num*10+s.charAt(i)-'0';
            }
            if((!Character.isDigit(s.charAt(i)) &&' '!=s.charAt(i)) || i==len-1){
                if(sign=='-'){
                    stack.push(-num);
                }
                if(sign=='+'){
                    stack.push(num);
                }
                if(sign=='*'){
                    stack.push(stack.pop()*num);
                }
                if(sign=='/'){
                    stack.push(stack.pop()/num);
                }
                sign = s.charAt(i);
                num = 0;
            }
        }

        int re = 0;
        for(int i:stack){
            re += i;
        }
        return re;
    }
    
    public int calculate2(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        s = s.replace(" ", "");
        Stack<Long> stack = new Stack<Long>();
        Long firstNum = getNum(0, s);
        stack.push(firstNum);
        int i = String.valueOf(firstNum).length();
        while(i < s.length()){
            char c = s.charAt(i);
            Long numStr = getNum(i + 1, s);
            if(c == '+'){
                stack.push(numStr);
            }
            if(c == '-'){
                stack.push(-numStr);
            }
            if(c == '*'){
                stack.push(stack.pop() * numStr);
            }
            if(c == '/'){
                stack.push(stack.pop() / numStr);
            }
            i = i + String.valueOf(numStr).length() + 1;
        }
        long res = 0;
        while(!stack.isEmpty()){
            res += stack.pop();
        }
        return (int)res;
    }
    
    private Long getNum(int i, String s){
        StringBuilder num = new StringBuilder();
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            num.append(s.charAt(i));
            i++;
        }
        return Long.parseLong(num.toString());
    }
}
