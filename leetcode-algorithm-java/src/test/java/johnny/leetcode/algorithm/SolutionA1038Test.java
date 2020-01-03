package johnny.leetcode.algorithm;

import johnny.leetcode.algorithm.SolutionA1038;
import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionA1038Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("bstToGst");
        SolutionA1038 instance = new SolutionA1038();

        TreeNode root1 = TreeNode.createInstance("4,1,6,0,2,5,7,null,null,null,3,null,null,null,8");
        TreeNode expect1 = TreeNode.createInstance("30,36,21,36,35,26,15,null,null,null,33,null,null,null,8");
        assertTrue(TreeNode.isSame(expect1, instance.bstToGst(root1)));
    }
}
