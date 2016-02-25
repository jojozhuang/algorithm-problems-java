/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.StringTokenizer;
import leetcode.common.TreeNode;

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
    public String serialize(TreeNode root) {
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
   
    public TreeNode deserialize(String data) {
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
