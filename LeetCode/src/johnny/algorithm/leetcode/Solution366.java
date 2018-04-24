package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import johnny.algorithm.leetcode.common.TreeNode;

/**
 * Find Leaves of Binary Tree.
 * Given a binary tree, find all leaves and then remove those leaves. 
 * Then repeat the previous steps until the tree is empty.
 * 
 * Example:
 * Given binary tree 
 *           1
 *          / \
 *         2   3
 *        / \     
 *       4   5    
 * Returns [4, 5, 3], [2], [1].
 * 
 * 
 * Explanation:
 * 1. Remove the leaves [4, 5, 3] from the tree
 * 
 *           1
 *          / 
 *         2          
 * 2. Remove the leaf [2] from the tree
 * 
 *           1          
 * 3. Remove the leaf [1] from the tree
 * 
 *           []         
 * Returns [4, 5, 3], [2], [1].
 * 
 * @author Johnny
 */
public class Solution366 {
    //http://www.cnblogs.com/grandyang/p/5616158.html
    //https://discuss.leetcode.com/topic/49194/10-lines-simple-java-solution-using-recursion-with-explanation
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        height(root, res);
        return res;
    }
    private int height(TreeNode node, List<List<Integer>> res){
        if(null==node)  return -1;
        int level = 1 + Math.max(height(node.left, res), height(node.right, res));
        if(res.size()<level+1)  res.add(new ArrayList<>());
        res.get(level).add(node.val);
        return level;
    }
}
