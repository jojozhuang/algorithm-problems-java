package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution150;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution150Test {
    
    public Solution150Test() {
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
     * Test of evalRPN method, of class Solution150.
     */
    @Test
    public void testEvalRPN() {
        System.out.println("evalRPN");
        Solution150 instance = new Solution150();

        assertEquals(0, instance.evalRPN(null));
        assertEquals(3, instance.evalRPN(new String[]{"2", "1", "+"}));
        assertEquals(9, instance.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        assertEquals(6, instance.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }
}
