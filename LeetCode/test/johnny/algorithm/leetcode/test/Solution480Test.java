package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution480;

public class Solution480Test {

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
        System.out.println("medianSlidingWindow");
        Solution480 instance = new Solution480();

        assertArrayEquals(new double[] {1,-1,-1,3,5,6}, instance.medianSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3), 0.0);
    }
}
