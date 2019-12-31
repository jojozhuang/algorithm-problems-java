package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution120;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution120Test extends JunitBase {

    @Test
    public void testMinimumTotal() {
        System.out.println("minimumTotal");
        Solution120 instance = new Solution120();

        assertEquals(0, instance.minimumTotal(null));

        List<List<Integer>> triangle1 = ListUtil.buildList2(new Integer[][]{{1}});
        assertEquals(1, instance.minimumTotal(triangle1));

        List<List<Integer>> triangle2 = ListUtil.buildList2(new Integer[][]{{1},{2,3}});
        assertEquals(3, instance.minimumTotal(triangle2));

        List<List<Integer>> triangle3 = ListUtil.buildList2(new Integer[][]{{2},{3,4},{6,5,7},{4,1,8,3}});
        assertEquals(11, instance.minimumTotal(triangle3));
    }
}
