package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution671;
import johnny.algorithm.common.TreeNode;

public class Solution671Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findSecondMinimumValue");
        Solution671 instance = new Solution671();

        TreeNode root1 = TreeNode.createInstance(new String[] {"2","2","5","#","#", "5","7"});
        assertEquals(5, instance.findSecondMinimumValue(root1));

        TreeNode root2 = TreeNode.createInstance(new String[] {"2","2","2"});
        assertEquals(-1, instance.findSecondMinimumValue(root2));
    }
}
