package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution285Test extends JunitBase {

    @Test
    public void testInorderSuccessor() {
        System.out.println("inorderSuccessor");
        Solution285 instance = new Solution285();

        assertEquals(null, instance.inorderSuccessor(null, null));

        TreeNode root2 = TreeNode.createInstance(new String[] {"20","8","22","4","12","#","#","#","#","10","14"});
        TreeNode result2 = instance.inorderSuccessor(root2, root2.left);
        assertEquals(10, result2.val);

        TreeNode root3 = TreeNode.createInstance(new String[] {"20","8","22","4","12","#","#","#","#","10","14"});
        TreeNode result3 = instance.inorderSuccessor(root3, root3.left.right.right);
        assertEquals(20, result3.val);

        TreeNode root4 = TreeNode.createInstance(new String[] {"20","8","22","4","12","#","#","#","#","10","14"});
        TreeNode result4 = instance.inorderSuccessor(root4, root4.right);
        assertEquals(null, result4);
    }
}
