/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import leetcode.common.TreeLinkNode;

/**
 * Populating Next Right Pointers in Each Node II.
 * Follow up for problem "Populating Next Right Pointers in Each Node".
 * 
 * What if the given tree could be any binary tree? Would your previous solution still work?
 * 
 * Note:
 * 
 * You may only use constant extra space.
 * For example,
 * Given the following binary tree,
 *          1
 *        /  \
 *       2    3
 *      / \    \
 *     4   5    7
 * After calling your function, the tree should look like:
 *          1 -> NULL
 *        /  \
 *       2 -> 3 -> NULL
 *      / \    \
 *     4-> 5 -> 7 -> NULL
 * 
 * @author Johnny
 */
public class Solution117 {
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        
        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeLinkNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                if (i < size - 1) {
                    TreeLinkNode next = queue.peek();
                    node.next = next;
                }
            }
        }
    }
    
    public void connect2(TreeLinkNode root) {
        if (root == null) {
            return;
        }

        TreeLinkNode parent = root;
        TreeLinkNode pre;
        TreeLinkNode next;
        while (parent != null) {
            pre = null;
            next = null;
            while (parent != null) {
                if (next == null){
                    next = (parent.left != null) ? parent.left: parent.right;
                }

                if (parent.left != null){
                    if (pre != null) {
                        pre.next = parent.left;
                        pre = pre.next;
                    } else {
                        pre = parent.left;
                    }
                }

                if (parent.right != null) {
                    if (pre != null) {
                        pre.next = parent.right;
                        pre = pre.next;
                    } else {
                        pre = parent.right;
                    }
                }
                parent = parent.next;
            }
            parent = next;
        }    
    }
}
