package johnny.leetcode.algorithm;

import johnny.leetcode.algorithm.SolutionA1161;
import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1161Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxLevelSum");
        SolutionA1161 instance = new SolutionA1161();

        assertEquals(2, instance.maxLevelSum(TreeNode.createInstance("1,7,0,7,-8,null,null")));
    }
}
