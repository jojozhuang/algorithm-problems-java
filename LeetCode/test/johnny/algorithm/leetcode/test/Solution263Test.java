package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution263;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution263Test {
    
    public Solution263Test() {
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
     * Test of isUgly method, of class Solution263.
     */
    @Test
    public void testIsUgly() {
        System.out.println("isUgly");
        Solution263 instance = new Solution263();

        assertEquals(false, instance.isUgly(0));
        assertEquals(true, instance.isUgly(1));
        assertEquals(true, instance.isUgly(2));
        assertEquals(true, instance.isUgly(3));
        assertEquals(true, instance.isUgly(5));
        assertEquals(false, instance.isUgly(7));
        assertEquals(true, instance.isUgly(8));
        assertEquals(true, instance.isUgly(9));
        assertEquals(true, instance.isUgly(10));
        assertEquals(false, instance.isUgly(11));
    }
}
