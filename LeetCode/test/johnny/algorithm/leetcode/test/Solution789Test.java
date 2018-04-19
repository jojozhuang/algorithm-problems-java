package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution789;

public class Solution789Test {

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
        Solution789 instance = new Solution789();

        assertEquals(true, instance.escapeGhosts(new int[][] {{1, 0}, {0, 3}}, new int[] {0, 1}));
        assertEquals(false, instance.escapeGhosts(new int[][] {{1, 0}}, new int[] {2, 0}));
        assertEquals(false, instance.escapeGhosts(new int[][] {{2,0}}, new int[] {1, 0}));
    }

}
