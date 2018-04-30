package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution065;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution065Test {
    
    public Solution065Test() {
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
     * Test of isNumber method, of class Solution065.
     */
    @Test
    public void testIsNumber() {
        System.out.println("isNumber");
        Solution065 instance = new Solution065();
 
        assertEquals(false, instance.isNumber(""));
        assertEquals(true, instance.isNumber("0"));
        assertEquals(true, instance.isNumber(" 0.1 "));
        assertEquals(false, instance.isNumber("abc"));
        assertEquals(false, instance.isNumber("1 a"));
        assertEquals(false, instance.isNumber("2b10"));
        assertEquals(true, instance.isNumber("023"));
        assertEquals(false, instance.isNumber("."));
        assertEquals(true, instance.isNumber(".2"));
        assertEquals(true, instance.isNumber("3."));
        assertEquals(true, instance.isNumber("3. "));
        assertEquals(false, instance.isNumber(" "));
        assertEquals(false, instance.isNumber(".."));
        assertEquals(true, instance.isNumber("2e0"));
        assertEquals(false, instance.isNumber(". 1"));
        assertEquals(true, instance.isNumber("-1."));
        assertEquals(true, instance.isNumber("+.8"));
        assertEquals(true, instance.isNumber("46.e3"));
        assertEquals(true, instance.isNumber(" 005047e+6"));
        assertEquals(false, instance.isNumber("+-."));
        assertEquals(false, instance.isNumber("4e+"));
        assertEquals(false, instance.isNumber(".-4"));
    }
}
