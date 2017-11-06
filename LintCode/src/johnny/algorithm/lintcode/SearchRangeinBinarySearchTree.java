/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode;

import java.util.ArrayList;
import java.util.Collections;

import johnny.algorithm.lintcode.common.TreeNode;

/**
 * Search Range in Binary Search Tree.
 * Given two values k1 and k2 (where k1 < k2) and a root pointer to a Binary
 * Search Tree. Find all the keys of tree in range k1 to k2. i.e. print
 * all x such that k1<=x<=k2 and x is a key of given BST. Return all 
 * the keys in ascending order.
 * 
 * Example
 * If k1 = 10 and k2 = 22, then your function should return [12, 20, 22].
 * 
 *     20
 *    /  \
 *   8   22
 *  / \
 * 4   12
 * 
 * @author Johnny
 */
public class SearchRangeinBinarySearchTree {
    public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        
        helper(root, k1, k2, ret);
        
        return ret;
    }
    
    private void helper(TreeNode root, int k1, int k2, ArrayList<Integer> ret) {
        if (root == null || k1 > k2) {
            return;
        }
        
        helper(root.left, k1, k2, ret);
        if (root.val >= k1 && root.val <= k2) {
            ret.add(root.val);
        }
        helper(root.right, k1, k2, ret);
    }
}
