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
 * Construct Binary Tree from Preorder and Inorder Traversal.
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * 
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * 
 * @author Johnny
 */
public class Solution105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || preorder.length == 0 || inorder == null ||
                inorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[0]);
        
        if (preorder.length == 1) { //no left and no right
            return root;
        }
        
        int indexRoot = findIndex(inorder, root.val);
        
        int[] leftIn = new int[0];
        int[] rightIn = new int[0];
        int[] leftPre = new int[0];
        int[] rightPre = new int[0];
            
        if (indexRoot == 0) { // no left
            rightIn = Arrays.copyOfRange(inorder, 1, inorder.length);            
            rightPre = Arrays.copyOfRange(preorder, 1, preorder.length);            
        }
        else if (indexRoot < preorder.length - 1) { // left + right
            leftIn = Arrays.copyOfRange(inorder, 0, indexRoot);
            rightIn = Arrays.copyOfRange(inorder, indexRoot + 1, inorder.length);
            leftPre = Arrays.copyOfRange(preorder, 1, leftIn.length + 1);
            rightPre = Arrays.copyOfRange(preorder, leftIn.length + 1, preorder.length);            
        } else { // indexRoot == inorder.length - 1, no right
            leftIn = Arrays.copyOfRange(inorder, 0, indexRoot);
            leftPre = Arrays.copyOfRange(preorder, 1, leftIn.length + 1);
        }
        root.left = buildTree(leftPre, leftIn);
        root.right = buildTree(rightPre, rightIn); 
        
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
    
    
    
    
    private TreeNode buildTree2(int[] preorder, int[] inorder) {
        if(preorder == null || preorder.length == 0 ||
           inorder == null || inorder.length == 0) {
            return null;
        }
        
        int root = preorder[0];
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
        int[] leftPreOrder = new int[leftInOrder.size()];
        int[] rightPreOrder = new int[rightInOrder.size()];
        for(int ix = 1; ix < preorder.length; ix++) {
            if (ix <= leftInOrder.size()) {
                leftPreOrder[ix - 1] = preorder[ix];
            }
            else {
                rightPreOrder[ix - leftPreOrder.length - 1] = preorder[ix];
            }
        }
        
        rootNode.left = buildTree(leftPreOrder, convert(leftInOrder));
        rootNode.right = buildTree(rightPreOrder, convert(rightInOrder));
        
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
