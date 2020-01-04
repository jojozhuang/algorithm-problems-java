package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
/**
 * Binary Tree Paths.
 * Given a binary tree, return all root-to-leaf paths.
 * 
 * For example, given the following binary tree:
 * 
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 * All root-to-leaf paths are:
 * 
 * ["1->2->5", "1->3"]
 * 
 * @author Johnny
 */
public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        
        if (root.left == null && root.right == null) {
            ans.add(String.valueOf(root.val));
            return ans;
        }
        List<String> left = binaryTreePaths(root.left);
        List<String> right = binaryTreePaths(root.right);
        for (String s1 : left) {
            ans.add(String.valueOf(root.val) + "->" + s1);
        }
        for (String s2 : right) {
            ans.add(String.valueOf(root.val) + "->" + s2);
        }
        return ans;
    }
}
