package johnny.leetcode.algorithm;

import johnny.algorithm.common.Interval;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution436Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findRightInterval");
        Solution436 instance = new Solution436();

        Interval[] intervals1 = Interval.buildArray(new int[][] { {1,2} });
        assertArrayEquals(new int[] {-1}, instance.findRightInterval(intervals1));

        Interval[] intervals2 = Interval.buildArray(new int[][] { {3,4}, {2,3}, {1,2} });
        assertArrayEquals(new int[] {-1, 0, 1}, instance.findRightInterval(intervals2));

        Interval[] intervals3 = Interval.buildArray(new int[][] { {1,4}, {2,3}, {3,4} });
        assertArrayEquals(new int[] {-1, 2, -1}, instance.findRightInterval(intervals3));

        Interval[] intervals4 = Interval.buildArray(new int[][] { {4,5}, {2,3}, {1,2} });
        assertArrayEquals(new int[] {-1, 0, 1}, instance.findRightInterval(intervals4));
    }
}
