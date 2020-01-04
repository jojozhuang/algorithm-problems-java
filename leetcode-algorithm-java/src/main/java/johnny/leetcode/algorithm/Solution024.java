package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;

/**
 * Swap Nodes in Pairs.
 * Given a linked list, swap every two adjacent nodes and return its head.
 * For example,
 * Given {@code 1->2->3->4}, you should return the list as {@code 2->1->4->3}.
 * <p>
 * Your algorithm should use only constant space. You may not modify the values
 * in the list, only nodes itself can be changed.
 *
 * @author Johnny
 */
public class Solution024 {
    // Iteration
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            prev.next = curr.next;
            curr.next = curr.next.next;
            prev.next.next = curr;
            curr = curr.next;
            prev = prev.next.next;
        }

        return dummy.next;
    }

    // Recursion
    public ListNode swapPairs2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode after = head.next;
        head.next = swapPairs(after.next);
        after.next = head;

        return after;
    }
}
