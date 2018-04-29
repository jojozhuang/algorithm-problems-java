package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution020;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution020Test {
    
    public Solution020Test() {
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
     * Test of isValid method, of class Solution020.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        Solution020 instance = new Solution020();

        assertEquals(true, instance.isValid(""));
        assertEquals(true, instance.isValid("()"));
        assertEquals(false, instance.isValid("("));
        assertEquals(true, instance.isValid("()[]{}"));
        assertEquals(false, instance.isValid("(]"));
        assertEquals(false, instance.isValid("([)]"));
        assertEquals(false, instance.isValid(")}{({))[{{[}"));
        assertEquals(false, instance.isValid("(("));
    }
    
}
