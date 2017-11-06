/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import johnny.algorithm.leetcode.common.TreeNode;

/**
 * Serialize and Deserialize Binary Tree.
 * 
 * Serialization is the process of converting a data structure or object into a 
 * sequence of bits so that it can be stored in a file or memory buffer, or 
 * transmitted across a network connection link to be reconstructed later in the 
 * same or another computer environment.
 * 
 * Design an algorithm to serialize and deserialize a binary tree. There is no 
 * restriction on how your serialization/deserialization algorithm should work. 
 * You just need to ensure that a binary tree can be serialized to a string and 
 * this string can be deserialized to the original tree structure.
 * 
 * For example, you may serialize the following tree
 * 
 *     1
 *    / \
 *   2   3
 *      / \
 *     4   5
 * as "[1,2,3,null,null,4,5]", just the same as how LeetCode OJ serializes a 
 * binary tree. You do not necessarily need to follow this format, so please be 
 * creative and come up with different approaches yourself.
 * Note: Do not use class member/global/static variables to store states. 
 * Your serialize and deserialize algorithms should be stateless.
 * 
 * @author Johnny
 */
public class Solution297 {
    // bfs + queue
    // Encodes a tree to a single string.
    // Sample: 1,2,3,#,#,4,5
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        StringBuilder sb = new StringBuilder();
        sb.append(root.val + ",");
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                    sb.append(node.left.val + ",");
                } else {
                    sb.append("#,");
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    sb.append(node.right.val + ",");
                } else {
                    sb.append("#,");
                }
                
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) {
            return null;
        }
        
        String[] values = data.split(",");
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        queue.offer(root);
        
        for (int i = 1; i < values.length; i = i + 2) {
            TreeNode node = queue.poll();
            if (!values[i].equals("#")) {
                node.left = new TreeNode(Integer.parseInt(values[i]));
                queue.offer(node.left);
            }
            if (!values[i + 1].equals("#")) {
                node.right = new TreeNode(Integer.parseInt(values[i + 1]));
                queue.offer(node.right);
            }
        }
        
        return root;
    }
    
    // recursion
    public String serialize2(TreeNode root) {
        if (root == null) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return sb.substring(0, sb.length() - 1);        
    }   
    
    private void helper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#,");
        } else {        
            sb.append(root.val).append(",");
            helper(root.left, sb);
            helper(root.right, sb);
        }
    }
   
    public TreeNode deserialize2(String data) {
        if (data == null || data.length() == 0) {
            return null;
        }
        
        StringTokenizer st = new StringTokenizer(data, ",");
        return deseriaHelper(st);
    }
    private TreeNode deseriaHelper(StringTokenizer st) {
        if (!st.hasMoreTokens()) {
            return null;
        }
        
        String val = st.nextToken();
        if (val.equals("#")) {
            return null;
        }
        
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = deseriaHelper(st);
        root.right = deseriaHelper(st);
        
        return root;
    }
}
