package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution233;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution233Test {
    
    public Solution233Test() {
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
     * Test of countDigitOne method, of class Solution233.
     */
    @Test
    public void testCountDigitOne() {
        System.out.println("countDigitOne");
        Solution233 instance = new Solution233();

        assertEquals(0, instance.countDigitOne(0));
        assertEquals(1, instance.countDigitOne(1));
        assertEquals(1, instance.countDigitOne(2));
        assertEquals(1, instance.countDigitOne(1));
        assertEquals(1, instance.countDigitOne(9));
        assertEquals(2, instance.countDigitOne(10));
        assertEquals(4, instance.countDigitOne(11));
        assertEquals(6, instance.countDigitOne(13));
        assertEquals(767944060, instance.countDigitOne(824883294)); // timeout
    }
}
