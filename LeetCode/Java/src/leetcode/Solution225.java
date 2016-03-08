/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
    Queue<Integer> queue1 = new LinkedList<Integer>();
    Queue<Integer> queue2 = new LinkedList<Integer>();
    int lastnum = 0;
    // Push element x onto stack.
    public void push(int x) {
        queue1.offer(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        while(!queue1.isEmpty()) {
            lastnum = queue1.poll();
            if (!queue1.isEmpty()) {
                queue2.offer(lastnum);
            }
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;        
    }

    // Get the top element.
    public int top() {
        while(!queue1.isEmpty()) {
            lastnum = queue1.poll();
            queue2.offer(lastnum);
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;      
        return lastnum;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue1.isEmpty();
    }
}
