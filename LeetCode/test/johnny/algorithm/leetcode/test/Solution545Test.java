package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution545;
import johnny.algorithm.leetcode.common.ListUtil;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution545Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("boundaryOfBinaryTree");
        Solution545 instance = new Solution545();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","#","2","3","4"});
        List<Integer> expect1 = ListUtil.buildList(new Integer[] {1, 3, 4, 2});
        assertEquals(expect1, instance.boundaryOfBinaryTree(root1));
    }
}
