package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import johnny.leetcode.algorithm.Solution315;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution315Test extends JunitBase {

    @Test
    public void testCountSmaller() {
        System.out.println("countSmaller");
        Solution315 instance = new Solution315();

        List<Integer> expect1 = new ArrayList<Integer>();
        List<Integer> result1 = instance.countSmaller(null);
        assertEquals(expect1, result1);

        List<Integer> expect2 = ListUtil.buildList(new Integer[] {2,1,1,0});
        assertEquals(expect2, instance.countSmaller(new int[] {5,2,6,1}));

        List<Integer> expect3 = ListUtil.buildList(new Integer[] {3,2,1,0});
        assertEquals(expect3, instance.countSmaller(new int[] {5,4,3,1}));

        List<Integer> expect4 = ListUtil.buildList(new Integer[] {0,0,0,0});
        assertEquals(expect4, instance.countSmaller(new int[] {1,4,6,7}));

        List<Integer> expect5 = ListUtil.buildList(new Integer[] {0,2,0,0});
        assertEquals(expect5, instance.countSmaller(new int[] {5,6,5,5}));
    }
}
