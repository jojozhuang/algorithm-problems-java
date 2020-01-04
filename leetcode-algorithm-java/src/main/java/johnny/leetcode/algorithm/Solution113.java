package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Path Sum II. 
 * Given a binary tree and a sum, find all root-to-leaf paths where each 
 * path's sum equals the given sum.
 * 
 * For example:
 * Given the below binary tree and sum = 22,
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 * return
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 * * 
 * @author Johnny
 */
public class Solution113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) {
            return res;
        }
        
        List<Integer> list = new ArrayList<Integer>();
        helper(root, sum, list, res);
        
        return res;
    }
    
    private void helper(TreeNode root, int sum, List<Integer> list, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        
        if (root.val == sum) {
            if (root.left == null && root.right == null) {
                list.add(root.val);
                res.add(new ArrayList<Integer>(list));
                list.remove(list.size() - 1); // don't forget to remove the last integer
                return;
            }
        }
        
        list.add(root.val);
        helper(root.left, sum - root.val, list, res);
        helper(root.right, sum - root.val, list, res);
        list.remove(list.size() - 1);
    }
}
