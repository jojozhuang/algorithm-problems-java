package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;
import johnny.algorithm.common.TreeNode;

/**
 * Convert Sorted List to Binary Search Tree.
 * Given a singly linked list where elements are sorted in ascending order,
 * convert it to a height balanced BST.
 *
 * @author Johnny
 */
public class Solution109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode curr = head;
        int len = 0;
        while (curr != null) {
            curr = curr.next;
            len++;
        }
        return helper(head, len);
    }

    private TreeNode helper(ListNode head, int len) {
        if (head == null || len <= 0) {
            return null;
        }

        ListNode curr = head;
        int count = 0;
        while (count < len / 2) {
            curr = curr.next;
            count++;
        }

        TreeNode root = new TreeNode(curr.val);
        root.left = helper(head, len / 2);
        root.right = helper(curr.next, len - 1 - len / 2);

        return root;
    }
}
