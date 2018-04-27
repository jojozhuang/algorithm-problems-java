package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution547;

public class Solution547Test {

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
        System.out.println("findCircleNum");
        Solution547 instance = new Solution547();

        assertEquals(2, instance.findCircleNum(new int[][] {{1,1,0},{1,1,0},{0,0,1}}));
        assertEquals(1, instance.findCircleNum(new int[][] {{1,1,0},{1,1,1},{0,1,1}}));
    }

}
