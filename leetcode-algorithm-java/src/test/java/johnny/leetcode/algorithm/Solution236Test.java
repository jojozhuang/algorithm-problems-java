package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution236Test extends JunitBase {

    @Test
    public void testLowestCommonAncestor() {
        System.out.println("lowestCommonAncestor");
        Solution236 instance = new Solution236();

        assertEquals(null, instance.lowestCommonAncestor(null, null, null));

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","2","#"});
        assertEquals(root1, instance.lowestCommonAncestor(root1, root1, root1.left));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","3"});
        assertEquals(root2, instance.lowestCommonAncestor(root2, root2.left, root2.right));

        TreeNode root3 = TreeNode.createInstance(new String[] {"3","5","1","6","2","0","8","#","#","7","4"});
        assertEquals(root3, instance.lowestCommonAncestor(root3, root3.left, root3.right));
        assertEquals(root3.left, instance.lowestCommonAncestor(root3, root3.left, root3.left.right));
        assertEquals(root3, instance.lowestCommonAncestor(root3, root3.left.right.right, root3.right.right));
        assertEquals(root3.left.right, instance.lowestCommonAncestor(root3, root3.left.right.left, root3.left.right.right));
        assertEquals(root3.left, instance.lowestCommonAncestor(root3, root3.left.left, root3.left.right.right));
    }
}
