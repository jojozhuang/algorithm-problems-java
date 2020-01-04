package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1022Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("sumRootToLeaf");
        SolutionA1022 instance = new SolutionA1022();

        //TreeNode root2 = TreeNode.createInstance("1,1,0,0,1,0,1");
        //assertEquals(22, instance.sumRootToLeaf(root2));
        
        TreeNode root1 = TreeNode.createInstance("1,0,1,0,1,0,1");
        assertEquals(22, instance.sumRootToLeaf(root1));
    }
}
