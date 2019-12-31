package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution337;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution337Test extends JunitBase {

    @Test
    public void testRob() {
        System.out.println("rob");
        Solution337 instance = new Solution337();

        assertEquals(0, instance.rob(null));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2", "#"});
        assertEquals(2, instance.rob(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2", "3"});
        assertEquals(5, instance.rob(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"3","2", "3","#","3","#","1"});
        assertEquals(7, instance.rob(root4));

        TreeNode root5 = TreeNode.createInstance(new String[] {"3","4", "5","1","3","#","1"});
        assertEquals(9, instance.rob(root5));
    }
}
