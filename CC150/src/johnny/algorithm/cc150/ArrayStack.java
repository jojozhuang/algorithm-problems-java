/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.cc150;

/**
 *
 * @author i857285
 */
public class ArrayStack {
    private int top;
    private int[] arr;
    
    public ArrayStack(int capacity) {
        arr = new int[capacity];
        top = -1;
    }
    
    // Add value to the array
    public void push(int value) {
        arr[++top] = value;
    }
    
    // Remove value from the array
    public int pop() throws Exception {
        if (top < 0) {
            throw new Exception();
        }
        int value = arr[top];
        top--;
        return value;
    }

    public int peek() throws Exception {
        if (top < 0) {
            throw new Exception();
        }
        return arr[top];
    }
    
    public boolean isEmpty() {
        return top < 0;
    }
}
