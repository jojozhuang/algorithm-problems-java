package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution530;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution530Test extends JunitBase {

    @Test
    public void testGetMinimumDifference() {
        System.out.println("getMinimumDifference");
        Solution530 instance = new Solution530();

        TreeNode r1 = TreeNode.createInstance(new String[] {"3"});
        assertEquals(Integer.MAX_VALUE, instance.getMinimumDifference(r1));

        TreeNode r2 = TreeNode.createInstance(new String[] {"9","3","20"});
        assertEquals(6, instance.getMinimumDifference(r2));

        TreeNode r3 = TreeNode.createInstance(new String[] {"1","#", "3", "2","#"});
        assertEquals(1, instance.getMinimumDifference(r3));

        TreeNode r4 = TreeNode.createInstance("543,384,652,null,445,null,699");
        assertEquals(47, instance.getMinimumDifference(r4));
    }
}
