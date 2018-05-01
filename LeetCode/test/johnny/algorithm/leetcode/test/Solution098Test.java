package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution098;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution098Test extends JunitBase {

    @Test
    public void testIsValidBST() {
        System.out.println("isValidBST");
        TreeNode root = null;
        Solution098 instance = new Solution098();

        assertEquals(true, instance.isValidBST(null));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","3"});
        assertEquals(false, instance.isValidBST(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","#","2","#","3"});
        assertEquals(true, instance.isValidBST(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"2","1","3"});
        assertEquals(true, instance.isValidBST(root4));

        TreeNode root5 = TreeNode.createInstance(new String[] {"1","#","3","2","#"});
        assertEquals(true, instance.isValidBST(root5));

        TreeNode root6 = TreeNode.createInstance(new String[] {"10","5","15","#","#","6","20"});
        assertEquals(false, instance.isValidBST(root6));

        TreeNode root7 = TreeNode.createInstance(new String[] {"1","1","#"});
        assertEquals(false, instance.isValidBST(root7));

        TreeNode root8 = TreeNode.createInstance(new String[] {Integer.MIN_VALUE + "", "#", Integer.MAX_VALUE + ""});
        assertEquals(true, instance.isValidBST(root8));

        TreeNode root9 = TreeNode.createInstance(new String[] {Integer.MAX_VALUE + "", Integer.MAX_VALUE + "", "#"});
        assertEquals(false, instance.isValidBST(root9));

        TreeNode root10 = TreeNode.createInstance(new String[] {Integer.MIN_VALUE + "", "#", Integer.MIN_VALUE + ""});
        assertEquals(false, instance.isValidBST(root10));
    }
}
