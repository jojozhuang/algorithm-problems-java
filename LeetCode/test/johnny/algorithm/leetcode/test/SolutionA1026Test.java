package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.SolutionA1026;
import johnny.algorithm.leetcode.common.TreeNode;

public class SolutionA1026Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxAncestorDiff");
        SolutionA1026 instance = new SolutionA1026();
        
        TreeNode root1 = TreeNode.createInstance("8,3,10,1,6,null,14,null,null,4,7,13,null");
        assertEquals(7, instance.maxAncestorDiff(root1));
    }
}
