/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeNode;
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int size = queue.size();
            for (int ix = 0; ix < size; ix++) {
                TreeNode head = queue.poll();
                level.add(head.val);
                if (head.left != null) {
                    queue.offer(head.left);
                }
                if (head.right != null) {
                    queue.offer(head.right);
                }
            }
            result.add(level);
        }
        
        return result;
    }
    /*
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList();
        List<Integer> list = new ArrayList();
        
        if (root==null)
            return ret;
        
        list.add(root.val);
        ret.add(list);
        
        List<List<Integer>> left = levelOrder(root.left);
        List<List<Integer>> right = levelOrder(root.right);
        
        if (left.size()==0&&right.size()==0)
            return ret;
        else if (left.size()==0&&right.size()!=0)
            ret.addAll(right);
        else if (left.size()!=0&&right.size()==0)
            ret.addAll(left);
        else {        
            
            int i = 0;

            //merge
            while(i<left.size()) {
                if(i<right.size())
                    left.get(i).addAll(right.get(i));
                i++;
            }
            ret.addAll(left);
            while(i<right.size()) {
                ret.add(right.get(i));
                i++;
            }
        }
        
        return ret;
        
    }*/
}
