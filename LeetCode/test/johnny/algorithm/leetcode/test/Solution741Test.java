package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution741;

public class Solution741Test {

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
        System.out.println("cherryPickup");
        Solution741 instance = new Solution741();

        int[][] grid1 = {
                    {0, 1, -1},
                    {1, 0, -1},
                    {1, 1,  1}
                };
        assertEquals(5, instance.cherryPickup(grid1));
    }

}
