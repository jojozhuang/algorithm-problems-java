package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution111;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution111Test extends JunitBase {

    @Test
    public void testMinDepth() {
        System.out.println("minDepth");
        Solution111 instance = new Solution111();

        assertEquals(0, instance.minDepth(null));

        TreeNode root1 = new TreeNode(1);
        assertEquals(1, instance.minDepth(root1));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","#"});
        assertEquals(2, instance.minDepth(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","2"});
        assertEquals(2, instance.minDepth(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","2","#","#","3","#"});
        assertEquals(2, instance.minDepth(root4));

        TreeNode root5 = TreeNode.createInstance(new String[] {"1","2","2","#","#","#","3","#","4"});
        assertEquals(2, instance.minDepth(root5));
    }
}
