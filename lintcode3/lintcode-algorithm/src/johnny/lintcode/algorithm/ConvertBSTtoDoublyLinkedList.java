package johnny.lintcode.algorithm;

import java.util.Stack;

import johnny.lintcode.algorithm.common.DoublyListNode;
import johnny.lintcode.algorithm.common.TreeNode;

/**
 * Convert Binary Search Tree to Doubly Linked List
 * 
 * Convert a binary search tree to doubly linked list with in-order traversal.
 * 
 * Example
 * Given a binary search tree:
 * 
 *     4
 *    / \
 *   2   5
 *  / \
 * 1   3
 * 
 * return 1<->2<->3<->4<->5
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
