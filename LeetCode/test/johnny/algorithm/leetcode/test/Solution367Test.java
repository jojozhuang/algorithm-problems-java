package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution367;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution367Test {
    
    public Solution367Test() {
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
     * Test of isPerfectSquare method, of class Solution367.
     */
    @Test
    public void testIsPerfectSquare() {
        System.out.println("isPerfectSquare");
        Solution367 instance = new Solution367();

        assertEquals(true, instance.isPerfectSquare(0));
        assertEquals(true, instance.isPerfectSquare(1));
        assertEquals(false, instance.isPerfectSquare(2));
        assertEquals(false, instance.isPerfectSquare(3));
        assertEquals(true, instance.isPerfectSquare(4));
        assertEquals(false, instance.isPerfectSquare(6));
        assertEquals(true, instance.isPerfectSquare(9));
        assertEquals(false, instance.isPerfectSquare(10));
        assertEquals(true, instance.isPerfectSquare(100));
        assertEquals(true, instance.isPerfectSquare(808201));
    }
}
