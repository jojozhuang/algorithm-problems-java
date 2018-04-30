package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution419;

public class Solution419Test {

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
        System.out.println("countBattleships");
        Solution419 instance = new Solution419();

        char[][] board1 = new char[][] {
            {'X','.','.','X'},
            {'.','.','.','X'},
            {'.','.','.','X'}
        };
        assertEquals(2, instance.countBattleships(board1));
        
        char[][] board2 = new char[][] {
            {'.','.','.','X'},
            {'X','X','X','X'},
            {'.','.','.','X'}
        };
        assertEquals(2, instance.countBattleships(board2));
    }
}
