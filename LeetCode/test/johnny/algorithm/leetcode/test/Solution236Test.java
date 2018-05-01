package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution236;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution236Test extends JunitBase {

    @Test
    public void testLowestCommonAncestor() {
        System.out.println("lowestCommonAncestor");
        Solution236 instance = new Solution236();

        assertEquals(null, instance.lowestCommonAncestor(null, null, null));

        TreeNode root1 = new TreeNode(1);
        TreeNode p1 = new TreeNode(2);
        root1.left = p1;
        assertEquals(root1, instance.lowestCommonAncestor(root1, root1, p1));

        TreeNode root2 = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);
        root2.left = p2;
        TreeNode q2 = new TreeNode(3);
        root2.right = q2;
        assertEquals(root2, instance.lowestCommonAncestor(root2, p2, q2));

        TreeNode root3 = new TreeNode(1);
        TreeNode p3 = new TreeNode(2);
        root3.left = p3;
        TreeNode q3 = new TreeNode(3);
        root3.right = q3;
        assertEquals(root3, instance.lowestCommonAncestor(root3, p3, q3));
    }
}
