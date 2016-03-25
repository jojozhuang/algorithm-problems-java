/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;
import leetcode.common.TreeNode;
import java.util.*;
/**
 * Binary Tree Paths.
 * Given a binary tree, return all root-to-leaf paths.
 * 
 * For example, given the following binary tree:
 * 
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 * All root-to-leaf paths are:
 * 
 * ["1->2->5", "1->3"]
 * 
 * @author Johnny
 */
public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList();
        if (root == null) {
            return result;
        }
        
        List<String> left = binaryTreePaths(root.left);
        List<String> right = binaryTreePaths(root.right);
        
        if (left.size() == 0 && right.size() == 0) {
            result.add(String.valueOf(root.val));
        } else {
            String path = "";
            for(String item: left) {
                path = String.valueOf(root.val) + "->";
                path = path + item;
                result.add(path);
            }
            for(String item: right) {
                path = String.valueOf(root.val) + "->";
                path = path + item;
                result.add(path);
            }
        }       
        
        return result;
    }    
}
