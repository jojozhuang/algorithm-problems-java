package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution232;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution232Test {
    
    public Solution232Test() {
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
     * Test of push method, of class Solution232.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Solution232 queue = new Solution232();
        assertEquals(true, queue.empty());
        queue.push(1);
        queue.push(2);
        queue.push(3);
        
        assertEquals(false, queue.empty());
        assertEquals(1, queue.pop());
        assertEquals(2, queue.pop());
        assertEquals(false, queue.empty());
        assertEquals(3, queue.peek());
        assertEquals(3, queue.peek());
        assertEquals(false, queue.empty());
        queue.push(4);
        assertEquals(3, queue.pop());
        assertEquals(false, queue.empty());
        assertEquals(4, queue.pop());
        assertEquals(true, queue.empty());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
