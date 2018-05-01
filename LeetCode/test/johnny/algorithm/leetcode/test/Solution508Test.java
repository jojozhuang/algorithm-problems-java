package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution508;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution508Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findFrequentTreeSum");
        Solution508 instance = new Solution508();

        TreeNode root1 = TreeNode.createInstance(new String[] {"5","2","-3"});
        assertArrayEquals(new int[] {2, -3, 4}, instance.findFrequentTreeSum(root1));
    }
}
