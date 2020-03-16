package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionA1382Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("balanceBST");
        SolutionA1382 instance = new SolutionA1382();

        TreeNode root1 = TreeNode.createInstance("1,null,2,null,3,null,4,null,null");
        TreeNode expect1 = TreeNode.createInstance("2,1,3,null,null,null,4");
        assertTrue(TreeNode.isSame(expect1, instance.balanceBST(root1)));
    }
}
