package johnny.leetcode.algorithm;

import johnny.algorithm.common.Interval;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution986Test extends JunitBase {

    @Test
    public void testAddNum() {
        System.out.println("intervalIntersection");
        Solution986 instance = new Solution986();

        Interval[] a1 = Interval.buildArray(new int[][] {{0,2},{5,10},{13,23},{24,25}});
        Interval[] b1 = Interval.buildArray(new int[][] {{1,5},{8,12},{15,24},{25,26}});
        Interval[] result1 = instance.intervalIntersection(a1, b1);
        Interval[] expect1 = Interval.buildArray(new int[][] {{1,2},{5,5},{8,10},{15,23},{24,24},{25,25}});
        assertArrayEquals(expect1, result1);
    }
}
