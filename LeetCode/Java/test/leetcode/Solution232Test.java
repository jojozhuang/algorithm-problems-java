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
        int x = 0;
        Solution232 instance = new Solution232();
        instance.push(x);
        assertEquals(0, instance.peek());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class Solution232.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Solution232 instance = new Solution232();  
        instance.push(3);
        assertEquals(false, instance.empty());
        instance.pop();
        assertEquals(true, instance.empty());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class Solution232.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        Solution232 instance = new Solution232();
        /*instance.push(2);        
        assertEquals(2, instance.peek());
        instance.push(3);
        assertEquals(2, instance.peek());
        instance.pop();
        assertEquals(3, instance.peek());
        instance.pop();*/
        
        instance.push(1); 
        instance.push(2); 
        instance.pop();
        instance.push(3); 
        instance.push(4); 
        instance.pop();
        assertEquals(3, instance.peek());   
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class Solution232.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        Solution232 instance = new Solution232();
        boolean expResult = true;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        instance.push(1);
        assertEquals(false, instance.empty());
        instance.peek();
        assertEquals(false, instance.empty());
        instance.pop();
        assertEquals(true, instance.empty());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
