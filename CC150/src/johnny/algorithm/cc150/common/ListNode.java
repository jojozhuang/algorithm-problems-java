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
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
        next = null;
    }
    
    public static ListNode create(int[] values) {  
        if (values == null || values.length == 0) {
            return null;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int i = 0; i < values.length; i++) {
            curr.next = new ListNode(values[i]);
            curr = curr.next;
        }
        
        return dummy.next;
    }
}
