package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution694;

public class Solution694Test {

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
        System.out.println("numDistinctIslands");
        Solution694 instance = new Solution694();

        int[][] grid1 = new int[][] {
            {1,1,0,0,0},
            {1,1,0,0,0},
            {0,0,0,1,1},
            {0,0,0,1,1}
        };
        assertEquals(1, instance.numDistinctIslands(grid1));
        
        int[][] grid2 = new int[][] {
            {1,1,0,1,1},
            {1,0,0,0,0},
            {0,0,0,0,1},
            {1,1,0,1,1}
        };
        assertEquals(3, instance.numDistinctIslands(grid2));
    }

}
