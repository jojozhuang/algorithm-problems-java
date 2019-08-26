package johnny.leetcode.others;

import java.util.HashMap;

import johnny.leetcode.others.common.TreeNode;

/**
 *在一棵二叉树上玩一个游戏，对手先选择树上一个节点，现在该由你来选择一个点。然后同时开始，从选择的那个点开始，
向外扩张，只可以去占领其相邻的点(parent and children)，然后从占领的点再去扩张，依次类推，
但如果相邻的点已经被对方占了，就没法去占领了。谁最终占有的点最多谁获胜。
input是树root和对手选中的node,返回你是否能胜利

followup 如果你先选择点，你该选择哪个点能胜利？

比如下面这个树，如果你的对手选中了8，你选6就能胜利。而如果你选9，对手下一步可以由8扩张到6，对手就赢了。

       1
    2       3
  4   5       6
7           8   9
          10      11
            12  13
          14      15
 *  
 * @author Johnny
 */
public class AAAOccupyTree {
    TreeNode parent;
    public TreeNode occupyTreeNode(TreeNode root, TreeNode node) {
        int total = count(root, node);
        int left = count(node.left);
        int right = count(node.right);
        if (total > left + right) {
            return parent;
        } else if (left > total + right) {
            return node.left;
        } else if (right > total + left) {
            return node.right;
        }
        
        return null;
    }
    
    private int count(TreeNode root, TreeNode node) {
        if (root == null) {
            return 0;
        }
        
        if (node == null) {
            return count(root);
        }
        
        if (root.val == node.val) {
            return 0;
        }
        
        if (root.left != null && root.left.val == node.val) {
            parent = root;
        } else if (root.right != null && root.right.val == node.val) {
            parent = root;
        }
        return count(root.left, node) + count(root.right, node) + 1;
    }
    
    private int count(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return count(root.left) + count(root.right) + 1;
    }
}
