package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution043;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution043Test {
    
    public Solution043Test() {
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
     * Test of multiply method, of class Solution043.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        String num1 = null;
        String num2 = null;
        Solution043 instance = new Solution043();
        String expResult = null;
       String result = instance.multiply(num1, num2);
        assertEquals(expResult, result);
        
        assertEquals("", instance.multiply("", ""));
        assertEquals("", instance.multiply("11", ""));
        assertEquals("0", instance.multiply("1", "0"));
        assertEquals("2", instance.multiply("1", "2"));
        assertEquals("81", instance.multiply("9", "9"));
        assertEquals("123", instance.multiply("123", "1"));
        assertEquals("456", instance.multiply("1", "456"));
       assertEquals("1230", instance.multiply("123", "10"));
        assertEquals("246", instance.multiply("123", "2"));
        assertEquals("42435", instance.multiply("123", "345"));
        assertEquals("15241578750190521", instance.multiply("123456789", "123456789"));
        assertEquals("0", instance.multiply("9133", "0"));
    }
}
