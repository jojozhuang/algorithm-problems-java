/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
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
