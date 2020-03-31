package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Solution536Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("str2tree");
        Solution536 instance = new Solution536();

        TreeNode expect1 = TreeNode.createInstance("4,2,6,3,1,5,#");
        assertTrue(TreeNode.isSame(expect1, instance.str2tree("4(2(3)(1))(6(5))")));

        TreeNode expect2 = TreeNode.createInstance("-4,2,6,3,1,5,7");
        assertTrue(TreeNode.isSame(expect2, instance.str2tree("-4(2(3)(1))(6(5)(7))")));
    }
}
