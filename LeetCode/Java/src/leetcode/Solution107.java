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
import java.util.Stack;

/**
 * Binary Tree Level Order Traversal II.
 * Given a binary tree, return the bottom-up level order traversal of its 
 * nodes' values. (ie, from left to right, level by level from leaf to root).
 * 
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 
 * return its bottom-up level order traversal as:
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 * 
 * @author Johnny
 */
public class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if (root == null) {
            return result;
        }
        
        Stack<List<Integer>> stack = new Stack<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int size = queue.size();
            
            for(int ix = 0; ix < size; ix++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            stack.push(level);
        }
        
        while(!stack.isEmpty()) {
            result.add(stack.pop());
        }
        
        return result;
    }
    /*
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ret = new ArrayList();        
        
        if (root==null)
            return ret;
        
        if (root.left==null&&root.right==null) {
            List<Integer> list = new ArrayList();
            list.add(root.val);
            ret.add(list);

            return ret;
        }
        else if (root.left==null&&root.right!=null)
            ret.addAll(levelOrderBottom(root.right));
        else if (root.left!=null&&root.right==null)
            ret.addAll(levelOrderBottom(root.left));
        else {
            
            List<List<Integer>> left = levelOrderBottom(root.left);
            List<List<Integer>> right = levelOrderBottom(root.right);
            
            int i = 0;

            //merge
            if(left.size()>right.size()) {
                i = right.size() - 1;
                while(i>=0) {                    
                    left.get(left.size()-right.size()+i).addAll(right.get(i));
                    i--;                    
                }
                ret.addAll(left);
            }
            else if(left.size()<right.size()) {
                i = left.size() - 1;
                while(i>=0) {                    
                    left.get(i).addAll(right.get(right.size()-left.size()+i));                   
                    right.set(right.size()-left.size()+i, left.get(i));
                    i--;
                }
                ret.addAll(right);
            }
            else {
                i = left.size() - 1;
                while(i>=0) {                    
                    left.get(i).addAll(right.get(i));
                    i--;                    
                }
                ret.addAll(left);
            }
        }        
        
        List<Integer> list = new ArrayList();
        list.add(root.val);
        ret.add(list);
        
        return ret;
    }*/
}
