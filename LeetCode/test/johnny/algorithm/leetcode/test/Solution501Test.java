package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution501;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution501Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findMode");
        Solution501 instance = new Solution501();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","#","2","2","#"});
        assertArrayEquals(new int[] {2}, instance.findMode(root1));
    }
}
