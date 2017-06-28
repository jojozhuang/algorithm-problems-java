/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.ListNode;

/**
 * Merge Two Sorted Lists .
 * Merge two sorted linked lists and return it as a new list. The new list 
 * should be made by splicing together the nodes of the first two lists.
 * 
 * @author Johnny
 */
public class Solution021 { 
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);        
        ListNode curr = dummy;
        while(l1 != null && l2 != null) {            
            ListNode newnode;
            if (l1.val <= l2.val) {
                newnode = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                newnode = new ListNode(l2.val); 
                l2 = l2.next;
            }            
            curr.next = newnode;
            curr = curr.next;
        }
        if (l1 != null) {
            curr.next = l1;
        }
        if (l2 != null) {
            curr.next = l2;
        }
        return dummy.next;
    }
    
    // in place
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy; 
        while(l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }            
            curr = curr.next;
        }
        if (l1 != null) {
            curr.next = l1;
        }
        if (l2 != null) {
            curr.next = l2;
        }
        return dummy.next;
    }
}
