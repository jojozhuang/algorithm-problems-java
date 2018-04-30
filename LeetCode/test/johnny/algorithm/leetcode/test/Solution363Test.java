package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution363;

public class Solution363Test {

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
        System.out.println("maxSumSubmatrix");
        Solution363 instance = new Solution363();

        int[][] matrix1 = new int[][] {
            {1,  0, 1},
            {0, -2, 3}
        };
        assertEquals(2, instance.maxSumSubmatrix(matrix1, 2));
    }
}
