package johnny.leetcode.algorithm;

import johnny.leetcode.algorithm.common.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Binary Tree Level Order Traversal.
 * Given a binary tree, return the level order traversal of its nodes' values. 
 * (ie, from left to right, level by level).
 * 
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 * 
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 * 
 * @author Johnny
 */
public class Solution102 {
    // DFS, recursive
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        helper(root, ans, 0);
        
        return ans;
    }
    private void helper(TreeNode root, List<List<Integer>> list, int height) {
        if (root == null) {
            return;
        }
        
        if (height >= list.size()) {
            list.add(new ArrayList<Integer>());
        }
        list.get(height).add(root.val);
        helper(root.left, list, height + 1);
        helper(root.right, list, height + 1);
    }
    
    // BFS, queue
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if (root == null) {
            return res;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int size = queue.size(); 
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(level);
        }
        
        return res;
    }
}
