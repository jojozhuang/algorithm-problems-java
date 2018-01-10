package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution507;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution507Test {
    
    public Solution507Test() {
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
     * Test of checkPerfectNumber method, of class Solution507.
     */
    @Test
    public void testCheckPerfectNumber() {
        System.out.println("checkPerfectNumber");
        Solution507 instance = new Solution507();
        assertEquals(false, instance.checkPerfectNumber(1));
        assertEquals(false, instance.checkPerfectNumber(2));
        assertEquals(false, instance.checkPerfectNumber(3));
        assertEquals(false, instance.checkPerfectNumber(4));
        assertEquals(false, instance.checkPerfectNumber(5));
        assertEquals(true, instance.checkPerfectNumber(6));
        assertEquals(false, instance.checkPerfectNumber(7));
        assertEquals(false, instance.checkPerfectNumber(8));
        assertEquals(false, instance.checkPerfectNumber(9));
        assertEquals(false, instance.checkPerfectNumber(10));
        assertEquals(false, instance.checkPerfectNumber(11));
        assertEquals(false, instance.checkPerfectNumber(12));
        assertEquals(false, instance.checkPerfectNumber(13));
        assertEquals(false, instance.checkPerfectNumber(14));
        assertEquals(false, instance.checkPerfectNumber(15));
        assertEquals(false, instance.checkPerfectNumber(16));
        assertEquals(true, instance.checkPerfectNumber(28));
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
