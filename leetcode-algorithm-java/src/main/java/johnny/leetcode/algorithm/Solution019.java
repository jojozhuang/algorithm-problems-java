package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;

/**
 * Remove Nth Node From End of List .
 * Given a linked list, remove the nth node from the end of list and return its head.
 * For example,
 * Given linked list: {@code 1->2->3->4->5 }, and n = 2.
 * After removing the second node from the end, the linked list becomes {@code 1->2->3->5}.
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

        ListNode slow = dummy;
        ListNode fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        //move the window(which has length = n)
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
