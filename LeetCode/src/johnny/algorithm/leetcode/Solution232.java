/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.Stack;

/**
 * Implement Queue using Stacks.
 * Implement the following operations of a queue using stacks.
 * 
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * 
 * Notes:
 * You must use only standard operations of a stack -- which means only push to 
 * top, peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, stack may not be supported natively. You may 
 * simulate a stack by using a list or deque (double-ended queue), as long as 
 * you use only standard operations of a stack.
 * You may assume that all operations are valid (for example, no pop or peek 
 * operations will be called on an empty queue).
* 
 * @author Johnny
 */
public class Solution232 {
    private Stack<Integer> stack1 = new Stack<Integer>(); // s1 stores new elements
    private Stack<Integer> stack2 = new Stack<Integer>(); // s2 stores old elements
    
    public void push(int x) {
        stack1.push(x);
    }

    // Removes the element from in front of queue and returns that element. 
    public int pop() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    // Get the front element.
    public int peek() {
        if (!stack2.isEmpty()) {
            return stack2.peek();
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack1.isEmpty() && stack2.empty();
    }
    
    /*
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int x) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack2.push(x);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (!stack1.isEmpty()) {
            stack1.pop();
        }
    }

    // Get the front element.
    public int peek() {
        if (!stack1.isEmpty()) {
            return stack1.peek();
        }
        return -1;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack1.isEmpty();
    }*/
}
