package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution155;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution155Test {
    
    public Solution155Test() {
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
     * Test of getMin method, of class Solution155.
     */
    @Test
    public void testMinStack() {
        System.out.println("minStack");
        Solution155 instance = new Solution155();
        instance.push(4);
        assertEquals(4, instance.getMin());
        instance.push(2);
        assertEquals(2, instance.getMin());
        instance.push(3);
        assertEquals(2, instance.getMin());
        assertEquals(3, instance.top());
        instance.push(1);
        assertEquals(1, instance.getMin());
        assertEquals(1, instance.top());
        instance.pop();
        assertEquals(2, instance.getMin());
        assertEquals(3, instance.top());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
