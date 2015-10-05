/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeNode;
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
        if (root == null)
            return new ArrayList();
        
        List<List<Integer>> listpath = new ArrayList();
        List<List<Integer>> nextpath = new ArrayList();
        List<Integer> list = new ArrayList();
        
        if (root.left==null&&root.right==null) {
            if (root.val == sum) {
                list.add(sum);
                listpath.add(list);
                return listpath;
            }
            else
                return new ArrayList();
        }
        if (root.left!=null) {
            nextpath = pathSum(root.left, sum - root.val);
            if(nextpath!=null&&nextpath.size()>0) {
                for(int i=0; i<nextpath.size(); i++) {
                    nextpath.get(i).add(0, root.val);                    
                }
                listpath.addAll(nextpath);
            }
        }        
        if (root.right!=null) {
            nextpath = pathSum(root.right, sum - root.val);
            if(nextpath!=null&&nextpath.size()>0) {
                for(int i=0; i<nextpath.size(); i++) {
                    nextpath.get(i).add(0, root.val);                    
                }
                listpath.addAll(nextpath);
            }
        }
        
        return listpath;
    }
}
