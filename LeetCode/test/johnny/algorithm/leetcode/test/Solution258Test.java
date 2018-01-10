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
        int num = 0;
        Solution258 instance = new Solution258();
        int expResult = 0;
        int result = instance.addDigits(num);
        assertEquals(expResult, result);
        
        assertEquals(2, instance.addDigits(38));
        assertEquals(8, instance.addDigits(1853));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
