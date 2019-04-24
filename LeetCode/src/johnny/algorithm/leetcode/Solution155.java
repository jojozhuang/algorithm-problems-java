package johnny.algorithm.leetcode;

import java.util.Stack;

/**
 * Min Stack.
 * Design a stack that supports push, pop, top, and retrieving the minimum 
 * element in constant time.
 * 
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * 
 * @author Johnny
 */
public class Solution155 {
    // one stack
    private int min = Integer.MAX_VALUE;
    private Stack<Integer> stack; 
    
    public Solution155() {
        stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        if (x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        int top = stack.pop();
        if (top == min) {
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }

    /* two stacks
    private Stack<Integer> stack1; // normal item
    private Stack<Integer> stack2; // minimum item only
    
    public Solution155() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        stack1.push(x);
        if (x <= min()) {
            stack2.push(x);
        }
    }

    public void pop() {
        int top = stack1.pop();
        if (top == min()) {
            stack2.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return stack2.peek();
    }
    
    private int min() {
        if (stack2.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return stack2.peek();
        }
    }
    */
}

