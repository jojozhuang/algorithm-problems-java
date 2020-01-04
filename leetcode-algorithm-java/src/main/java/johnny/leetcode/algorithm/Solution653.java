package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.HashSet;

/**
 * 653. Two Sum IV - Input is a BST
 * Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

Example 1:
Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 9

Output: True
Example 2:
Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 28

Output: False
 * @author Johnny
 */
public class Solution653 {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return helper(root, set, k);
    }
    
    public boolean helper(TreeNode root, HashSet<Integer> set, int k){
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return helper(root.left, set, k) || helper(root.right, set, k);
    }
}
