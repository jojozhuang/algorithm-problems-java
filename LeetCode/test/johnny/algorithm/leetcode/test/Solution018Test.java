package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution018;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution018Test extends JunitBase {

    @Test
    public void testFourSum() {
        System.out.println("fourSum");
        Solution018 instance = new Solution018();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1, instance.fourSum(null, 0));

        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][]{{-2,-1,1,2},{-2,0,0,2},{-1,0,0,1}});
        assertEquals(expect2, instance.fourSum(new int[]{1,0,-1,0,-2,2}, 0));
    }
}
