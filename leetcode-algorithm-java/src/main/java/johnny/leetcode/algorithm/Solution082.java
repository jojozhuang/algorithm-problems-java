package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;

/**
 * Remove Duplicates from Sorted List II.
 * Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 * 
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 * 
 * @author Johnny
 */
public class Solution082 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode previous = dummy;
        ListNode curr = head;
        while (curr != null) {
            if (curr.next == null) {
                break;
            }
            if (curr.val != curr.next.val) {
                previous = previous.next;
                curr = curr.next;
            } else {
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                } 

                previous.next = curr.next;
                curr = curr.next;
            }
        }
        
        return dummy.next;
    }
    
    public ListNode deleteDuplicates2(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode curr = dummy;
        while (curr.next != null && curr.next.next != null) {
            if (curr.next.val == curr.next.next.val) {
                int pre_value = curr.next.val;
                while (curr.next != null && curr.next.val == pre_value) {
                    curr.next = curr.next.next;
                }
            }
            else {
                curr = curr.next;
            }
        }
        
        return dummy.next;
    }
}
