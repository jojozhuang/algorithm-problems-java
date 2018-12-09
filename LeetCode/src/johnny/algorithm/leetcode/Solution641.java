package johnny.algorithm.leetcode;

/**
 * 641. Design Circular Deque
Design your implementation of the circular double-ended queue (deque).

Your implementation should support following operations:

MyCircularDeque(k): Constructor, set the size of the deque to be k.
insertFront(): Adds an item at the front of Deque. Return true if the operation is successful.
insertLast(): Adds an item at the rear of Deque. Return true if the operation is successful.
deleteFront(): Deletes an item from the front of Deque. Return true if the operation is successful.
deleteLast(): Deletes an item from the rear of Deque. Return true if the operation is successful.
getFront(): Gets the front item from the Deque. If the deque is empty, return -1.
getRear(): Gets the last item from Deque. If the deque is empty, return -1.
isEmpty(): Checks whether Deque is empty or not. 
isFull(): Checks whether Deque is full or not.
 

Example:

MyCircularDeque circularDeque = new MycircularDeque(3); // set the size to be 3
circularDeque.insertLast(1);            // return true
circularDeque.insertLast(2);            // return true
circularDeque.insertFront(3);           // return true
circularDeque.insertFront(4);           // return false, the queue is full
circularDeque.getRear();            // return 2
circularDeque.isFull();             // return true
circularDeque.deleteLast();         // return true
circularDeque.insertFront(4);           // return true
circularDeque.getFront();           // return 4
 

Note:

All values will be in the range of [0, 1000].
The number of operations will be in the range of [1, 1000].
Please do not use the built-in Deque library.

 * @author Johnny
 */
public class Solution641 {
    private int head; // the first node in deque, not the first item in array
    private int tail; // the last node in deque, not the first item in array
    private int[] arr;
    
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public Solution641(int k) {
        arr = new int[k];
        head = -1;
        tail = -1;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        // check if deque is full
        if (isFull()) {
            return false;
        }
        if (head == -1) {
            head = 0;
            tail = 0;
        } else if (head == 0) {
            head = arr.length - 1;
        } else {
            head = head - 1;
        }
        arr[head] = value; 
        
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        // check if deque is full
        if (isFull()) {
            return false;
        }
        if (head == -1) {
            head = 0;
            tail = 0;
        } else if (tail == arr.length - 1) {
            tail = 0;
        } else {
            tail = tail + 1;
        }
        arr[tail] = value; 
        
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }

        //int value = arr[head];
        if (head == tail) {
            // empty, reset to initial status
            head = -1;
            tail = -1;
        } else if (head == arr.length - 1) {
            head = 0;
        } else {
            head++;
        }
        //return value;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }

        //int value = arr[tail];
        if (head == tail) {
            // empty, reset to initial status
            head = -1;
            tail = -1;
        } else if (tail == 0) {
            tail = arr.length - 1;
        } else {
            tail--;
        }
        //return value;
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[head];
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[tail];
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return head == -1;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if (tail == arr.length - 1 && head == 0 || tail == head - 1) {
            return true;
        }

        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
