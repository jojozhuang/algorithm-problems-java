/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.ListNode;

/**
 * Partition List.
 * Given a linked list and a value x, partition it such that all nodes less 
 * than x come before nodes greater than or equal to x.
 * 
 * You should preserve the original relative order of the nodes in each of the 
 * two partitions.
 * 
 * For example,
 * Given 1->4->3->2->5->2 and x = 3,
 * return 1->2->2->4->3->5.
 * 
 * @author Johnny
 */
public class Solution086 {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return head;
        }
        
        ListNode leftDummy = new ListNode(0);
        ListNode leftCurr = leftDummy;
        ListNode rightDummy = new ListNode(0);
        ListNode rightCurr = rightDummy;
        
        ListNode current = head;
        while(current != null) {
            if (current.val < x) {
                leftCurr.next = current;
                leftCurr = leftCurr.next;
            } else {
                rightCurr.next = current;
                rightCurr = rightCurr.next;
            }
            current = current.next;
        }
        
        rightCurr.next = null;
        leftCurr.next = rightDummy.next;
        
        return leftDummy.next;
    }
}
