/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc150;

import java.util.Stack;

/**
 *
 * @author i857285
 */
public class SortStack {
    public static Stack<Integer> sort(Stack<Integer> stack) {
        if (stack == null || stack.isEmpty() || stack.size() == 1) {
            return stack;
        }
        
        Stack<Integer> res = new Stack<Integer>();
        
        while(!stack.isEmpty()) {
            int top = stack.pop();
            if (res.isEmpty()) {
                res.push(top);
                continue;
            }
            while (!res.isEmpty() && res.peek() > top) {
                stack.push(res.pop());
            }
            res.push(top);
        }
        
        return res;
    }
}
