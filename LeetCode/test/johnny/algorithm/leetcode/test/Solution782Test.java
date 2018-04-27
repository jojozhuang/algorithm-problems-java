package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution782;

public class Solution782Test {

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
        System.out.println("movesToChessboard");
        Solution782 instance = new Solution782();

        int[][] board1 = new int[][] {{0,1,1,0},{0,1,1,0},{1,0,0,1},{1,0,0,1}};
        assertEquals(2, instance.movesToChessboard(board1));
    }

}
