package johnny.leetcode.algorithm;

import java.util.Stack;

/**
 * 716. Max Stack
 * Design a max stack that supports push, pop, top, peekMax and popMax.
 * <pre>{@code
 * push(x) -- Push element x onto stack.
 * pop() -- Remove the element on top of the stack and return it.
 * top() -- Get the element on the top.
 * peekMax() -- Retrieve the maximum element in the stack.
 * popMax() -- Retrieve the maximum element in the stack, and remove it. If you find more than one maximum elements, only remove the top-most one.
 * Example 1:
 * MaxStack stack = new MaxStack();
 * stack.push(5);
 * stack.push(1);
 * stack.push(5);
 * stack.top(); -> 5
 * stack.popMax(); -> 5
 * stack.top(); -> 1
 * stack.peekMax(); -> 5
 * stack.pop(); -> 1
 * stack.top(); -> 5
 * Note:
 * -1e7 <= x <= 1e7
 * Number of operations won't exceed 10000.
 * The last four operations won't be called when stack is empty.
 * }</pre>
 * @author Johnny
 */
public class Solution716 {
    // one stack without supporting popMax
    /*
    private int max = Integer.MIN_VALUE;
    private Stack<Integer> stack; 
    
    public Solution716() {
        stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        if (x >= max) {
            stack.push(max);
            max = x;
        }
        stack.push(x);
    }

    public int pop() {
        int top = stack.pop();
        if (top == max) {
            max = stack.pop();
        }
        return top;
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        return max;
    }*/

    // two stacks
    Stack<Integer> stack;
    Stack<Integer> maxStack;
    public Solution716() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    /*
     * @param number: An integer
     * @return: nothing
     */
    public void push(int x) {
        if (maxStack.isEmpty()) {
            stack.push(x);
            maxStack.push(x);
        } else {
            stack.push(x);
            maxStack.push(Math.max(x, maxStack.peek()));
        }
    }

    public int pop() {
        maxStack.pop();
        return stack.pop();
    }

    /*
     * @return: An integer
     */
    public int top() {
        return stack.peek();
    }

    /*
     * @return: An integer
     */
    public int peekMax() {
        return maxStack.peek();
    }

    /*
     * @return: An integer
     */
    public int popMax() {
        Stack<Integer> temp = new Stack<>();
        int max = maxStack.peek();
        while (!stack.isEmpty() && stack.peek() < max) {
            temp.push(stack.pop());
            maxStack.pop();
        }
        stack.pop(); // pop the maximum;
        maxStack.pop();
        while (!temp.isEmpty()) {
            push(temp.pop());
        }
        return max;
    }
}
