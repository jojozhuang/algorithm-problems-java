package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution235;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution235Test extends JunitBase {

    @Test
    public void testLowestCommonAncestor() {
        System.out.println("lowestCommonAncestor");
        Solution235 instance = new Solution235();

        assertEquals(null, instance.lowestCommonAncestor(null, null, null));

        TreeNode root1 = new TreeNode(1);
        TreeNode p1 = new TreeNode(2);
        root1.right = p1;
        assertEquals(root1, instance.lowestCommonAncestor(root1, root1, p1));

        TreeNode root2 = new TreeNode(2);
        TreeNode p2 = new TreeNode(1);
        root2.left = p2;
        TreeNode q2 = new TreeNode(3);
        root2.right = q2;
        assertEquals(root2, instance.lowestCommonAncestor(root2, p2, q2));

        TreeNode root3 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2);
        root3.left = n2;
        TreeNode n0 = new TreeNode(0);
        n2.left = n0;
        TreeNode n4 = new TreeNode(4);
        n2.right = n4;
        TreeNode n3 = new TreeNode(3);
        n4.left = n3;
        TreeNode n5 = new TreeNode(5);
        n4.right = n5;
        TreeNode n8 = new TreeNode(8);
        root3.right = n8;
        TreeNode n7 = new TreeNode(7);
        n8.left = n7;
        TreeNode n9 = new TreeNode(9);
        n8.right = n9;
        assertEquals(root3, instance.lowestCommonAncestor(root3, n2, n8));
        assertEquals(n2, instance.lowestCommonAncestor(root3, n2, n4));
        assertEquals(root3, instance.lowestCommonAncestor(root3, n5, n9));
        assertEquals(n4, instance.lowestCommonAncestor(root3, n3, n5));
        assertEquals(n2, instance.lowestCommonAncestor(root3, n0, n5));
    }
}
