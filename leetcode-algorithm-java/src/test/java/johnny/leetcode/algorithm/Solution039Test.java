package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution039;
import johnny.algorithm.common.ListUtil;

public class Solution039Test extends JunitBase {

    @Test
    public void testCombinationSum() {
        System.out.println("combinationSum");
        Solution039 instance = new Solution039();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1,  instance.combinationSum(null, 0));

        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {{2,2,3},{7}});
        assertEquals(expect2, instance.combinationSum(new int[]{2,3,6,7}, 7));

        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][] {{3,4,4},{3,8},{4,7}});
        assertEquals(expect3, instance.combinationSum(new int[]{8,7,4,3}, 11));
    }
}
