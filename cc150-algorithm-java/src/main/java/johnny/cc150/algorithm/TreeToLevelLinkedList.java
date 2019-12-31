package johnny.cc150.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import johnny.cc150.algorithm.common.TreeNode;

/**
 * cc150: 4.4
 * Given a binary search tree, design an algorithm which creates a linked list 
 * of all the nodes at each depth (eg, if you have a tree with depth D, you’ll 
 * have D linked lists)
 * 
 * @author Johnny
 */
public class TreeToLevelLinkedList {
    public List<LinkedList<TreeNode>> convertTreeToList(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        List<LinkedList<TreeNode>> res = new ArrayList<LinkedList<TreeNode>>();
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        list.add(root);
        res.add(list);
        int level = 0;
        while(true) {
            list = new LinkedList<TreeNode>();
            for (int i = 0; i < res.get(level).size(); i++) {
                TreeNode node = (TreeNode)res.get(level).get(i); 
                if (node != null) {
                    if(node.left != null) {
                        list.add(node.left);
                    }
                    if(node.right!= null) {
                        list.add(node.right);
                    } 
                }
            }
            if (list.size() > 0) {
                res.add(list); 
            } else {
                break; 
            }
            level++;
        }
     
        return res;
    }
}
