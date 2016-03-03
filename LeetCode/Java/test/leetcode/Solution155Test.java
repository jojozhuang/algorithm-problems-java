/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
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
     * Test of push method, of class Solution155.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        int x = 0;
        Solution155 instance = new Solution155();
        instance.push(x);
        assertEquals(0, instance.top());
        assertEquals(0, instance.getMin());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class Solution155.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Solution155 instance = new Solution155();
        instance.push(1);
        assertEquals(1, instance.top());
        assertEquals(1, instance.getMin());
        instance.pop();
        instance.push(2);
        assertEquals(2, instance.top());
        assertEquals(2, instance.getMin());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of top method, of class Solution155.
     */
    @Test
    public void testTop() {
        System.out.println("top");
        Solution155 instance = new Solution155();
        instance.push(1);
        assertEquals(1, instance.top());
        instance.push(2);
        assertEquals(2, instance.top());
        instance.push(3);
        assertEquals(3, instance.top());
        instance.push(4);
        assertEquals(4, instance.top());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMin method, of class Solution155.
     */
    @Test
    public void testGetMin() {
        System.out.println("getMin");
        Solution155 instance = new Solution155();
        instance.push(4);
        assertEquals(4, instance.getMin());
        instance.push(2);
        assertEquals(2, instance.getMin());
        instance.push(3);
        assertEquals(2, instance.getMin());
        instance.pop();
        instance.push(1);
        assertEquals(1, instance.getMin());
        instance.pop();
        assertEquals(2, instance.getMin());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
