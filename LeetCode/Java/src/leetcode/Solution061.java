/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.ListNode;

/**
 * Rotate List.
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 * 
 * For example:
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 * 
 * @author Johnny
 */
public class Solution061 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null)
            return null;
        if (head.next==null)
            return head;
        
        int slow=1;
        int fast=1;
        ListNode fastNode = head;        
        //find the lengh and the tail
        while(fastNode.next!=null) {            
            fastNode = fastNode.next;
            fast++;
        }
        fastNode.next = head;
        
        //check if the required position is bigger than total length
        if (fast<=k)
            return head;
        
        //find the position for rotate
        ListNode slowNode = head;
        while(fast-slow>k) {
            slowNode = slowNode.next;
            slow++;
        }        
        ListNode newhead = slowNode.next;
        slowNode.next = null;
                        
        return newhead;
    }
}
