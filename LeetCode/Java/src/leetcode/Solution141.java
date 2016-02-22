/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.ListNode;

/**
 * Linked List Cycle.
 * Given a linked list, determine if it has a cycle in it.
 * 
 * Follow up:
 * Can you solve it without using extra space?
 * 
 * @author Johnny
 */
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        
        ListNode fast = new ListNode(0);
        fast.next = head;
        ListNode slow = new ListNode(1);
        slow.next = head;
        
        while(fast != null) {
            if (fast.next == null) {
                return false;
            }
            else {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
