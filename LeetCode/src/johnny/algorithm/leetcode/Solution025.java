package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.ListNode;

/**
 * Reverse Nodes in k-Group.
 * Given a linked list, reverse the nodes of a linked list k at a time and 
 * return its modified list.
 * 
 * If the number of nodes is not a multiple of k then left-out nodes in the end 
 * should remain as it is.
 * 
 * You may not alter the values in the nodes, only nodes itself may be changed.
 * 
 * Only constant memory is allowed.
 * 
 * For example,
 * Given this linked list: 1->2->3->4->5
 * 
 * For k = 2, you should return: 2->1->4->3->5
 * 
 * For k = 3, you should return: 3->2->1->4->5
 * 
 * @author Johnny
 */
public class Solution025 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode left = dummy;
        ListNode curr = head;
        
        int i = 1;        
        while(curr != null) {
            curr = curr.next;
            if (curr != null) {
                i++;
            }
            if (i == k) {
                ListNode right = curr.next;
                curr.next = null;
                ListNode newleft = left.next;
                left.next = reverse(left.next);
                left = newleft;
                left.next = right;
                curr = right;
                i = 1;
            }
        }
        
        return dummy.next;
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
