package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution326;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution326Test {
    
    public Solution326Test() {
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
     * Test of isPowerOfThree method, of class Solution326.
     */
    @Test
    public void testIsPowerOfThree() {
        System.out.println("isPowerOfThree");
        int n = 0;
        Solution326 instance = new Solution326();
        boolean expResult = false;
        boolean result = instance.isPowerOfThree(n);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.isPowerOfThree(3));
        assertEquals(false, instance.isPowerOfThree(8));
        assertEquals(true, instance.isPowerOfThree(81));
        assertEquals(false, instance.isPowerOfThree(101));
        assertEquals(false, instance.isPowerOfThree(Integer.MAX_VALUE));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
