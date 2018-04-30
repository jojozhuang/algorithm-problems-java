package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution269;

public class Solution269Test {

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
        System.out.println("alienOrder");
        Solution269 instance = new Solution269();

        assertEquals("wertf", instance.alienOrder(new String[] {"wrt","wrf","er","ett","rftt"}));
        assertEquals("zx", instance.alienOrder(new String[] {"z","x"}));
        assertEquals("", instance.alienOrder(new String[] {"z","x","z"}));
    }
}
