package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution539;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution539Test {

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
        System.out.println("findMinDifference");
        Solution539 instance = new Solution539();

        List<String> timePoints1 = ListUtil.buildList(new String[] {"23:59","00:00"});
        assertEquals(1, instance.findMinDifference(timePoints1));
    }

}
