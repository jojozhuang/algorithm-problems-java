package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution202;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution202Test {
    
    public Solution202Test() {
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
     * Test of isHappy method, of class Solution202.
     */
    @Test
    public void testIsHappy() {
        System.out.println("isHappy");
        Solution202 instance = new Solution202();

        assertEquals(false, instance.isHappy(0));
        assertEquals(true, instance.isHappy(7));
        assertEquals(true, instance.isHappy(10));
        assertEquals(true, instance.isHappy(19));
        assertEquals(false, instance.isHappy(33));
        assertEquals(false, instance.isHappy(11));
    }
}
