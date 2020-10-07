package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1609Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minimumOneBitOperations");
        SolutionA1609 instance = new SolutionA1609();

        TreeNode root1 = TreeNode.createInstance("1,10,4,3,null,7,9,12,8,6,null,null,2");
        assertEquals(true, instance.isEvenOddTree(root1));

        TreeNode root2 = TreeNode.createInstance("5,4,2,3,3,7");
        assertEquals(false, instance.isEvenOddTree(root2));

        TreeNode root3 = TreeNode.createInstance("5,9,1,3,5,7");
        assertEquals(false, instance.isEvenOddTree(root3));

        TreeNode root4 = TreeNode.createInstance("1");
        assertEquals(true, instance.isEvenOddTree(root4));

        TreeNode root5 = TreeNode.createInstance("11,8,6,1,3,9,11,30,20,18,16,12,10,4,2,17");
        assertEquals(true, instance.isEvenOddTree(root5));
    }
}
