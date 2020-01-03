package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution104;
import johnny.algorithm.common.TreeNode;

public class Solution104Test extends JunitBase {

    @Test
    public void testMaxDepth() {
        System.out.println("maxDepth");
        Solution104 instance = new Solution104();

        assertEquals(0, instance.maxDepth(null));

        TreeNode root1 = new TreeNode(1);
        assertEquals(1, instance.maxDepth(root1));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","#"});
        assertEquals(2, instance.maxDepth(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","2"});
        assertEquals(2, instance.maxDepth(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","2","#","#","3","#"});
        assertEquals(3, instance.maxDepth(root4));

        TreeNode root5 = TreeNode.createInstance(new String[] {"1","2","2","#","#","#","3","#","4"});
        assertEquals(4, instance.maxDepth(root5));
    }
}
