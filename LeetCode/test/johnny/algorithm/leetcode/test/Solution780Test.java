package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution780;

public class Solution780Test {

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
        System.out.println("reachingPoints");
        Solution780 instance = new Solution780();

        assertEquals(true, instance.reachingPoints(1,1,3,5));
        assertEquals(false, instance.reachingPoints(1,1,2,2));
        assertEquals(true, instance.reachingPoints(1,1,1,1));
    }

}
