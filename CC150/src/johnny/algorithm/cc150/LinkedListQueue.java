/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.cc150;

import johnny.algorithm.cc150.common.ListNode;

/**
 *
 * @author Johnny
 */
public class LinkedListQueue {
    private ListNode head; // the first node
    private ListNode tail; // the last node
    
    public LinkedListQueue() {
        head = null;
        tail = null;
    }
    
    // Add value to the tail of the list
    public void enqueue(int value) {
        if (tail == null) {
            tail = new ListNode(value);
            head = tail;
        } else {
            tail.next = new ListNode(value);
            tail = tail.next;
        }
    }
    
    // Poll value from the beginning of the list
    public int dequeue() throws Exception {
        if (head == null) {
            throw new Exception();
        }
        int value = head.val;
        head = head.next;
        return value;
    }

    public int peek() throws Exception {
        if (head == null) {
            throw new Exception();
        }
        return head.val;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
}
