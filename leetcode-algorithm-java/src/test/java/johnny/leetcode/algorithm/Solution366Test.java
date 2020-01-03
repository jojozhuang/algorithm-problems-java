package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution366;
import johnny.algorithm.common.ListUtil;
import johnny.algorithm.common.TreeNode;

public class Solution366Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findLeaves");
        Solution366 instance = new Solution366();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","2","3","4","5","#","#"});
        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {{4,5,3},{2},{1}});
        assertEquals(expect1, instance.findLeaves(root1));
    }
}
