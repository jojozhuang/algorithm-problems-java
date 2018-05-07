package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.ListNode;

/**
 * Linked List Cycle.
 * Given a linked list, determine if it has a cycle in it.
 * 
 * Follow up:
 * Can you solve it without using extra space?
 * 
 * @author Johnny
 */
public class Solution141 {
    //Floyd Cycle detection algorithm, another sample is question 202: Happy Number
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        
        ListNode fast = new ListNode(0);
        fast.next = head;
        ListNode slow = new ListNode(1);
        slow.next = head;
        
        while(fast != null) {
            if (fast.next == null) {
                return false;
            } else {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) { // Compare object, not its value. Nodes with same value may exist.
                    return true;
                }
            }
        }
        
        return false;
    }
}
