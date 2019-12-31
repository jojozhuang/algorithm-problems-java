package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution563;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution563Test extends JunitBase {

    @Test
    public void testFindTilt() {
        System.out.println("findTilt");
        Solution563 instance = new Solution563();

        TreeNode r1 = TreeNode.createInstance(new String[] {"1"});
        assertEquals(0, instance.findTilt(r1));

        TreeNode r2 = TreeNode.createInstance(new String[] {"1","#", "3"});
        assertEquals(3, instance.findTilt(r2));

        TreeNode r3 = TreeNode.createInstance(new String[] {"1","2", "3"});
        assertEquals(1, instance.findTilt(r3));
    }
}
