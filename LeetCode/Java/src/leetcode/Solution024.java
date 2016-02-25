/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.ListNode;

/**
 * Swap Nodes in Pairs.
 * Given a linked list, swap every two adjacent nodes and return its head.
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * 
 * Your algorithm should use only constant space. You may not modify the values
 * in the list, only nodes itself can be changed.
 * 
 * @author Johnny
 */
public class Solution024 {    
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;        

        ListNode after = head.next;
        head.next = swapPairs(after.next);
        after.next = head;
        
        return after;
    }
}
