package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import johnny.algorithm.leetcode.Solution216;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution216Test extends JunitBase {

    @Test
    public void testCombinationSum3() {
        System.out.println("combinationSum3");
        Solution216 instance = new Solution216();

        List<List<Integer>> expect1 = new ArrayList<List<Integer>>();
        List<List<Integer>> result1 = instance.combinationSum3(0, 0);
        assertEquals(expect1, result1);

        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][]{{1,2,4}});
        assertEquals(expect2, instance.combinationSum3(3,7));

        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][]{{1,2,6},{1,3,5},{2,3,4}});
        assertEquals(expect3, instance.combinationSum3(3, 9));
    }
}
