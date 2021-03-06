package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution404Test extends JunitBase {

    @Test
    public void testSumOfLeftLeaves() {
        System.out.println("sumOfLeftLeaves");
        Solution404 instance = new Solution404();

        TreeNode r1 = new TreeNode(1);
        assertEquals(0, instance.sumOfLeftLeaves(r1));

        TreeNode r2 = TreeNode.createInstance(new String[] {"3","9", "20"});
        assertEquals(9, instance.sumOfLeftLeaves(r2));

        TreeNode r3 = TreeNode.createInstance(new String[] {"3","9", "20", "#","#","15","7"});
        assertEquals(24, instance.sumOfLeftLeaves(r3));
    }
}
