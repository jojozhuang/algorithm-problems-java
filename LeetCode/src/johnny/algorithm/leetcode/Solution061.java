package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.ListNode;

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
