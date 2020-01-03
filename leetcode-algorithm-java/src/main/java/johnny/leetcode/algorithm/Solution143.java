package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;

/**
 * Reorder List.
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 * 
 * You must do this in-place without altering the nodes' values.
 * 
 * For example,
 * Given {1,2,3,4}, reorder it to {1,4,2,3}.
 * 
 * @author Johnny
 */
public class Solution143 {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        // find mid
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode rhead = slow.next;
        slow.next = null;
        // reverse right half
        ListNode right = null;
        while(rhead != null) {
            ListNode next = rhead.next;
            rhead.next = right;
            right = rhead;
            rhead = next;
        }
        // rebuild list, merge head and right
        ListNode left = head;
        while(left != null && right != null) {
            ListNode leftnext = left.next;
            left.next = right;
            left = leftnext;
            ListNode rightnext = right.next;
            right.next = left;
            right = rightnext;
        }
    }
}
