package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution488;

public class Solution488Test {

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
        System.out.println("findMinStep");
        Solution488 instance = new Solution488();

        assertEquals(-1, instance.findMinStep("WRRBBW", "RB"));
        assertEquals(2, instance.findMinStep("WWRRBBWW", "WRBRW"));
        assertEquals(2, instance.findMinStep("G", "GGGGG"));
        assertEquals(3, instance.findMinStep("RBYYBBRRB", "YRBGB"));
    }
}
