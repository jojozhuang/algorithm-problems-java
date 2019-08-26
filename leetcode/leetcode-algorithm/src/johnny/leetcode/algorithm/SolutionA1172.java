package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * You have an infinite number of stacks arranged in a row and numbered (left to right) from 0, each of the stacks has the same maximum capacity.

Implement the DinnerPlates class:

DinnerPlates(int capacity) Initializes the object with the maximum capacity of the stacks.
void push(int val) pushes the given positive integer val into the leftmost stack with size less than capacity.
int pop() returns the value at the top of the rightmost non-empty stack and removes it from that stack, and returns -1 if all stacks are empty.
int popAtStack(int index) returns the value at the top of the stack with the given index and removes it from that stack, and returns -1 if the stack with that given index is empty.
Example:

Input: 
["DinnerPlates","push","push","push","push","push","popAtStack","push","push","popAtStack","popAtStack","pop","pop","pop","pop","pop"]
[[2],[1],[2],[3],[4],[5],[0],[20],[21],[0],[2],[],[],[],[],[]]
Output: 
[null,null,null,null,null,null,2,null,null,20,21,5,4,3,1,-1]

Explanation: 
DinnerPlates D = DinnerPlates(2);  // Initialize with capacity = 2
D.push(1);
D.push(2);
D.push(3);
D.push(4);
D.push(5);         // The stacks are now:  2  4
                                           1  3  5
                                           ﹈ ﹈ ﹈
D.popAtStack(0);   // Returns 2.  The stacks are now:     4
                                                       1  3  5
                                                       ﹈ ﹈ ﹈
D.push(20);        // The stacks are now: 20  4
                                           1  3  5
                                           ﹈ ﹈ ﹈
D.push(21);        // The stacks are now: 20  4 21
                                           1  3  5
                                           ﹈ ﹈ ﹈
D.popAtStack(0);   // Returns 20.  The stacks are now:     4 21
                                                        1  3  5
                                                        ﹈ ﹈ ﹈
D.popAtStack(2);   // Returns 21.  The stacks are now:     4
                                                        1  3  5
                                                        ﹈ ﹈ ﹈ 
D.pop()            // Returns 5.  The stacks are now:      4
                                                        1  3 
                                                        ﹈ ﹈  
D.pop()            // Returns 4.  The stacks are now:   1  3 
                                                        ﹈ ﹈   
D.pop()            // Returns 3.  The stacks are now:   1 
                                                        ﹈   
D.pop()            // Returns 1.  There are no stacks.
D.pop()            // Returns -1.  There are still no stacks.
 

Constraints:

1 <= capacity <= 20000
1 <= val <= 20000
0 <= index <= 100000
At most 200000 calls will be made to push, pop, and popAtStack.

 * @author Johnny
 */
public class SolutionA1172 {
    private int capacity;
    List<Stack<Integer>> list;
    boolean isEmpty = true;
    int leftmost = 0;
    int rightmost = 0;
    public SolutionA1172(int capacity) {
        this.capacity = capacity;
        this.list = new ArrayList<>();
    }
    
    public void push(int val) {
        Stack<Integer> stack = getStack();
        stack.push(val);
        isEmpty = false;
    }
    
    public int pop() {
        if (isEmpty) {
            return -1;
        }
        Stack<Integer> stack = getRightMost();
        if (stack == null) {
            isEmpty = true;
            return -1;
        }
        return stack.pop();
    }
    
    public int popAtStack(int index) {
        if (index >= list.size()) {
            return -1;
        }
        Stack<Integer> stack = list.get(index);
        if (stack.size() == 0) {
            return -1;
        }
        if (index < leftmost ) {
            leftmost = index;
        }
        return stack.pop();
    }
    
    private Stack<Integer> getStack() {
        for (int i = leftmost; i < list.size(); i++) {
            if (list.get(i).size() < capacity) {
                leftmost = i;
                return list.get(i);
            }
        }
        
        Stack<Integer> stack = new Stack<>();
        list.add(stack);
        leftmost = list.size() - 1;
        rightmost = list.size() - 1;
        return stack;
    }
    
    private Stack<Integer> getRightMost() {
        if (list.size() == 0) {
            return null;
        }
        for (int i = rightmost; i >=0; i--) {
            if (list.get(i).size() > 0) {
                rightmost = i;
                return list.get(i);
            }
        }
        return null;
    }
}
