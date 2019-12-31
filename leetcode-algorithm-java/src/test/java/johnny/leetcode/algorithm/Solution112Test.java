package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution112;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution112Test extends JunitBase {

    @Test
    public void testHasPathSum() {
        System.out.println("hasPathSum");
        Solution112 instance = new Solution112();

        assertEquals(false, instance.hasPathSum(null, 0));

        TreeNode root1 = new TreeNode(1);
        assertEquals(false, instance.hasPathSum(root1, 2));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","#"});
        assertEquals(true, instance.hasPathSum(root2, 3));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","2"});
        assertEquals(false, instance.hasPathSum(root3, 4));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","2","#","#","#","3"});
        assertEquals(true, instance.hasPathSum(root4, 6));

        TreeNode root5 = TreeNode.createInstance(new String[] {"1","2","2","#","#","#","3","#","4"});
        assertEquals(true, instance.hasPathSum(root5, 10));

        TreeNode root6 = TreeNode.createInstance(new String[] {"-2","#","-3"});
        assertEquals(true, instance.hasPathSum(root6, -5));
    }
}
