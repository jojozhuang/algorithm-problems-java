package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution687Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("longestUnivaluePath");
        Solution687 instance = new Solution687();

        TreeNode root1 = TreeNode.createInstance(new String[] {"5", "4", "5", "1", "1", "#", "5"});
        assertEquals(2, instance.longestUnivaluePath(root1));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1", "4", "5", "4", "4", "#", "5"});
        assertEquals(2, instance.longestUnivaluePath(root2));
    }
}
