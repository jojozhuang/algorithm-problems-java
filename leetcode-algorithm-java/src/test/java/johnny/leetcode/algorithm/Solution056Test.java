package johnny.leetcode.algorithm;

import johnny.algorithm.common.Interval;
import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution056Test extends JunitBase {

    @Test
    public void testMerge() {
        System.out.println("merge");
        Solution056 instance = new Solution056();

        assertEquals(new ArrayList<Interval>(), instance.merge(null));

        List<Interval> inervals2 = Interval.buildList(new int[][] {{1,3},{2,6},{8,10},{15,18}});
        List<Interval> result2 = instance.merge(inervals2);
        List<Interval> expect2 = Interval.buildList(new int[][] {{1,6},{8,10},{15,18}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));
        
        List<Interval> inervals3 = Interval.buildList(new int[][] {{1,4},{4,5}});
        List<Interval> result3 = instance.merge(inervals3);
        List<Interval> expect3 = Interval.buildList(new int[][] {{1,5}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, result3));
    }
}
