package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution258;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution258Test {
    
    public Solution258Test() {
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
     * Test of addDigits method, of class Solution258.
     */
    @Test
    public void testAddDigits() {
        System.out.println("addDigits");
        Solution258 instance = new Solution258();

        assertEquals(0, instance.addDigits(0));
        assertEquals(2, instance.addDigits(38));
        assertEquals(8, instance.addDigits(1853));
    }
}
