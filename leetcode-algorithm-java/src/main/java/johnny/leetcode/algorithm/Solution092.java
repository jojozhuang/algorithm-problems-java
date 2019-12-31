package johnny.leetcode.algorithm;

import johnny.leetcode.algorithm.common.ListNode;

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
        if(head == null || head.next == null || m < 1 || n < m) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode premNode = dummy;
        int i = 0;
        for (i = 1; i < m; i++) {
            premNode = premNode.next;
        }
        
        ListNode prev = null;
        ListNode curr = premNode.next;
        while (curr != null && i <= n) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr; 
            curr = next;
            i++;
        }
        
        premNode.next.next = curr;
        premNode.next = prev;
        
        return dummy.next;
    }
}
