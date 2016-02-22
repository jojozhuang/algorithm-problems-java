/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.ListNode;

/**
 * Linked List Cycle II.
 * Given a linked list, return the node where the cycle begins. If there is no
 * cycle, return null.
 * 
 * Follow up:
 * Can you solve it without using extra space?
 * 
 * @author Johnny
 */
public class Solution142 {
    public ListNode detectCycle(ListNode head) {        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && slow != null) {
            if (fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                while(fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        
        return null;
    }
}
