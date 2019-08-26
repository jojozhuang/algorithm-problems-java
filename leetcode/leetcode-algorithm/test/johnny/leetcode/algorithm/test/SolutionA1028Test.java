package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.SolutionA1028;
import johnny.leetcode.algorithm.common.TreeNode;

public class SolutionA1028Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("recoverFromPreorder");
        SolutionA1028 instance = new SolutionA1028();
        
        TreeNode expect1 = TreeNode.createInstance("1,2,5,3,4,6,7");
        TreeNode result1 = instance.recoverFromPreorder("1-2--3--4-5--6--7");
        assertTrue(TreeNode.isSame(expect1, result1));
        
        TreeNode expect2 = TreeNode.createInstance("1,2,5,3,#,6,#,4,#,7,#");
        TreeNode result2 = instance.recoverFromPreorder("1-2--3---4-5--6---7");
        assertTrue(TreeNode.isSame(expect2, result2));
        
        TreeNode expect3 = TreeNode.createInstance("1,401,#,349,88,90,#");
        TreeNode result3 = instance.recoverFromPreorder("1-401--349---90--88");
        assertTrue(TreeNode.isSame(expect3, result3));
        
        TreeNode expect4 = TreeNode.createInstance("3");
        TreeNode result4 = instance.recoverFromPreorder("3");
        assertTrue(TreeNode.isSame(expect4, result4));

    }
}
