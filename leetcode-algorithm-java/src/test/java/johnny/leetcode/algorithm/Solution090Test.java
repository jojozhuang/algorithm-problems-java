package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution090Test extends JunitBase {

    @Test
    public void testSubsetsWithDup() {
        System.out.println("subsetsWithDup");
        Solution090 instance = new Solution090();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1, instance.subsetsWithDup(null));

        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {{},{1}});
        assertEquals(expect2, instance.subsetsWithDup(new int[]{1}));

        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][] {{},{1},{1,3},{3}});
        assertEquals(expect3, instance.subsetsWithDup(new int[]{1,3}));

        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][] {{},{1},{1,2},{1,2,2},{2},{2,2}});
        assertEquals(expect4, instance.subsetsWithDup(new int[]{1,2,2}));
    }
}
