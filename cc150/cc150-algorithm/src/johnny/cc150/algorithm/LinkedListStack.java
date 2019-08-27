package johnny.cc150.algorithm;

import johnny.cc150.algorithm.common.ListNode;

/**
 *
 * @author Johnny
 */
public class LinkedListStack {
    private ListNode head; // the first node
    
    public LinkedListStack() {
        head = null;
    }
    
    // Add value to the beginning of the list
    public void push(int value) {
        ListNode oldHead = head;
        head = new ListNode(value);
        head.next = oldHead;
    }
    
    // Remove value from the beginning of the list
    public int pop() throws Exception {
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
