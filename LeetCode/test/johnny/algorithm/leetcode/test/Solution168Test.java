package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution168;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution168Test {
    
    public Solution168Test() {
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
     * Test of convertToTitle method, of class Solution168.
     */
    @Test
    public void testConvertToTitle() {
        System.out.println("convertToTitle");
        int n = 0;
        Solution168 instance = new Solution168();
        String expResult = "";
        String result = instance.convertToTitle(n);
        assertEquals(expResult, result);
        
        assertEquals("A", instance.convertToTitle(1));
        assertEquals("Y", instance.convertToTitle(25));
        assertEquals("Z", instance.convertToTitle(26));
        assertEquals("AA", instance.convertToTitle(27));
        assertEquals("AZ", instance.convertToTitle(52));
        assertEquals("AAE", instance.convertToTitle(707));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
