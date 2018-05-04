package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.ListNode;

/**
 * Linked List Cycle II.
 * Given a linked list, return the node where the cycle begins. If there is no
 * cycle, return null.
 * 
 * Follow up:
 * Can you solve it without using extra space?
 * 
 * @author Johnny
 */
public class Solution142 {
    //http://www.cnblogs.com/hiddenfox/p/3408931.html
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        
        return null;
    }
}
