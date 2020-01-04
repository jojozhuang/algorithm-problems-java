package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution103Test extends JunitBase {

    @Test
    public void testZigzagLevelOrder() {
        System.out.println("zigzagLevelOrder");
        Solution103 instance = new Solution103();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1, instance.zigzagLevelOrder(null));

        TreeNode root2 = new TreeNode(1);
        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][]{{1}});
        assertEquals(expect2, instance.zigzagLevelOrder(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","#"});
        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][]{{1},{2}});
        assertEquals(expect3, instance.zigzagLevelOrder(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","3"});
        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][]{{1},{3, 2}});
        assertEquals(expect4, instance.zigzagLevelOrder(root4));

        TreeNode root5 = TreeNode.createInstance(new String[] {"1","#","3","#","5"});
        List<List<Integer>> expect5 = ListUtil.buildList2(new Integer[][]{{1},{3},{5}});
        assertEquals(expect5, instance.zigzagLevelOrder(root5));

        TreeNode root6 = TreeNode.createInstance(new String[] {"3","9","20","#","#","15","7"});
        List<List<Integer>> expect6 = ListUtil.buildList2(new Integer[][]{{3},{20,9},{15,7}});
        assertEquals(expect6, instance.zigzagLevelOrder(root6));

        TreeNode root7 = TreeNode.createInstance(new String[] {"1","2","3","4","#","#","5"});
        List<List<Integer>> expect7 = ListUtil.buildList2(new Integer[][]{{1},{3,2},{4,5}});
        assertEquals(expect7, instance.zigzagLevelOrder(root7));
    }
}
