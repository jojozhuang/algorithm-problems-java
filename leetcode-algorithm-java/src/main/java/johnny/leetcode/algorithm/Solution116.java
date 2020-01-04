package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeLinkNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Populating Next Right Pointers in Each Node.
 * Given a binary tree
 * 
 *     struct TreeLinkNode {
 *       TreeLinkNode *left;
 *       TreeLinkNode *right;
 *       TreeLinkNode *next;
 *     }
 * Populate each next pointer to point to its next right node. If there is no 
 * next right node, the next pointer should be set to NULL.
 * 
 * Initially, all next pointers are set to NULL.
 * 
 * Note:
 * 
 * You may only use constant extra space.
 * You may assume that it is a perfect binary tree (ie, all leaves are at the 
 * same level, and every parent has two children).
 * 
 * For example,
 * Given the following perfect binary tree,
 *          1
 *        /  \
 *       2    3
 *      / \  / \
 *     4  5  6  7
 * After calling your function, the tree should look like:
 *          1 -> NULL
 *        /  \
 *       2 -> 3 -> NULL
 *      / \  / \
 *     4->5->6->7 -> NULL
 * 
 * @author Johnny
 */
public class Solution116 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val,Node _left,Node _right,Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    
    // queue, level order
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (i != size - 1){
                    node.next = queue.peek();
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        
        return root;
    }
    
    // constant space
    public void connect(TreeLinkNode root) {
        if (root == null || root.left == null) {
            return;
        }
        
        TreeLinkNode level = root;
        
        while (level != null) {
            // current level
            TreeLinkNode curr = level;
            while (curr != null) {
                if (curr.left != null) {
                    curr.left.next = curr.right;
                }
                
                if (curr.right != null && curr.next != null) {
                    curr.right.next = curr.next.left;
                }
                
                curr = curr.next;
            }
            // next level
            level = level.left;
        }
    }
    
    public void connect3(TreeLinkNode root) {
        if (root == null || root.left == null) {
            return;
        }
        
        //current level
        root.left.next = root.right;
        
        //silbing
        TreeLinkNode currentNode = root;
        TreeLinkNode nextNode = root.next;
        while (nextNode != null) {
            currentNode.right.next = nextNode.left;
            nextNode.left.next = nextNode.right;
            currentNode = nextNode;
            nextNode = nextNode.next;
        }
        
        //next level
        connect(root.left);
    }
    
    public void connect2(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        
        TreeLinkNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                curr.left.next = curr.right;
            }
            if (curr.right != null) {
                if (curr.next != null) {
                    curr.right.next = curr.next.left;
                }
            }
            curr = curr.next;
        }
        
        connect(root.left);
    }
}
