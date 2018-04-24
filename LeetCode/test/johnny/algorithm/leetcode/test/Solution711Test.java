package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution711;

public class Solution711Test {

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
        System.out.println("numDistinctIslands2");
        Solution711 instance = new Solution711();

        int[][] grid1 = new int[][] {
            {1,1,0,0,0},
            {1,0,0,0,0},
            {0,0,0,0,1},
            {0,0,0,1,1}
        };
        assertEquals(1, instance.numDistinctIslands2(grid1));
        
        int[][] grid2 = new int[][] {
            {1,1,1,0,0},
            {1,0,0,0,1},
            {0,1,0,0,1},
            {0,1,1,1,0}
        };
        assertEquals(2, instance.numDistinctIslands2(grid2));
    }

}
