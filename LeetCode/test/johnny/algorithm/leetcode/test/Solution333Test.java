package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution333;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution333Test extends JunitBase {

    @Test
    public void testLargestBSTSubtree() {
        System.out.println("largestBSTSubtree");
        Solution333 instance = new Solution333();

        assertEquals(0, instance.largestBSTSubtree(null));

        TreeNode root2 = TreeNode.createInstance(new String[]{"10","5","15","1","8","#","7"});
        assertEquals(3, instance.largestBSTSubtree(root2));
    }
}
