package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution501Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findMode");
        Solution501 instance = new Solution501();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","#","2","2","#"});
        assertArrayEquals(new int[] {2}, instance.findMode(root1));
    }
}
