package johnny.leetcode.algorithm;

import johnny.algorithm.common.Interval;
import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution057Test extends JunitBase {

    @Test
    public void testInsert() {
        System.out.println("insert");
        Solution057 instance = new Solution057();

        assertEquals(null, instance.insert(null, null));

        List<Interval> inervals2 = Interval.buildList(new int[][] {{1,3},{6,9}});
        List<Interval> result2 = instance.insert(inervals2, new Interval(2,5));
        List<Interval> expect2 = Interval.buildList(new int[][] {{1,5},{6,9}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));

        List<Interval> inervals3 = Interval.buildList(new int[][] {{1,2},{3,5},{6,7},{8,10},{12,16}});
        List<Interval> result3 = instance.insert(inervals3, new Interval(4,9));
        List<Interval> expect3 = Interval.buildList(new int[][] {{1,2},{3,10},{12,16}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, result3));

        List<Interval> inervals4 = Interval.buildList(new int[][] {});
        List<Interval> result4 = instance.insert(inervals4, new Interval(5,7));
        List<Interval> expect4 = Interval.buildList(new int[][] {{5, 7}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect4, result4));
    }
}
