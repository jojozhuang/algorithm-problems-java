package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution270;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution270Test extends JunitBase {

    @Test
    public void testClosestValue() {
        System.out.println("closestValue");
        Solution270 instance = new Solution270();

        assertEquals(Integer.MAX_VALUE, instance.closestValue(null, 0.0));

        TreeNode root2 = TreeNode.createInstance(new String[] {"4"});
        assertEquals(4, instance.closestValue(root2, 3));
        assertEquals(4, instance.closestValue(root2, 5));

        TreeNode root3 = TreeNode.createInstance(new String[] {"4","1","7"});
        assertEquals(7, instance.closestValue(root3, 6));
        assertEquals(1, instance.closestValue(root3, 2));
        assertEquals(4, instance.closestValue(root3, 3));
    }
}
