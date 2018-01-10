package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.ListNode;

/**
 * Remove Nth Node From End of List .
 * Given a linked list, remove the nth node from the end of list and return its head.
 * For example,
 *    Given linked list: 1->2->3->4->5, and n = 2.
 *    After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 * 
 * @author Johnny
 */
public class Solution019 {  
    // fast and slow pointer
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n < 1) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode predel = dummy;
        ListNode curr = head;
        
        for (int i = 0; i < n; i++) {
            if (curr == null) {
                return null;
            }
            curr = curr.next;
        }
        
        //move the window(which has length = n)
        while(curr != null) {
            curr = curr.next;
            predel = predel.next;
        }
        
        predel.next = predel.next.next;
        return dummy.next;      
    }
}
