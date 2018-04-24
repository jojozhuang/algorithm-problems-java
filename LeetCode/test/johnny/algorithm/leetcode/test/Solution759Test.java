package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution759;
import johnny.algorithm.leetcode.common.Interval;

public class Solution759Test {

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
        System.out.println("employeeFreeTime");
        Solution759 instance = new Solution759();

        List<List<Interval>> schedule1 = Interval.buildList(new int[][][] {{{1,2},{5,6}},{{1,3}},{{4,10}}});
        List<Interval> expect1 = Interval.buildList(new int[][] {{3,4}});
        assertEquals(expect1, instance.employeeFreeTime(schedule1));

        List<List<Interval>> schedule2 = Interval.buildList(new int[][][] {{{1,3},{6,7}},{{2,4}},{{2,5},{9,12}}});
        List<Interval> expect2 = Interval.buildList(new int[][] {{5,6},{7,9}});
        assertEquals(expect2, instance.employeeFreeTime(schedule2));
}

}
