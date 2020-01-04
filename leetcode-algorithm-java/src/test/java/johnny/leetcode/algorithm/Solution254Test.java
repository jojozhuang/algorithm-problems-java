package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution254Test extends JunitBase {

    @Test
    public void testGetFactors() {
        System.out.println("getFactors");
        Solution254 instance = new Solution254();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1, instance.getFactors(0));

        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {});
        List<List<Integer>> result2 = instance.getFactors(1);
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));

        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][] {});
        List<List<Integer>> result3 = instance.getFactors(37);
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, result3));

        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][] {{2,2,3},{2,6},{3,4}});
        List<List<Integer>> result4 = instance.getFactors(12);
        assertTrue(ListUtil.equalsIgnoreOrder(expect4, result4));

        List<List<Integer>> expect5 = ListUtil.buildList2(new Integer[][] {{2,16},{2,2,8},{2,2,2,4},{2,2,2,2,2},{2,4,4},{4,8}});
        List<List<Integer>> result5 = instance.getFactors(32);
        assertTrue(ListUtil.equalsIgnoreOrder(expect5, result5));
    }
}
