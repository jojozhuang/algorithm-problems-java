/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.cc150.common;

/**
 *
 * @author i857285
 */
public class DoublyListNode {
    public int val;
    public DoublyListNode previous;
    public DoublyListNode next;
    public DoublyListNode(int x) {
        val = x;
        previous = null;
        next = null;
    }
    
    public static DoublyListNode create(int[] values) {  
        if (values == null || values.length == 0) {
            return null;
        }
        
        DoublyListNode dummy = new DoublyListNode(0);
        DoublyListNode curr = dummy;
        for (int i = 0; i < values.length; i++) {
            curr.next = new DoublyListNode(values[i]);
            curr.next.previous = curr;
            curr = curr.next;
        }
        
        return dummy.next;
    }
}
