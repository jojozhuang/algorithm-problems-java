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
public class SinglyLinkedList {    
    public ListNode findMiddle(ListNode head) {
        if (head == null) {
            return null;
        }
        
        // find middle
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next; // two steps for each pace
            slow = slow.next;      // one step for each pace
        }
        
        return slow;
    }
}
