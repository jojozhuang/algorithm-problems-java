package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution124;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution124Test extends JunitBase {

    @Test
    public void testMaxPathSum() {
        System.out.println("maxPathSum");
        Solution124 instance = new Solution124();

        TreeNode root1 = new TreeNode(1);
        assertEquals(1, instance.maxPathSum(root1));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","#"});
        assertEquals(3, instance.maxPathSum(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","3"});
        assertEquals(6, instance.maxPathSum(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","-1","3"});
        assertEquals(4, instance.maxPathSum(root4));
    }
}
