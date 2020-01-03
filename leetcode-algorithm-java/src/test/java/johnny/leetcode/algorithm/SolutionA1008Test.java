package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.SolutionA1008;
import johnny.algorithm.common.TreeNode;

public class SolutionA1008Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("bstFromPreorder");
        SolutionA1008 instance = new SolutionA1008();

        TreeNode expect1 = TreeNode.createInstance("8,5,10,1,7,null,12");
        TreeNode result1 = instance.bstFromPreorder(new int[] {8,5,1,7,10,12});
        assertEquals(true, TreeNode.isSame(expect1, result1));
        
        TreeNode expect2 = TreeNode.createInstance("4,2,#");
        TreeNode result2 = instance.bstFromPreorder(new int[] {4,2});
        assertEquals(true, TreeNode.isSame(expect2, result2));
    }
}
