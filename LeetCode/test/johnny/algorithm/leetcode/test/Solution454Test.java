package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution454;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution454Test {

    public Solution454Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of minMoves method, of class Solution453.
     */
    @Test
    public void test() {
        System.out.println("fourSumCount");
        Solution454 instance = new Solution454();

        assertEquals(2, instance.fourSumCount(new int[] {1,2,}, new int[] {-2,-1}, new int[] {-1,2}, new int[] {0, 2}));
    }

}
