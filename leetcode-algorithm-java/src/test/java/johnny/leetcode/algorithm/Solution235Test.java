package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution235Test extends JunitBase {

    @Test
    public void testLowestCommonAncestor() {
        System.out.println("lowestCommonAncestor");
        Solution235 instance = new Solution235();

        assertEquals(null, instance.lowestCommonAncestor(null, null, null));

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","#","2"});
        assertEquals(root1, instance.lowestCommonAncestor(root1, root1, root1.right));

        TreeNode root2 = TreeNode.createInstance(new String[] {"2","1","3"});
        assertEquals(root2, instance.lowestCommonAncestor(root2, root2.left, root2.right));

        TreeNode root3 = TreeNode.createInstance(new String[] {"6","2","8","0","4","7","9","#","#","3","5"});
        assertEquals(root3, instance.lowestCommonAncestor(root3, root3.left, root3.right));
        assertEquals(root3.left, instance.lowestCommonAncestor(root3, root3.left, root3.left.right));
        assertEquals(root3, instance.lowestCommonAncestor(root3, root3.left.right.right, root3.right.right));
        assertEquals(root3.left.right, instance.lowestCommonAncestor(root3, root3.left.right.left, root3.left.right.right));
        assertEquals(root3.left, instance.lowestCommonAncestor(root3, root3.left.left, root3.left.right.right));
    }
}
