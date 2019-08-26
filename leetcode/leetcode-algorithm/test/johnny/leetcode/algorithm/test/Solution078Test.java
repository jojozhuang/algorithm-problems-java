package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution078;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution078Test extends JunitBase {

    @Test
    public void testSubsets() {
        System.out.println("subsets");
        Solution078 instance = new Solution078();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1, instance.subsets(null));

        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][]{{},{1}});
        assertEquals(expect2, instance.subsets(new int[]{1}));

        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][]{{},{1},{1,3},{3}});
        assertEquals(expect3, instance.subsets(new int[]{1,3}));

        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][]{{},{1},{1,3},{1,3,8},{1,8},{3},{3,8},{8}});
        assertEquals(expect4, instance.subsets(new int[]{1,3,8}));
    }
}
