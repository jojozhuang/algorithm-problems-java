/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import leetcode.common.TreeNode;

/**
 * Find Duplicate Subtrees
 * 
 * Given a binary tree, return all duplicate subtrees. For each kind of 
 * duplicate subtrees, you only need to return the root node of any one of them.
 * 
 * Two trees are duplicate if they have the same structure with same node values.
 * 
 * Example 1: 
 *       1
 *      / \
 *     2   3
 *    /   / \
 *   4   2   4
 *      /
 *     4
 * 
 * The following are two duplicate subtrees:
 *     2
 *    /
 *   4
 * and
 *   4
 * 
 * Therefore, you need to return above trees' root in the form of a list.
 * 
 * @author i857285
 */
public class Solution652 {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new LinkedList<TreeNode>();
        if (root == null) {
            return res;
        }
        Map<String, Integer> map = new HashMap<String, Integer>();
        preorder(root, map, res);
        return res;
    }
    
    // generate preoder key of each node
    private String preorder(TreeNode root, Map<String, Integer> map, List<TreeNode> res) {
        if (root == null) {
            return "#";
        }
        String path = root.val + "," + preorder(root.left, map, res) + "," + preorder(root.right, map, res);
        if (!map.containsKey(path)) {
            map.put(path, 0);
        } else {
            map.put(path, map.get(path) + 1);
        }
        if (map.get(path) == 1) {
            res.add(root);
        }
        return path;
    }
}
