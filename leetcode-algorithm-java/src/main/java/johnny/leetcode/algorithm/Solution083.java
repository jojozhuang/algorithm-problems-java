package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;

/**
 * Remove Duplicates from Sorted List .
 * Given a sorted linked list, delete all duplicates such that each element
 * appear only once.
 * <p>
 * For example,
 * {@code Given 1->1->2, return 1->2.}
 * {@code Given 1->1->2->3->3, return 1->2->3.}
 *
 * @author Johnny
 */
public class Solution083 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode curr = head;
        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }
}
