package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution107Test extends JunitBase {

    @Test
    public void testLevelOrderBottom() {
        System.out.println("levelOrderBottom");
        Solution107 instance = new Solution107();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1, instance.levelOrderBottom(null));

        TreeNode root2 = new TreeNode(1);
        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {{1}});
        assertEquals(expect2, instance.levelOrderBottom(root2));

        TreeNode root3 = TreeNode.createInstance(new String[]{"1","2","#"});
        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][] {{2},{1}});
        assertEquals(expect3, instance.levelOrderBottom(root3));

        TreeNode root4 = TreeNode.createInstance(new String[]{"1","2","3"});
        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][] {{2,3},{1}});
        assertEquals(expect4, instance.levelOrderBottom(root4));

        TreeNode root5 = TreeNode.createInstance(new String[]{"1","#","3","#","5"});
        List<List<Integer>> expect5 = ListUtil.buildList2(new Integer[][] {{5},{3},{1}});
        assertEquals(expect5, instance.levelOrderBottom(root5));

        TreeNode root6 = TreeNode.createInstance(new String[]{"3","9","20","#","#","15","7"});
        List<List<Integer>> expect6 = ListUtil.buildList2(new Integer[][] {{15,7},{9,20},{3}});
        assertEquals(expect6, instance.levelOrderBottom(root6));

        TreeNode root7 = TreeNode.createInstance(new String[]{"1","2","3","4","#","#","5"});
        List<List<Integer>> expect7 = ListUtil.buildList2(new Integer[][] {{4,5},{2,3},{1}});
        assertEquals(expect7, instance.levelOrderBottom(root7));

        TreeNode root8 = TreeNode.createInstance(new String[]{"0","-3","-2","-9","-8","#","#","2","#","#","-5","5","#"});
        List<List<Integer>> expect8 = ListUtil.buildList2(new Integer[][] {{5},{2,-5},{-9,-8},{-3,-2},{0}});
        assertEquals(expect8, instance.levelOrderBottom(root8));
    }
}
