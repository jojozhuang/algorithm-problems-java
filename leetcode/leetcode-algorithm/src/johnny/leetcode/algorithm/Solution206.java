package johnny.leetcode.algorithm;

import johnny.leetcode.algorithm.common.ListNode;

/**
 * Reverse Linked List.
 * Reverse a singly linked list.
 * @author Johnny
 */
public class Solution206 {
    // Iterative
    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    
    // Recursive
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode next = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return next;
    }
}
