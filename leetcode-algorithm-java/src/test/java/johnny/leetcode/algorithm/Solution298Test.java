package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution298;
import johnny.algorithm.common.TreeNode;

public class Solution298Test extends JunitBase {

    @Test
    public void testLongestConsecutive() {
        System.out.println("longestConsecutive");
        Solution298 instance = new Solution298();

        assertEquals(0, instance.longestConsecutive(null));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","#","3","2","4","#","#","#","5"});
        assertEquals(3, instance.longestConsecutive(root4));

        TreeNode root3 = TreeNode.createInstance(new String[] {"2","#","3","2","#","1","#"});
        assertEquals(2, instance.longestConsecutive(root3));
    }
}
