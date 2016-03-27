/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;
import leetcode.common.TreeNode;
import java.util.*;
/**
 * Binary Tree Right Side View.
 * Given a binary tree, imagine yourself standing on the right side of it, 
 * return the values of the nodes you can see ordered from top to bottom.
 * 
 * For example:
 * Given the following binary tree,
 *    1            ---
 *  /   \
 * 2     3         ---
 *  \     \
 *   5     4       ---
 * You should return [1, 3, 4].
 *  
 * @author Johnny
 * 
 */
public class Solution199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        
        List<Integer> left = rightSideView(root.left);
        List<Integer> right = rightSideView(root.right);
        
        res.add(root.val);
        if (right.size() > 0) {
            res.addAll(right);
        }
        
        if (left.size() > right.size()) {
            for(int i = right.size(); i < left.size(); i++) {
                res.add(left.get(i));
            }
        }
        
        return res;
    }
}
