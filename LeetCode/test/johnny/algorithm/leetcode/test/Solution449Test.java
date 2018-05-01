package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution449;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution449Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("serialize");
        Solution449 instance = new Solution449();

        TreeNode root1 = TreeNode.createInstance(new String[] {"5","3","6","2","4","#","7"});
        assertTrue(TreeNode.isSame(root1, instance.deserialize(instance.serialize(root1))));
    }
}
