package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution102Test extends JunitBase {

    @Test
    public void testLevelOrder() {
        System.out.println("levelOrder");
        Solution102 instance = new Solution102();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1, instance.levelOrder(null));

        TreeNode root2 = new TreeNode(1);
        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {{1}});
        assertEquals(expect2, instance.levelOrder(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2", "#"});
        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][] {{1},{2}});
        assertEquals(expect3, instance.levelOrder(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","3"});
        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][] {{1},{2,3}});
        assertEquals(expect4, instance.levelOrder(root4));

        TreeNode root5 = TreeNode.createInstance(new String[] {"1","#","3","#","5"});
        List<List<Integer>> expect5 = ListUtil.buildList2(new Integer[][] {{1},{3},{5}});
        assertEquals(expect5, instance.levelOrder(root5));

        TreeNode root6 = TreeNode.createInstance(new String[] {"3","9","20","#","#","15","7"});
        List<List<Integer>> expect6 = ListUtil.buildList2(new Integer[][] {{3},{9,20},{15,7}});
        assertEquals(expect6, instance.levelOrder(root6));
    }
}
