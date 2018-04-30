package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution486;

public class Solution486Test {

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
        System.out.println("PredictTheWinner");
        Solution486 instance = new Solution486();

        assertEquals(false, instance.PredictTheWinner(new int[] {1, 5, 2}));
        assertEquals(true, instance.PredictTheWinner(new int[] {1, 5, 233, 7}));
    }
}
