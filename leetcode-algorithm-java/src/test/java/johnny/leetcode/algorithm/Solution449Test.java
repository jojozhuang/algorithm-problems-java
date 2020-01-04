package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Solution449Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("serialize");
        Solution449 instance = new Solution449();

        TreeNode root1 = TreeNode.createInstance(new String[] {"5","3","6","2","4","#","7"});
        assertTrue(TreeNode.isSame(root1, instance.deserialize(instance.serialize(root1))));
    }
}
