/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc150;

import cc150.common.TreeNode;

/**
 * cc150: 4.5
 * Write an algorithm to find the ‘next’ node (e g , in-order successor) of a 
 * given node in a binary search tree where each node has a link to its parent
 * 
 * @author i857285
 */
public class NodeSuccessor {
    public TreeNode inorderSuccessort(TreeNode node) {
        if (node == null) {
            return null;
        }
        
        if (node.right != null) {
            TreeNode left = node.right;
            while(left.left != null) {
                left = left.left;
            }
            return left;
        } else {
            if (node.parent == null) {
                return null;
            } else {
                TreeNode parent = node.parent;
                if (parent.left == node) {
                    return parent;
                } else {
                    while (parent.parent != null) {
                        if (parent.val > node.val) {
                            return parent;
                        } else {
                            parent = parent.parent;
                        }
                    }
                    if (parent.val > node.val) {
                        return parent;
                    }
                }
            }
        }
        
        return null;
    }
    
    public TreeNode inorderSuccessort2(TreeNode e) {
        if (e != null) {
            TreeNode p;
            // Found right children -> return 1st inorder node on right 
            if (e.parent == null || e.right != null) {
                p = leftMostChild(e.right); 
            } else {
                // Go up until we’re on left instead of right (case 2b) 
                while ((p = e.parent) != null) {
                    if (p.left == e) {
                        break;
                    }
                    e = p; 
                }
            }
            return p; 
        }
        return null;
    }

    private TreeNode leftMostChild(TreeNode e) {
        if (e == null) {
            return null;
        }   
        while (e.left != null) {
            e = e.left;
        }
        return e;
    }
}
