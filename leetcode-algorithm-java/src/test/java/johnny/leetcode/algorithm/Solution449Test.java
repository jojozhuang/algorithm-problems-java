package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Solution449Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("serialize");
        Solution449 instance = new Solution449();

        TreeNode root1 = TreeNode.createInstance("5,3,6,2,4,#,7");
        assertTrue(TreeNode.isSame(root1, instance.deserialize(instance.serialize(root1))));

        TreeNode root2 = TreeNode.createInstance("5,3,6,#,#,7,8");
        String serial2 = instance.serialize(root2);
        TreeNode expect2 = instance.deserialize(serial2);
        assertTrue(TreeNode.isSame(expect2, root2));
    }
}
