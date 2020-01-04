package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Solution700Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("searchBST");
        Solution700 instance = new Solution700();

        TreeNode root1 = TreeNode.createInstance("4,2,7,1,3,null,null");
        TreeNode expect1 = TreeNode.createInstance("2,1,3");
        TreeNode result1 = instance.searchBST(root1, 2);
        assertTrue(TreeNode.isSame(expect1, result1));
    }
}
