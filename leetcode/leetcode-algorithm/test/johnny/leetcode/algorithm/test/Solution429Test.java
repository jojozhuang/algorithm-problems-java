package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution429;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution429Test extends JunitBase {

    @Test
    public void testLevelOrder() {
        System.out.println("levelOrder");
        Solution429 instance = new Solution429();
        
        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1, instance.levelOrder(null));

        Solution429.Node root2 = instance.deserialize("1,0");
        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {{1}});
        assertEquals(expect2, instance.levelOrder(root2));

        Solution429.Node root3 = instance.deserialize("1,1,4,0");
        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][] {{1},{4}});
        assertEquals(expect3, instance.levelOrder(root3));

        Solution429.Node root4 = instance.deserialize("1,2,2,0,3,0");
        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][] {{1},{2,3}});
        assertEquals(expect4, instance.levelOrder(root4));

        Solution429.Node root5 = instance.deserialize("1,3,3,2,5,0,6,0,2,0,4,0");
        List<List<Integer>> expect5 = ListUtil.buildList2(new Integer[][] {{1},{3,2,4},{5,6}});
        assertEquals(expect5, instance.levelOrder(root5));
    }
}
