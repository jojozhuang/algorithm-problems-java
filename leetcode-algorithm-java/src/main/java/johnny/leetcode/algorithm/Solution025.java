package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;

/**
 * Reverse Nodes in k-Group.
 * Given a linked list, reverse the nodes of a linked list k at a time and
 * return its modified list.
 * <p>
 * If the number of nodes is not a multiple of k then left-out nodes in the end
 * should remain as it is.
 * <p>
 * You may not alter the values in the nodes, only nodes itself may be changed.
 * <p>
 * Only constant memory is allowed.
 * <p>
 * For example,
 * Given this linked list: {@code 1->2->3->4->5}
 * <p>
 * For k = 2, you should return: {@code 2->1->4->3->5}
 * <p>
 * For k = 3, you should return: {@code 3->2->1->4->5}
 *
 * @author Johnny
 */
public class Solution025 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }

        // get length
        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        int count = len / k;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        curr = head;
        ListNode prev = dummy;
        while (curr != null && count > 0) {
            ListNode right = curr;
            int i = k;
            while (i > 1) {
                right = right.next;
                i--;
            }
            ListNode next = right.next;
            right.next = null;
            ListNode temp = prev.next;
            prev.next = reverse(curr);
            temp.next = next;
            prev = temp;
            curr = next;
            count--;
        }

        return dummy.next;
    }

    public ListNode reverseKGroup3(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }
        ListNode curr = head;
        int count = 0;
        while (curr != null && count != k) { // find the k+1 node
            curr = curr.next;
            count++;
        }
        if (count == k) { // if k+1 node is found
            curr = reverseKGroup(curr, k); // reverse list with k+1 node as head
            // head - head-pointer to direct part, 
            // curr - head-pointer to reversed part;
            while (count-- > 0) { // reverse current k-group: 
                ListNode tmp = head.next; // tmp - next head in direct part
                head.next = curr; // preappending "direct" head to the reversed list 
                curr = head; // move head of reversed part to a new node
                head = tmp; // move "direct" head to the next node in direct part
            }
            head = curr;
        }
        return head;
    }

    public ListNode reverseKGroup2(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode left = dummy;
        ListNode curr = head;

        int i = 1;
        while (curr != null) {
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
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
