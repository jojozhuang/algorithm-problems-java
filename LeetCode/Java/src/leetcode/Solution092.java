/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.ListNode;

/**
 * Reverse Linked List II.
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 * 
 * For example:
 * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 * 
 * return 1->4->3->2->5->NULL.
 * 
 * Note:
 * Given m, n satisfy the following condition:
 * 1 ≤ m ≤ n ≤ length of list.
 * 
 * @author Johnny
 */
public class Solution092 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null||head.next==null||m<1||n<m)
            return head;
        
        int i=0;
        ListNode current = head;
        ListNode previous;
        while(current.next!=null&&i<n) {
            if (i<m) {
                current = current.next;
                i++;
                //if (i==m-1)
                    //previous = new 
            }
            else if (i>=m &&i<=n){
                
            }
        }
        
        return head;
    }
}
