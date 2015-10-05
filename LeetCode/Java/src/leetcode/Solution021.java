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
        if (l1==null && l2==null)
            return null;
        if (l1==null && l2!=null)
            return l2;
        if (l1!=null && l2==null)
            return l1;
        
        ListNode ret = null;
        ListNode previous = null;
        ListNode current = null;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        
        if (temp1.val < temp2.val)
            ret = temp1;
        else
            ret = temp2;
        
        do {           
            if (temp1.val < temp2.val) {
                current = new ListNode(temp1.val);
                current.next = temp1.next;
                temp1 = temp1.next;
            }
            else {
                current = new ListNode(temp2.val);
                current.next = temp2.next;
                temp2 = temp2.next;
            }
            if (previous==null) {
                previous = current;
                ret = previous;
            }
            else {
                previous.next = current;
                previous = previous.next;
            }
            if (temp1==null) {
                previous.next = temp2;
                break;
            }
            if (temp2==null) {
                previous.next = temp1;
                break;
            }
            
        }while(temp1!=null&&temp2!=null);
        
        return ret;
    }
}
