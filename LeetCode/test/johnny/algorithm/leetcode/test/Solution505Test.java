package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution505;

public class Solution505Test {

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
        System.out.println("shortestDistance");
        Solution505 instance = new Solution505();

        int[][] maze1 = new int[][] { 
            {0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 0, 1, 1},
            {0, 0, 0, 0, 0}
        };
        int[] start1 = new int[] {0,4};
        int[] destination1 = new int[] {4,4};
        assertEquals(12, instance.shortestDistance(maze1,start1,destination1));

        int[][] maze2 = new int[][] { 
            {0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 0, 1, 1},
            {0, 0, 0, 0, 0}
        };
        int[] start2 = new int[] {0,4};
        int[] destination2 = new int[] {3,2};
        assertEquals(-1, instance.shortestDistance(maze2,start2,destination2));
    }

}
