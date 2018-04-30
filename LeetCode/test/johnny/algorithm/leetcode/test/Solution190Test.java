package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution190;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution190Test {
    
    public Solution190Test() {
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
     * Test of reverseBits method, of class Solution190.
     */
    @Test
    public void testReverseBits() {
        System.out.println("reverseBits");
        Solution190 instance = new Solution190();

        assertEquals(0, instance.reverseBits(0));
        assertEquals(964176192, instance.reverseBits(43261596));
        assertEquals(-2, instance.reverseBits(2147483647));
        assertEquals(1, instance.reverseBits((int)2147483648l));
    }
}
