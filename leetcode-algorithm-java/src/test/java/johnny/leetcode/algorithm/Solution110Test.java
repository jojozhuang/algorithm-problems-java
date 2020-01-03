package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution110;
import johnny.algorithm.common.TreeNode;

public class Solution110Test extends JunitBase {

    @Test
    public void testIsBalanced() {
        System.out.println("isBalanced");
        Solution110 instance = new Solution110();

        assertEquals(true, instance.isBalanced(null));

        TreeNode root1 = TreeNode.createInstance(new String[] {"1"});
        assertEquals(true, instance.isBalanced(root1));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","#"});
        assertEquals(true, instance.isBalanced(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","2"});
        assertEquals(true, instance.isBalanced(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","2","#","#","3","#"});
        assertEquals(true, instance.isBalanced(root4));

        TreeNode root5 = TreeNode.createInstance(new String[] {"1","2","2","#","#","#","3","#","4"});
        assertEquals(false, instance.isBalanced(root5));

        TreeNode root6 = TreeNode.createInstance(new String[] {"1","2","2","3","#","#","3","4","#","#","4"});
        assertEquals(false, instance.isBalanced(root6));

        TreeNode root7 = TreeNode.createInstance(new String[] {"1","2","2","3","3","3","3","4","4","4","4","4","4","#","#","5","5","#","#","#","#","#","#","#","#","#","#","#","#"});
        assertEquals(true, instance.isBalanced(root7));
    }
}
