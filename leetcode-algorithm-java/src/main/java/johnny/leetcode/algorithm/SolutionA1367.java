package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;
import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 1367. Linked List in Binary Tree
 *
 * Given a binary tree root and a linked list with head as the first node.
 *
 * Return True if all the elements in the linked list starting from the head correspond to some downward path connected in the binary tree otherwise return False.
 *
 * In this context downward path means a path that starts at some node and goes downwards.
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: head = [4,2,8], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
 * Output: true
 * Explanation: Nodes in blue form a subpath in the binary Tree.
 * Example 2:
 *
 *
 *
 * Input: head = [1,4,2,6], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
 * Output: true
 * Example 3:
 *
 * Input: head = [1,4,2,6,8], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
 * Output: false
 * Explanation: There is no path in the binary tree that contains all the elements of the linked list from head.
 *
 *
 * Constraints:
 *
 * 1 <= node.val <= 100 for each node in the linked list and binary tree.
 * The given linked list will contain between 1 and 100 nodes.
 * The given binary tree will contain between 1 and 2500 nodes.
 *
 */
public class SolutionA1367 {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) {
            return false;
        }

        if (head == null) {
            return true;
        }

        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val).append(",");
            head = head.next;
        }
        String listval = sb.toString(); // 4,2,8,

        List<String> list = new ArrayList<>();
        // get all path list from tree
        dfs(root, "", list);
        for (String str : list) {
            if (str.indexOf(listval) >= 0) {
                return true;
            }
        }

        return false;
    }

    // get path from root to left for the given tree
    private void dfs(TreeNode root, String path, List<String> list) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            list.add(path + root.val + ",");
            return;
        }

        dfs(root.left, path + root.val + ",", list);
        dfs(root.right, path + root.val + ",", list);
    }

    // time exceeds limit
    public boolean isSubPath3(ListNode head, TreeNode root) {
        if (root == null) {
            return false;
        }

        if (head.val != root.val) {
            return isSubPath(head, root.left) || isSubPath(head, root.right);
        } else {
            if (head.next == null) {
                return true;
            } else {
                return isSubPath(head.next, root.left) || isSubPath(head.next, root.right);
            }
        }
    }
}
