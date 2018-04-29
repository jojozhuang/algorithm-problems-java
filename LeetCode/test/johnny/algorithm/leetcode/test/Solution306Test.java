package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution306;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution306Test {
    
    public Solution306Test() {
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
     * Test of isAdditiveNumber method, of class Solution306.
     */
    @Test
    public void testIsAdditiveNumber() {
        System.out.println("isAdditiveNumber");
        String num = "";
        Solution306 instance = new Solution306();
        boolean expResult = false;
        boolean result = instance.isAdditiveNumber(num);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.isAdditiveNumber("112358"));
        assertEquals(true, instance.isAdditiveNumber("199100199"));
        assertEquals(false, instance.isAdditiveNumber("1233456"));
        assertEquals(true, instance.isAdditiveNumber("198019823962"));
    }
}
