package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution129;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution129Test extends JunitBase {

    @Test
    public void testSumNumbers() {
        System.out.println("sumNumbers");
        Solution129 instance = new Solution129();

        assertEquals(0, instance.sumNumbers(null));
        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2", "#"});
        assertEquals(12, instance.sumNumbers(root2));
        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2", "3"});
        assertEquals(25, instance.sumNumbers(root3));
        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2", "3", "#","#","#","5"});
        assertEquals(147, instance.sumNumbers(root4));
        TreeNode root5 = TreeNode.createInstance(new String[] {"1","2", "3", "#","#","4","5"});
        assertEquals(281, instance.sumNumbers(root5));
    }
}
