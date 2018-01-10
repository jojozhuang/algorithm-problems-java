package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution379;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution379Test {
    
    public Solution379Test() {
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
     * Test of get method, of class Solution379.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Solution379 instance = new Solution379(3);

        assertEquals(0, instance.get());
        assertEquals(1, instance.get());
        assertEquals(2, instance.get());
        assertEquals(-1, instance.get());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of check method, of class Solution379.
     */
    @Test
    public void testCheck() {
        System.out.println("check");
        Solution379 instance = new Solution379(3);
        
        assertEquals(true, instance.check(0));
        assertEquals(true, instance.check(1));
        assertEquals(true, instance.check(2));
        assertEquals(false, instance.check(3));

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of release method, of class Solution379.
     */
    @Test
    public void testRelease() {
        System.out.println("release");

        Solution379 instance = new Solution379(3);
        assertEquals(0, instance.get());
        assertEquals(1, instance.get());
        assertEquals(2, instance.get());
        assertEquals(-1, instance.get());
        assertEquals(false, instance.check(0));
        instance.release(0);
        assertEquals(true, instance.check(0));
        assertEquals(0, instance.get());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
