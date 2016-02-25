/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
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
        if(inorder == null || inorder.length == 0 || postorder == null ||
                postorder.length == 0 || inorder.length != postorder.length) {
            return null;
        }
        
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        
        if (postorder.length == 1) { //no left and no right
            return root;
        }
        
        int indexRoot = findIndex(inorder, root.val);
        
        int[] leftIn = new int[0];
        int[] rightIn = new int[0];
        int[] leftPost = new int[0];
        int[] rightPost = new int[0];
            
        if (indexRoot == 0) { // no left
            rightIn = Arrays.copyOfRange(inorder, 1, inorder.length);            
            rightPost = Arrays.copyOfRange(postorder, 0, postorder.length - 1);            
        }
        else if (indexRoot < postorder.length - 1) { // left + right
            leftIn = Arrays.copyOfRange(inorder, 0, indexRoot);
            rightIn = Arrays.copyOfRange(inorder, indexRoot + 1, inorder.length);
            leftPost = Arrays.copyOfRange(postorder, 0, leftIn.length);
            rightPost = Arrays.copyOfRange(postorder, leftIn.length, postorder.length - 1);            
        } else { // indexRoot == inorder.length - 1, no right
            leftIn = Arrays.copyOfRange(inorder, 0, indexRoot);
            leftPost = Arrays.copyOfRange(postorder, 0, leftIn.length);
        }
        root.left = buildTree(leftIn, leftPost);
        root.right = buildTree(rightIn, rightPost); 
        
        return root;
    }
    
    private int findIndex(int[] order, int val) {
        if (order == null || order.length == 0) {
            return -1;
        }
        
        for(int i = 0; i < order.length; i++) {
            if (order[i] == val) {
                return i;
            }
        }
        
        return -1;
    }
    
    public TreeNode buildTree2(int[] inorder, int[] postorder) {
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
