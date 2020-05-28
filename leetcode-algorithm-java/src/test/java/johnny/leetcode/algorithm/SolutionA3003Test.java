package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA3003Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("pseudoPalindromicPaths");
        SolutionA3003 instance = new SolutionA3003();

        TreeNode root1 = TreeNode.createInstance("2,3,1,3,1,null,1");
        assertEquals(2, instance.pseudoPalindromicPaths(root1));

        TreeNode root2 = TreeNode.createInstance("2,1,1,1,3,null,null,null,null,null,1");
        assertEquals(1, instance.pseudoPalindromicPaths(root2));

        TreeNode root3 = TreeNode.createInstance("9");
        assertEquals(1, instance.pseudoPalindromicPaths(root3));

    }
}
