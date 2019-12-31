package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution077;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution077Test extends JunitBase {

    @Test
    public void testCombine() {
        System.out.println("combine");
        Solution077 instance = new Solution077();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1, instance.combine(0, 0));
        assertEquals(expect1, instance.combine(-1, 0));
        assertEquals(expect1, instance.combine(3, -2));
        assertEquals(expect1, instance.combine(4, 5));

        List<List<Integer>> expect2 =  ListUtil.buildList2(new Integer[][] {{1}});
        assertEquals(expect2, instance.combine(1, 1));

        List<List<Integer>> expect3 =  ListUtil.buildList2(new Integer[][] {{1},{2}});
        assertEquals(expect3, instance.combine(2, 1));

        List<List<Integer>> expect4 =  ListUtil.buildList2(new Integer[][] {{1,2}});
        assertEquals(expect4, instance.combine(2, 2));

        List<List<Integer>> expect5 =  ListUtil.buildList2(new Integer[][] {{1,2},{1,3},{2,3}});
        assertEquals(expect5, instance.combine(3, 2));
        
        List<List<Integer>> expect6 =  ListUtil.buildList2(new Integer[][] {{1,2,3}});
        assertEquals(expect6, instance.combine(3, 3));
    }
}
