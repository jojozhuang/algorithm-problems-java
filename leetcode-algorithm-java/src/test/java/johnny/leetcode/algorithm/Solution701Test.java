package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution701;
import johnny.algorithm.common.TreeNode;

public class Solution701Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("insertIntoBST");
        Solution701 instance = new Solution701();

        TreeNode root1 = TreeNode.createInstance("4,2,7,1,3,null,null");
        TreeNode expect1 = TreeNode.createInstance("4,2,7,1,3,5,null");
        TreeNode result1 = instance.insertIntoBST(root1, 5);
        assertTrue(TreeNode.isSame(expect1, result1));
    }
}
