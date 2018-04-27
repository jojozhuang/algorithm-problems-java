package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution407;

public class Solution407Test {

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
        System.out.println("trapRainWater");
        Solution407 instance = new Solution407();

        int[][] heightMap1 = new int[][] {
            {1,4,3,1,3,2},
            {3,2,1,3,2,4},
            {2,3,3,2,3,1}
        };
        assertEquals(4, instance.trapRainWater(heightMap1));
    }

}
