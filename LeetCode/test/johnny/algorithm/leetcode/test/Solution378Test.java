package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution378;

public class Solution378Test {

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
        System.out.println("kthSmallest");
        Solution378 instance = new Solution378();

        int[][] matrix1 = new int[][] {
            { 1,  5,  9},
            {10, 11, 13},
            {12, 13, 15}
        };
        assertEquals(13, instance.kthSmallest(matrix1, 8));
    }

}
