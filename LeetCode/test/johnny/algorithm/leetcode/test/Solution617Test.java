package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution617;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution617Test extends JunitBase {

    @Test
    public void testMergeTrees() {
        System.out.println("mergeTrees");
        Solution617 instance = new Solution617();

        assertEquals(null, instance.mergeTrees(null, null));

        TreeNode t11 = null;
        TreeNode t12 = TreeNode.createInstance(new String[] {"1"});
        assertTrue(TreeNode.isSame(t12, instance.mergeTrees(t11, t12)));

        TreeNode t21 = TreeNode.createInstance(new String[] {"2"});
        TreeNode t22 = null;
        assertTrue(TreeNode.isSame(t21, instance.mergeTrees(t21, t22)));

        TreeNode t31 = TreeNode.createInstance(new String[] {"1"});
        TreeNode t32 = TreeNode.createInstance(new String[] {"2"});
        TreeNode res3 = TreeNode.createInstance(new String[] {"3"});
        assertTrue(TreeNode.isSame(res3, instance.mergeTrees(t31, t32)));

        TreeNode t41 = TreeNode.createInstance(new String[] {"1","2","3"});
        TreeNode t42 = TreeNode.createInstance(new String[] {"2","#","4"});
        TreeNode res4 = TreeNode.createInstance(new String[] {"3","2","7"});
        assertTrue(TreeNode.isSame(res4, instance.mergeTrees(t41, t42)));

        TreeNode t51 = TreeNode.createInstance(new String[] {"1","3","2","5","#"});
        TreeNode t52 = TreeNode.createInstance(new String[] {"2","1","3","#","4","#","7"});
        TreeNode res5 = TreeNode.createInstance(new String[] {"3","4","5","5","4","#","7"});
        assertTrue(TreeNode.isSame(res5, instance.mergeTrees(t51, t52)));
    }
}
