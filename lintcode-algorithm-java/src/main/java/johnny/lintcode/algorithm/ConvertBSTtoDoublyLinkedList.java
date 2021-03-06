package johnny.lintcode.algorithm;

import johnny.algorithm.common.DoublyListNode;
import johnny.algorithm.common.TreeNode;

import java.util.Stack;

/**
 * Convert Binary Search Tree to Doubly Linked List
 * <p>
 * Convert a binary search tree to doubly linked list with in-order traversal.
 * <p>
 * Example
 * Given a binary search tree:
 * <p>
 * 4
 * / \
 * 2   5
 * / \
 * 1   3
 * <p>
 * return Doubly Node List 1,2,3,4,5
 *
 * @author Johnny
 */
public class ConvertBSTtoDoublyLinkedList {
    public DoublyListNode bstToDoublyList(TreeNode root) {
        if (root == null) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr = root;
        DoublyListNode dummy = new DoublyListNode(0);
        DoublyListNode currDLN = dummy;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            DoublyListNode node = new DoublyListNode(curr.val);
            currDLN.next = node;
            node.prev = currDLN;
            currDLN = node;

            curr = curr.right;
        }

        dummy.next.prev = null;
        return dummy.next;
    }
}
