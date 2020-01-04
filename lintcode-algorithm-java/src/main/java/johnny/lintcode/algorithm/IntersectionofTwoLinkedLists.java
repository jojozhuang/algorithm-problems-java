package johnny.lintcode.algorithm;

import johnny.algorithm.common.ListNode;

/**
 * Intersection of Two Linked Lists.
 *
 * @author Johnny
 */
public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int len1 = 0;
        ListNode head1 = headA;
        while (head1 != null) {
            head1 = head1.next;
            len1++;
        }

        int len2 = 0;
        ListNode head2 = headB;
        while (head2 != null) {
            head2 = head2.next;
            len2++;
        }

        head1 = headA;
        head2 = headB;
        int i = 0;
        if (len1 > len2) {
            while (i < len1 - len2) {
                head1 = head1.next;
                i++;
            }
        } else if (len1 < len2) {
            while (i < len2 - len1) {
                head2 = head2.next;
                i++;
            }
        }

        while (head1 != null && head2 != null) {
            if (head1.val == head2.val) {
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        return null;
    }
    /* do not use reverse, it does not work, the first reverse affects the second reverse.
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Write your code here
        if (headA == null || headB == null) {
            return null;
        }

        ListNode l1 = reverse(headA);
        ListNode l2 = reverse(headB);
        ListNode prev = null;
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                break;
            } else {
                prev = l1;
                l1 = l1.next;
                l2 = l2.next;
            }
        }

        return prev;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }*/
}
