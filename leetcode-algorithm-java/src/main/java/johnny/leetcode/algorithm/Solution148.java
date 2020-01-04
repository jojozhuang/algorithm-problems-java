package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;

/**
 * Sort List.
 * Sort a linked list in O(n log n) time using constant space complexity.
 *
 * @author Johnny
 */
public class Solution148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //find mid
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode rightnode = slow.next;
        ListNode right = sortList(rightnode);
        slow.next = null;
        ListNode left = sortList(head);
        //merge
        return mergeTwoLists(left, right);
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1 != null) {
            curr.next = l1;
        }
        if (l2 != null) {
            curr.next = l2;
        }
        return dummy.next;
    }
}
