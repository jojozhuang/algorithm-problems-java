package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

import johnny.algorithm.leetcode.common.TreeNode;

/**
 * 872. Leaf-Similar Trees
 * 
 * Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a leaf value sequence.



For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

Two binary trees are considered leaf-similar if their leaf value sequence is the same.

Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.

 

Note:

Both of the given trees will have between 1 and 100 nodes.

 * @author Johnny
 */
public class Solution872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = leaves(root1);
        List<Integer> list2 = leaves(root2);
        
        if (list1.size() != list2.size()) {
            return false;
        }
        
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    private List<Integer> leaves(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        
        if (root.left == null && root.right == null) {
            res.add(root.val);
            return res;
        }
        
        List<Integer> left = leaves(root.left);
        List<Integer> right = leaves(root.right);
        res.addAll(left);
        res.addAll(right);
        
        return res;
    }
}
