/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.common;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Johnny
 */
 public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }
     
    public static TreeNode createInstance2(String[] arr) {  
        List<String> serial = Arrays.asList(arr);
        if(serial == null || serial.size() == 0) {
            return null;         
        }
        
        Queue<String> queueString = new LinkedList<>(serial);
        Queue<TreeNode> queueNode = new LinkedList<>();
        
        TreeNode root = new TreeNode(Integer.parseInt(serial.get(0)));
        queueNode.offer(root);
        
        String str = "";
        queueString.remove(); // remove the first one, it is root;
        while(!queueString.isEmpty()) {
            TreeNode node = queueNode.poll();
            if (node != null) {
                str = queueString.poll();
                if (!str.equals("#")) {
                    node.left = new TreeNode(Integer.parseInt(str));
                    queueNode.add(node.left);
                }
                str = queueString.poll();
                if (!str.equals("#")) {
                    node.right = new TreeNode(Integer.parseInt(str));
                    queueNode.add(node.right);
                }                
            }
        }
        
        return root;
    }
    
    public static TreeNode createInstance(String[] arr) {
        if(arr == null || arr.length == 0) {
            return null;         
        }
        
        Queue<TreeNode> queueNode = new LinkedList<>();
        
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        queueNode.offer(root);
        
        int index = 0;
        while (index < arr.length - 1) {
            TreeNode node = queueNode.poll();
            if (node != null) {
                String str = arr[++index];
                if (!str.equals("#")) {
                    node.left = new TreeNode(Integer.parseInt(str));
                    queueNode.add(node.left);
                }
                str = arr[++index];
                if (!str.equals("#")) {
                    node.right = new TreeNode(Integer.parseInt(str));
                    queueNode.add(node.right);
                }             
            }
        }
        
        return root;
    }
    
    
    public static boolean isSame(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null && t2 != null) {
            return false;
        }
        if (t1 != null && t2 == null) {
            return false;
        }
        if (t1.val != t2.val) {
            return false;
        }
        
        return isSame(t1.left, t2.left) && isSame(t1.right, t2.right);
    }
 }
