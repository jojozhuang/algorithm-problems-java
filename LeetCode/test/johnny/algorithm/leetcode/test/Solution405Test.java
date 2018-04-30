package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution405;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution405Test {
    
    public Solution405Test() {
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
     * Test of toHex method, of class Solution405.
     */
    @Test
    public void testToHex() {
        System.out.println("toHex");
        Solution405 instance = new Solution405();
        
        assertEquals("0", instance.toHex(0));
        assertEquals("1", instance.toHex(1));
        assertEquals("a", instance.toHex(10));
        assertEquals("f", instance.toHex(15));
        assertEquals("1a", instance.toHex(26));
        assertEquals("400", instance.toHex(1024));
        assertEquals("7fffffff", instance.toHex(2147483647));
        assertEquals("ffffffff", instance.toHex(-1));
        assertEquals("fffffffe", instance.toHex(-2));
        assertEquals("80000000", instance.toHex(-2147483648));
    }
}
