package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution435;
import johnny.algorithm.leetcode.common.Interval;

public class Solution435Test {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        System.out.println("eraseOverlapIntervals");
        Solution435 instance = new Solution435();

        Interval[] intervals1 = Interval.buildArray(new int[][] { {1,2}, {2,3}, {3,4}, {1,3} });
        assertEquals(1, instance.eraseOverlapIntervals(intervals1));

        Interval[] intervals2 = Interval.buildArray(new int[][] { {1,2}, {1,2}, {1,2} });
        assertEquals(2, instance.eraseOverlapIntervals(intervals2));

        Interval[] intervals3 = Interval.buildArray(new int[][] { {1,2}, {2,3} });
        assertEquals(0, instance.eraseOverlapIntervals(intervals3));
    }
}
