package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution951;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution951Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("flipEquiv");
        Solution951 instance = new Solution951();

        TreeNode root11 = TreeNode.createInstance("1,2,3,4,5,6,null,null,null,7,8");
        TreeNode root12 = TreeNode.createInstance("1,3,2,null,6,4,5,null,null,null,null,8,7");
        assertEquals(true, instance.flipEquiv(root11, root12));
    }
}
