package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution653;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution653Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findTarget");
        Solution653 instance = new Solution653();

        TreeNode root1 = TreeNode.createInstance(new String[] {"5","3","6","2","4","#","7"});
        assertEquals(true, instance.findTarget(root1, 9));

        TreeNode root2 = TreeNode.createInstance(new String[] {"5","3","6","2","4","#","7"});
        assertEquals(false, instance.findTarget(root2, 28));
    }
}
