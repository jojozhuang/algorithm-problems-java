package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution814;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution814Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("pruneTree");
        Solution814 instance = new Solution814();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","#","0","0","1"});
        TreeNode expect1 = TreeNode.createInstance(new String[] {"1","#","0","#","1"});
        assertTrue(TreeNode.isSame(expect1, instance.pruneTree(root1)));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","0","1","0","0","0","1"});
        TreeNode expect2 = TreeNode.createInstance(new String[] {"1","#","1","#","1"});
        assertTrue(TreeNode.isSame(expect2, instance.pruneTree(root2)));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","1","0","1","1","0","1","0","#","#","#","#","#","#","#"});
        TreeNode expect3 = TreeNode.createInstance(new String[] {"1","1","0","1","1","#","1"});
        assertTrue(TreeNode.isSame(expect3, instance.pruneTree(root3)));
    }
}
