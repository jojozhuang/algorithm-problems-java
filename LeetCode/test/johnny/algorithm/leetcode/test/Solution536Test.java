package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution536;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution536Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("str2tree");
        Solution536 instance = new Solution536();

        TreeNode expect1 = TreeNode.createInstance(new String[] {"4","2","6","3","1","5","#"});
        assertTrue(TreeNode.isSame(expect1, instance.str2tree("4(2(3)(1))(6(5))")));
    }
}
