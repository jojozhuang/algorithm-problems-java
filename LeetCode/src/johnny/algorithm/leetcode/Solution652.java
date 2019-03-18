package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import johnny.algorithm.leetcode.common.TreeNode;

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
 * @author Johnny
 */
public class Solution652 {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        preorder(root, map, ans);
        return ans;
    }
    
    private String preorder(TreeNode root, Map<String, Integer> map, List<TreeNode> ans) {
        if (root == null) {
            return "#";
        }
        
        String path = root.val + "," + preorder(root.left, map, ans) + "," + preorder(root.right, map, ans);
        map.put(path, map.getOrDefault(path, 0) + 1);
        
        if (map.get(path) == 2) {
            ans.add(root);
        }
        
        return path;
    }
}
