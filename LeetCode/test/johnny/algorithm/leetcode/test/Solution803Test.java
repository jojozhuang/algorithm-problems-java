package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution803;

public class Solution803Test {

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
        Solution803 instance = new Solution803();

        int[][] grid1 = new int[][] {{1,0,0,0},{1,1,1,0}};
        int[][] hits1 = new int[][] {{1,0}};
        int[] result1 = new int[] {2};
        assertArrayEquals(result1, instance.hitBricks(grid1, hits1));

        int[][] grid2 = new int[][] {{1,0,0,0},{1,1,0,0}};
        int[][] hits2 = new int[][] {{1,1},{1,0}};
        int[] result2 = new int[] {0,0};
        assertArrayEquals(result2, instance.hitBricks(grid2, hits2));
    }

}
