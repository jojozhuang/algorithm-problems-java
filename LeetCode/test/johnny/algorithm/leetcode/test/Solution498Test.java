package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution498;

public class Solution498Test {

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
        System.out.println("findDiagonalOrder");
        Solution498 instance = new Solution498();

        int[][] matrix1 = new int[][]{
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        assertArrayEquals(new int[] {1,2,4,7,5,3,6,8,9}, instance.findDiagonalOrder(matrix1));
    }

}
