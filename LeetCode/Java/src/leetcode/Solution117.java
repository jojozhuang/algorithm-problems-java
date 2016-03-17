/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
}
