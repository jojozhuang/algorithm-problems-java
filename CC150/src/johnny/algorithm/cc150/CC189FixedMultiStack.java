/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.cc150;

/**
 * Three in One: 
 * Describe how you could use a single array to implement three stacks.
 * 
 * @author i857285
 */
public class CC189FixedMultiStack {
    private int numberOfStacks = 3;
    private int capacity;
    private int[] values;
    private int[] sizes;
    
    public CC189FixedMultiStack(int capacity) {
        this.capacity = capacity;
        this.values = new int[capacity * numberOfStacks];
        this.sizes = new int[numberOfStacks];
    }
    
    public void push(int stackIndex, int val) throws Exception {
        if (isFull(stackIndex)) {
            throw new Exception("Stack is full");
        }
        
        sizes[stackIndex]++;
        values[getTopIndex(stackIndex)] = val;
    }
    
    public int pop(int stackIndex) throws Exception {
        if (isEmpty(stackIndex)) {
            throw new Exception("Stack is empty");
        }
        
        int res = values[getTopIndex(stackIndex)];
        sizes[stackIndex]--;
        return res;
    }
    
    public int peek(int stackIndex) throws Exception {
        if (isEmpty(stackIndex)) {
            throw new Exception("Stack is empty");
        }
        
        return values[getTopIndex(stackIndex)];
    }
    
    public boolean isEmpty(int stackIndex) {
        return sizes[stackIndex] == 0;
    }
    
    public boolean isFull(int stackIndex) {
        return sizes[stackIndex] == capacity;
    }
    
    public int size(int stackIndex) {
        return sizes[stackIndex];
    }
    
    private int getTopIndex(int stackIndex) {
        int offset = stackIndex * capacity;
        int size = sizes[stackIndex];
        return offset + size - 1;
    }
}
