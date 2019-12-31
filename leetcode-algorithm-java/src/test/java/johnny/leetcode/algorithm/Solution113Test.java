package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution113;
import johnny.leetcode.algorithm.common.ListUtil;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution113Test extends JunitBase {

    @Test
    public void testPathSum() {
        System.out.println("pathSum");
        Solution113 instance = new Solution113();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1,  instance.pathSum(null, 0));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","#","#"});
        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect2, instance.pathSum(root2, 2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","#"});
        List<List<Integer>> result3 = ListUtil.buildList2(new Integer[][] {{1,2}});
        assertEquals(result3, instance.pathSum(root3, 3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","2"});
        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect4, instance.pathSum(root4, 4));

        TreeNode root5 = TreeNode.createInstance(new String[] {"1","2","2","#","#","3","#"});
        List<List<Integer>> expect5 = ListUtil.buildList2(new Integer[][] {{1,2,3}});
        assertEquals(expect5, instance.pathSum(root5, 6));

        TreeNode root6 = TreeNode.createInstance(new String[] {"1","2","2","#","#","#","3","#","4"});
        List<List<Integer>> expect6 = ListUtil.buildList2(new Integer[][] {{1,2,3,4}});
        assertEquals(expect6, instance.pathSum(root6, 10));

        TreeNode root7 = TreeNode.createInstance(new String[] {"-2","#","-3"});
        List<List<Integer>> expect7 = ListUtil.buildList2(new Integer[][] {{-2,-3}});
        assertEquals(expect7, instance.pathSum(root7, -5));

        TreeNode root8 = TreeNode.createInstance(new String[]{"5","4","8","11","#","13","4","7","2","#","#","5","1","#","#","#","#","#","#","#","#"});
        List<List<Integer>> expect8 = ListUtil.buildList2(new Integer[][] {{5,4,11,2},{5,8,4,5}});
        assertEquals(expect8, instance.pathSum(root8, 22));

        TreeNode root9 = TreeNode.createInstance(new String[]{"1","-2","-3","1","3","-2","#","-1","#","#","#","#","#"});
        List<List<Integer>> expect9 = ListUtil.buildList2(new Integer[][] {{1,-2,1,-1}});
        assertEquals(expect9, instance.pathSum(root9, -1));
    }
}
