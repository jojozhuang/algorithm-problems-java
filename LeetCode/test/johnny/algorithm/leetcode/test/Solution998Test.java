package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution998;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution998Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("insertIntoMaxTree");
        Solution998 instance = new Solution998();

        TreeNode expect1 = TreeNode.createInstance("5,4,null,1,3,null,null,2,null");
        TreeNode root1 = TreeNode.createInstance("4,1,3,null,null,2,null");
        TreeNode result1 = instance.insertIntoMaxTree(root1, 5);
        assertTrue(TreeNode.isSame(expect1, result1));

        TreeNode expect2 = TreeNode.createInstance("5,2,4,null,1,null,3");
        TreeNode root2 = TreeNode.createInstance("5,2,4,null,1");
        TreeNode result2 = instance.insertIntoMaxTree(root2, 3);
        assertTrue(TreeNode.isSame(expect2, result2));

        TreeNode expect3 = TreeNode.createInstance("5,2,4,null,1,3,null");
        TreeNode root3 = TreeNode.createInstance("5,2,3,null,1");
        TreeNode result3 = instance.insertIntoMaxTree(root3, 4);
        assertTrue(TreeNode.isSame(expect3, result3));
}
}
