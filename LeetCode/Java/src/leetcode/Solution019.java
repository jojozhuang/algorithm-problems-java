/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.ListNode;

/**
 * Remove Nth Node From End of List .
 * Given a linked list, remove the nth node from the end of list and return its head.
 * For example,
 *    Given linked list: 1->2->3->4->5, and n = 2.
 *    After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 * 
 * @author Johnny
 */
public class Solution019 {  
    private ListNode tail;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null)
            return null;
        
        ListNode ret;
        ListNode reverse = reverseNode(head);
        reverse = tail;
        
        if (n==1) {
            ret = reverse.next;
            ret = reverseNode(ret);
            ret = tail;
            return ret;
        } 
        
        int index = 1;
        ret = reverse;
        do {
            //ret = new ListNode(reverse.val);
            if (index == n - 1) {
                if (ret.next!=null)
                    ret.next = ret.next.next;
                else
                    ret.next = null;
                break;
            }
            else
                ret = ret.next;
            index++;
        }while(index<=n);        
        
        ret = reverseNode(reverse);
        ret = tail;
        return ret;
    }
    
    private ListNode reverseNode(ListNode head) {
        
        tail = null;
        
        if (head==null)
            return null;        
        
        ListNode node = new ListNode(head.val);
        if (head.next == null){
            tail = node;
            return node;
        }            
        else {
            ListNode previous = reverseNode(head.next);
            previous.next = node;
            return node;
        }
    }
    
    // fast and slow pointer
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        if (head == null || n < 1) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode predel = dummy;
        ListNode curr = head;
        
        for (int i = 0; i < n; i++) {
            if (curr == null) {
                return null;
            }
            curr = curr.next;
        }
        
        //move the window(which has length = n)
        while(curr != null) {
            curr = curr.next;
            predel = predel.next;
        }
        
        predel.next = predel.next.next;
        return dummy.next;      
    }
}
