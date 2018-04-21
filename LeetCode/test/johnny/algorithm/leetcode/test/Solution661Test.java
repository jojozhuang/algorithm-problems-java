package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution661;

public class Solution661Test {

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
        System.out.println("imageSmoother");
        Solution661 instance = new Solution661();

        int[][] m1 = new int[][] {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        int[][] result1 = new int[][] {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        assertArrayEquals(result1, instance.imageSmoother(m1));
    }

}
