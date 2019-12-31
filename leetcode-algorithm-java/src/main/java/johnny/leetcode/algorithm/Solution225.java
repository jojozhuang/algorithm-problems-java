package johnny.leetcode.algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement Stack using Queues.
 * Implement the following operations of a stack using queues.
 * 
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * empty() -- Return whether the stack is empty.
 * Notes:
 * You must use only standard operations of a queue -- which means only push to 
 * back, peek/pop from front, size, and is empty operations are valid.
 * Depending on your language, queue may not be supported natively. You may 
 * simulate a queue by using a list or deque (double-ended queue), as long as 
 * you use only standard operations of a queue.
 * You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 * 
 * @author Johnny
 */
public class Solution225 {
    // One queue: push: O(n), pop: O(1), peek: O(1)
    private LinkedList<Integer> queue;
    
    /** Initialize your data structure here. */
    public Solution225() {
        queue = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        int sz = queue.size();
        while (sz > 1) {
            queue.add(queue.remove());
            sz--;
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.remove();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
    
    // Two queue: push: O(1), pop: O(n), peek: O(1)
    /*
    Queue<Integer> queue1; // Q1 always has all of the elements
    Queue<Integer> queue2; // Q2 always be empty after pop
    int top = 0;
    
    // Initialize your data structure here. 
    public Solution225() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }
    
    // Push element x onto stack. 
    public void push(int x) {
        queue1.offer(x);
        top = x;
    }

    // Removes the element on top of the stack and returns that element. 
    public int pop() {
        while (queue1.size() > 1) {
            top = queue1.poll();
            queue2.offer(top);
        }
        int res = queue1.poll();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return res;
    }

    // Get the top element.
    public int top() {
        return top;
    }

    // Returns whether the stack is empty.
    public boolean empty() {
        return queue1.isEmpty();
    }*/
}
