package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution865;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution865Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("subtreeWithAllDeepest");
        Solution865 instance = new Solution865();

        TreeNode root1 = TreeNode.createInstance("3,5,1,6,2,0,8,null,null,7,4");
        TreeNode result1 = instance.subtreeWithAllDeepest(root1);
        TreeNode expect1 = TreeNode.createInstance("2,7,4");
        assertTrue(TreeNode.isSame(expect1, result1));
    }
}
