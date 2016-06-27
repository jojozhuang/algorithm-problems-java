/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeNode;

/**
 * Binary Tree Upside Down.
 * 
 * Given a binary tree where all the right nodes are either leaf nodes with a
 * sibling (a left node that shares the same parent node) or empty, flip it 
 * upside down and turn it into a tree where the original right nodes turned 
 * into left leaf nodes. Return the new root.
 * 
 * For example:
 * Given a binary tree {1,2,3,4,5},
 *    1
 *   / \
 *  2  3
 * / \
 * 4 5
 * 
 * return the root of the binary tree [4,5,2,#,#,3,1].
 *    4
 *  /  \
 * 5   2
 *    / \
 *   3   1
 * 
 * @author Johnny
 */
public class Solution156 {
    //https://lefttree.gitbooks.io/leetcode/content/binaryTree/binaryTreeUpsideDown.html
    //https://leetcode.com/discuss/44718/clean-java-solution
    //http://bangbingsyb.blogspot.com/2014/11/leetcode-binary-tree-upside-down.html
    //http://blog.csdn.net/whuwangyi/article/details/43186045
    public TreeNode upsideDownBinaryTree(TreeNode root) {  
        if (root == null) {
            return null;
        }
        TreeNode parent = root, left = root.left, right = root.right;  
        if (left != null) {  
            TreeNode ret = upsideDownBinaryTree(left);  
            left.left = right;  
            left.right = parent;  
            return ret;  
        }  
        return root;  
    }
}
