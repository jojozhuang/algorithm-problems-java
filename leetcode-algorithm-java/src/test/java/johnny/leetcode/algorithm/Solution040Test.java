package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution040;
import johnny.algorithm.common.ListUtil;

public class Solution040Test extends JunitBase {

    @Test
    public void testCombinationSum2() {
        System.out.println("combinationSum2");
        Solution040 instance = new Solution040();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1,  instance.combinationSum2(null, 0));

        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {{7}});
        assertEquals(expect2, instance.combinationSum2(new int[]{2,3,6,7}, 7));

        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][] {{4,7},{3,8}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, instance.combinationSum2(new int[]{8,7,4,3}, 11)));

        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][] {{1,7},{1,2,5},{2,6},{1,1,6}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect4, instance.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8)));
    }
}
