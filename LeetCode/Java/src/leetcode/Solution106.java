/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import leetcode.common.TreeNode;

/**
 * Construct Binary Tree from Inorder and Postorder Traversal.
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 * 
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * 
 * @author Johnny
 */
public class Solution106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || inorder.length == 0 ||
           postorder == null || postorder.length == 0) {
            return null;
        }
        
        int root = postorder[postorder.length-1];
        TreeNode rootNode = new TreeNode(root);
        
        // Find sub array for inorder
        ArrayList<Integer> leftInOrder = new ArrayList<Integer>();
        ArrayList<Integer> rightInOrder = new ArrayList<Integer>();
        boolean pivot = false;
        for(int ix = 0; ix < inorder.length; ix++) {
            if (inorder[ix] == root) {
                pivot = true;
                continue;
            }            
            if(!pivot){
                leftInOrder.add(inorder[ix]);
            }
            else {
                rightInOrder.add(inorder[ix]);
            }
        }
        
        // Find sub array for postorder
        int[] leftPostOrder = new int[leftInOrder.size()];
        int[] rightPostOrder = new int[rightInOrder.size()];
        for(int ix = 0; ix < postorder.length - 1; ix++) {
            if (ix < leftInOrder.size()) {
                leftPostOrder[ix] = postorder[ix];
            }
            else {
                rightPostOrder[ix - leftPostOrder.length] = postorder[ix];
            }
        }
        
        rootNode.left = buildTree(convert(leftInOrder), leftPostOrder);
        rootNode.right = buildTree(convert(rightInOrder), rightPostOrder);
        
        return rootNode;        
    }
    
    private int[] convert(ArrayList<Integer> list) {
        int s = list.size();
        int[] intArray = new int[s];
        for (int i = 0; i < s; i++) {
            intArray[i] = list.get(i).intValue();
        }
        return intArray;
    }
}
