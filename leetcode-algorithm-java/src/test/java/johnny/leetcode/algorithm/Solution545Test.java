package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

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
