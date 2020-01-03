package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * 965. Univalued Binary Tree
A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued.

 

Example 1:


Input: [1,1,1,1,1,null,1]
Output: true
Example 2:


Input: [2,2,2,5,2]
Output: false
 

Note:

The number of nodes in the given tree will be in the range [1, 100].
Each node's value will be an integer in the range [0, 99].

 * @author Johnny
 */
public class Solution965 {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        if (root.left == null && root.right == null) {
            return true;
        }
        
        return helper(root.left, root.val) && helper(root.right, root.val);        
    }
    
    private boolean helper(TreeNode root, int value) {
        if (root == null) {
            return true;
        }
        
        if (root.val != value) {
            return false;
        }
        
        return helper(root.left, value) && helper(root.right, value);
    }
}
