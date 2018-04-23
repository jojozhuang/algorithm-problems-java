package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution455;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution455Test {

    public Solution455Test() {
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
        System.out.println("findContentChildren");
        Solution455 instance = new Solution455();

        assertEquals(1, instance.findContentChildren(new int[] {1,2,3}, new int[] {1,1}));
        assertEquals(2, instance.findContentChildren(new int[] {1,2}, new int[] {1,2,3}));
    }

}
