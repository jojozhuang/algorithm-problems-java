package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution987;
import johnny.algorithm.leetcode.common.ListUtil;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution987Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("verticalTraversal");
        Solution987 instance = new Solution987();

        TreeNode root1 = TreeNode.createInstance("3,9,20,null,null,15,7");
        List<List<Integer>> result1 = instance.verticalTraversal(root1);
        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {{9},{3,15},{20},{7}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect1, result1));

        TreeNode root2 = TreeNode.createInstance("1,2,3,4,5,6,7");
        List<List<Integer>> result2 = instance.verticalTraversal(root2);
        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {{4},{2},{1,5,6},{3},{7}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));
    }
}
