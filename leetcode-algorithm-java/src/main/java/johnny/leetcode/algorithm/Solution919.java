package johnny.leetcode.algorithm;

import java.util.LinkedList;
import java.util.Queue;

import johnny.algorithm.common.TreeNode;

/**
 * 919. Complete Binary Tree Inserter

A complete binary tree is a binary tree in which every level, except possibly the last, is completely filled, and all nodes are as far left as possible.

Write a data structure CBTInserter that is initialized with a complete binary tree and supports the following operations:

CBTInserter(TreeNode root) initializes the data structure on a given tree with head node root;
CBTInserter.insert(int v) will insert a TreeNode into the tree with value node.val = v so that the tree remains complete, and returns the value of the parent of the inserted TreeNode;
CBTInserter.get_root() will return the head node of the tree.
 

Example 1:

Input: inputs = ["CBTInserter","insert","get_root"], inputs = [[[1]],[2],[]]
Output: [null,1,[1,2]]
Example 2:

Input: inputs = ["CBTInserter","insert","insert","get_root"], inputs = [[[1,2,3,4,5,6]],[7],[8],[]]
Output: [null,3,4,[1,2,3,4,5,6,7,8]]
 

Note:

The initial given tree is complete and contains between 1 and 1000 nodes.
CBTInserter.insert is called at most 10000 times per test case.
Every value of a given or inserted node is between 0 and 5000.
 
 * @author Johnny
 */
public class Solution919 {
    Queue<TreeNode> queue = new LinkedList<>();
    TreeNode root = null;
    public Solution919(TreeNode root) {
        this.root = root;
        find(root);
    }
    
    public int insert(int v) {
        int res = 0;
        TreeNode node = new TreeNode(v);
        if (queue.isEmpty()) {
            this.root = node;
        } else {
            TreeNode first = queue.peek();
            res = first.val;
            if (first.left == null) {
                first.left = node;
            } else {
                first.right = node;
                queue.poll();
            }
        }
        queue.offer(node);
        return res;
    }
    
    public TreeNode get_root() {
        return this.root;
    }
    
    private void find(TreeNode root) {
        Queue<TreeNode> level = new LinkedList<>();
        level.offer(root);
        while (!level.isEmpty()) {
            int size = level.size();
            while (size-- > 0) {
                TreeNode node = level.poll();
                if (node.left == null || node.right == null) {
                    queue.offer(node);
                }
                if (node.left != null) {
                    level.offer(node.left);
                }
                if (node.right != null) {
                    level.offer(node.right);
                }
            }
        }
    }
    /*
    private TreeNode root;
    private Queue<TreeNode> queue;
    
    public Solution919(TreeNode root) {
        this.root = root;
        queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.peek();
            if (node.left != null && node.right != null) {
                queue.poll();
                queue.offer(node.left);
                queue.offer(node.right);
            } else {
                break;
            }
        }
    }
    
    public int insert(int v) {
        TreeNode node = queue.peek();
        if (node.left == null) {
            node.left = new TreeNode(v);
        } else {
            node.right = new TreeNode(v);
            queue.poll();
            queue.offer(node.left);
            queue.offer(node.right);
        }
        return node.val;
    }
    
    public TreeNode get_root() {
        return root;
    }*/
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(v);
 * TreeNode param_2 = obj.get_root();
 */
