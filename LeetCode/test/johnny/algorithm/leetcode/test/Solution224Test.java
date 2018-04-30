package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution224;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution224Test {
    
    public Solution224Test() {
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
     * Test of calculate method, of class Solution224.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        Solution224 instance = new Solution224();

        assertEquals(0, instance.calculate(""));
        assertEquals(2, instance.calculate("1 +1"));
        assertEquals(3, instance.calculate("2-1+2"));
        assertEquals(0, instance.calculate("1 + (2 -3)"));
        assertEquals(-3, instance.calculate("4 - (5 + 2)"));
        assertEquals(23, instance.calculate("(1+(4+5+2)-3)+(6+8)"));
    }
}
