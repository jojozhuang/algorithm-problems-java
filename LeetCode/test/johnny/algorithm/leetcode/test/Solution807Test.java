package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution807;

public class Solution807Test {

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
        System.out.println("maxIncreaseKeepingSkyline");
        Solution807 instance = new Solution807();
        int[][] grid1 = new int[][] {{3, 0, 8, 4},{2, 4, 5, 7},{9, 2, 6, 3},{0, 3, 1, 0}};
        int[][] result1 = new int[][] {{8, 4, 8, 7},{7, 4, 7, 7},{9, 4, 8, 7},{3, 3, 3, 3}};
        assertEquals(35, instance.maxIncreaseKeepingSkyline(grid1));
    }

}
