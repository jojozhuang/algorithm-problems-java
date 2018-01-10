package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution225;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution225Test {
    
    public Solution225Test() {
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
     * Test of push method, of class Solution225.
     */
    @Test
    public void testStack() {
        System.out.println("testStack");
        Solution225 stack = new Solution225();
        
        assertEquals(true, stack.empty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        assertEquals(false, stack.empty());
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(false, stack.empty());
        assertEquals(1, stack.top());
        assertEquals(1, stack.top());
        assertEquals(false, stack.empty());
        stack.push(4);
        assertEquals(4, stack.pop());
        assertEquals(false, stack.empty());
        assertEquals(1, stack.pop());
        assertEquals(true, stack.empty());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
