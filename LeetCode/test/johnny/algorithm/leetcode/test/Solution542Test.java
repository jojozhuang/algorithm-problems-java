package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution542;

public class Solution542Test {

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
        System.out.println("updateMatrix");
        Solution542 instance = new Solution542();

        int[][] matrix1 = new int[][] {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        int[][] result1 = new int[][] {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        assertArrayEquals(result1, instance.updateMatrix(matrix1));
        
        int[][] matrix2 = new int[][] {
            {0, 0, 0},
            {0, 1, 0},
            {1, 1, 1}
        };
        int[][] result2 = new int[][] {
            {0, 0, 0},
            {0, 1, 0},
            {1, 2, 1}
        };
        assertArrayEquals(result2, instance.updateMatrix(matrix2));
    }
}
