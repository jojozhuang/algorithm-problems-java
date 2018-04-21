package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution685;

public class Solution685Test {

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
        System.out.println("findRedundantDirectedConnection");
        Solution685 instance = new Solution685();

        assertArrayEquals(new int[] {2,3}, instance.findRedundantDirectedConnection(new int[][] {{1,2}, {1,3}, {2,3}}));
        assertArrayEquals(new int[] {4,1}, instance.findRedundantDirectedConnection(new int[][] {{1,2}, {2,3}, {3,4}, {4,1}, {1,5}}));
    }

}
