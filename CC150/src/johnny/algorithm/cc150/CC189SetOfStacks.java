/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.cc150;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Stack of Plates: 
 * Imagine a (literal) stack of plates. If the stack gets too high, it might topple. 
 * Therefore, in real life, we would likely start a new stack when the previous 
 * stack exceeds some threshold. Implement a data structure SetOfStacks that 
 * mimics this. SetOfStacks should be composed of several stacks and should 
 * create a new stack once the previous one exceeds capacity. SetOfStacks. 
 * push () and SetOfStacks. pop() should behave identically to a single 
 * stack (that is, pop ( ) should return the same values as it would if there 
 * were just a single stack).
 * 
 * FOLLOW UP
 * Implement a function popAt (int index) which performs a pop operation on a specific sub- stack.
 * 
 * @author Johnny
 */
public class CC189SetOfStacks {
    private int threshold;
    private List<Stack<Integer>> stacks;
    
    public CC189SetOfStacks(int threshold) {
        this.threshold = threshold;
        stacks = new ArrayList<Stack<Integer>>();
    }
    
    public void push(int val) {
        Stack<Integer> stack = getStack();
        if (stack.size() == threshold) {
            stack = new Stack<Integer>();
            stacks.add(stack);
        }
        stack.add(val);
    }
    
    public int pop() {
        Stack<Integer> stack = getStack();
        int res = stack.pop();
        if (stack.size() == 0) {
            stacks.remove(stack);
        }
        return res;
    }
    
    public int peek() {
        return getStack().peek();
    }
    
    public boolean isEmpty() {
        return stacks.size() == 0;
    }
    
    private Stack<Integer> getStack() {
        if (stacks.isEmpty()) {
            stacks.add(new Stack<Integer>());
        }
        return stacks.get(stacks.size() - 1);
    }
}
