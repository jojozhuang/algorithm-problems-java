package johnny.leetcode.algorithm;

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
    // push: O(1), pop: O(1), worst O(n)
    private Stack<Integer> stack1; // s1 stores new elements
    private Stack<Integer> stack2; // s2 stores old elements
    
    /** Initialize your data structure here. */
    public Solution232() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty() && stack2.empty();
    }
}
