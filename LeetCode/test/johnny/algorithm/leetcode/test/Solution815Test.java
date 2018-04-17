package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution815;

public class Solution815Test {

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
        System.out.println("numBusesToDestination");
        Solution815 instance = new Solution815();
        int[][] routes1 = new int[][] {{1, 2, 7}, {3, 6, 7}};
        assertEquals(2, instance.numBusesToDestination(routes1, 1, 6));
    }

}
