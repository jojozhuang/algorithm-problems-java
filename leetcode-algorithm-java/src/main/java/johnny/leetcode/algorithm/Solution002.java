package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;

/**
 * Add Two Numbers.
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 * <p>
 * Input: {@code (2 -> 4 -> 3) + (5 -> 6 -> 4) }
 * Output: {@code 7 -> 0 -> 8 }
 *
 * @author Johnny
 */
public class Solution002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int lv1 = l1 == null ? 0 : l1.val;
            int lv2 = l2 == null ? 0 : l2.val;
            int sum = lv1 + lv2 + carry;
            if (sum >= 10) {
                sum = sum % 10;
                carry = 1;
            } else {
                carry = 0;
            }

            curr.next = new ListNode(sum);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }
}
