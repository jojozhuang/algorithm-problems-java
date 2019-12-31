package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution046;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution046Test extends JunitBase {

    @Test
    public void testPermute() {
        System.out.println("permute");
        Solution046 instance = new Solution046();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1, instance.permute(null));

        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {{1}});
        assertEquals(expect2, instance.permute(new int[]{1}));

        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][] {{1,3},{3,1}});
        assertEquals(expect3, instance.permute(new int[]{1,3}));

        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][] {{1,3},{3,1}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect4, instance.permute(new int[]{1,3})));

        List<List<Integer>> expect5 = ListUtil.buildList2(new Integer[][] {{1,2,3},{1,3,2},{2,1,3},{2,3,1},{3,1,2},{3,2,1}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect5, instance.permute(new int[]{1,2,3})));
    }
}
