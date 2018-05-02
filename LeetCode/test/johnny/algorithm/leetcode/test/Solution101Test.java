package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution101;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution101Test extends JunitBase {

    @Test
    public void testIsSymmetric() {
        System.out.println("isSymmetric");
        Solution101 instance = new Solution101();

        assertEquals(true, instance.isSymmetric(null));

        TreeNode root2 = new TreeNode(1);
        assertEquals(true, instance.isSymmetric(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","#"});
        assertEquals(false, instance.isSymmetric(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","3"});
        assertEquals(false, instance.isSymmetric(root4));

        TreeNode root5 = TreeNode.createInstance(new String[] {"1","2","2"});
        assertEquals(true, instance.isSymmetric(root5));

        TreeNode root6 = TreeNode.createInstance(new String[] {"1","2","2","#","#","3","3"});
        assertEquals(false, instance.isSymmetric(root6));

        TreeNode root7 = TreeNode.createInstance(new String[] {"1","2","2","#","3","3","#"});
        assertEquals(true, instance.isSymmetric(root7));
    }
}
