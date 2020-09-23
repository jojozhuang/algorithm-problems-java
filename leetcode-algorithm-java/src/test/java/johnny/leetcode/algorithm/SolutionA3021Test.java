package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA3021Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findLeastNumOfUniqueInts");
        SolutionA3021 instance = new SolutionA3021();

        TreeNode root1 = TreeNode.createInstance("1,2,3,null,4");
        assertEquals(1, instance.countPairs(root1, 3));

        TreeNode root2 = TreeNode.createInstance("1,2,3,4,5,6,7");
        assertEquals(2, instance.countPairs(root2, 3));

        TreeNode root3 = TreeNode.createInstance("7,1,4,6,null,5,3,null,null,null,null,null,2");
        assertEquals(1, instance.countPairs(root3, 3));

        TreeNode root4 = TreeNode.createInstance("100");
        assertEquals(0, instance.countPairs(root4, 1));

        TreeNode root5 = TreeNode.createInstance("1,1,1");
        assertEquals(1, instance.countPairs(root5, 12));
    }
}
