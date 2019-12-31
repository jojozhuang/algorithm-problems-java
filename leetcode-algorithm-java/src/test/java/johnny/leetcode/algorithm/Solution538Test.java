package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution538;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution538Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("convertBST");
        Solution538 instance = new Solution538();

        TreeNode root1 = TreeNode.createInstance(new String[] {"5","2","13"});
        TreeNode expect1 = TreeNode.createInstance(new String[] {"18","20","13"});
        assertTrue(TreeNode.isSame(expect1, instance.convertBST(root1)));
    }
}
