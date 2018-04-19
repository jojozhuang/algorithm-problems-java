package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution794;

public class Solution794Test {

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
        Solution794 instance = new Solution794();

        assertEquals(false, instance.validTicTacToe(new String[] {"O  ", "   ", "   "}));
        assertEquals(false, instance.validTicTacToe(new String[] {"XOX", " X ", "   "}));
        assertEquals(false, instance.validTicTacToe(new String[] {"XXX", "   ", "OOO"}));
        assertEquals(true, instance.validTicTacToe(new String[] {"XOX", "O O", "XOX"}));
    }

}
