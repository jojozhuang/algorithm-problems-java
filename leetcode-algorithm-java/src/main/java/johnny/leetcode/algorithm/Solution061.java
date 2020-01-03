package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;

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
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        
        int step = k % len;
        if (step == 0) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = head;
        while (step > 0) {
            fast = fast.next;
            step--;
        }
        
        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        fast.next = dummy.next;
        dummy.next = slow.next;
        slow.next = null;
        
        return dummy.next;
    }
    
    public ListNode rotateRight2(ListNode head, int k) {
        if (head == null || k <= 0) {
            return head;
        }
        
        ListNode fast = head;
        int len = 1;
        while (fast != null && fast.next != null) {
            fast = fast.next;
            len++;
        }
                
        int step = Math.abs(len - k % len);
        if (step == 0 || step == len) {
            return head;
        }
        
        ListNode prev = head;
        ListNode rhead = head.next;
        while (rhead != null && step > 1) {
            rhead = rhead.next;
            prev = prev.next;
            step--;
        }
        
        prev.next = null;
        fast.next = head;
        
        return rhead;
    }
}
