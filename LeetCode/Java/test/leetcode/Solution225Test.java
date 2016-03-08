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
    public void testPush() {
        System.out.println("push");
        int x = 0;
        Solution225 instance = new Solution225();
        assertEquals(true, instance.empty());
        instance.push(x);
        assertEquals(false, instance.empty());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class Solution225.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Solution225 instance = new Solution225();
        instance.push(1);
        assertEquals(false, instance.empty());
        instance.pop();
        assertEquals(true, instance.empty());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of top method, of class Solution225.
     */
    @Test
    public void testTop() {
        System.out.println("top");
        Solution225 instance = new Solution225();
        int expResult = 1;
        instance.push(1);
        int result = instance.top();
        assertEquals(expResult, result);
        
        instance.push(2);
        instance.push(3);
        instance.push(4);
        assertEquals(4, instance.top());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class Solution225.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        Solution225 instance = new Solution225();
        boolean expResult = true;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
