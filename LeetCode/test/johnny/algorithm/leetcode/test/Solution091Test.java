package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution091;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution091Test {
    
    public Solution091Test() {
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
     * Test of numDecodings method, of class Solution091.
     */
    @Test
    public void testNumDecodings() {
        System.out.println("numDecodings");
        String s = "";
        Solution091 instance = new Solution091();
        int expResult = 0;
        int result = instance.numDecodings(s);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.numDecodings("1"));
        assertEquals(2, instance.numDecodings("12"));
        assertEquals(3, instance.numDecodings("123"));
        assertEquals(1, instance.numDecodings("637"));
        assertEquals(1, instance.numDecodings("120"));
        assertEquals(1, instance.numDecodings("2020"));
        assertEquals(2, instance.numDecodings("2120"));
        assertEquals(1, instance.numDecodings("10210"));
        assertEquals(589824, instance.numDecodings("4757562545844617494555774581341211511296816786586787755257741178599337186486723247528324612117156948"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
