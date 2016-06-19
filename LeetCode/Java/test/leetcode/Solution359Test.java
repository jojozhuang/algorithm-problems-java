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
public class Solution359Test {
    
    public Solution359Test() {
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
     * Test of shouldPrintMessage method, of class Solution359.
     */
    @Test
    public void testShouldPrintMessage() {
        System.out.println("shouldPrintMessage");
        int timestamp = 0;
        String message = "";
        Solution359 instance = new Solution359();

        assertEquals(true, instance.shouldPrintMessage(1, "foo"));
        assertEquals(true, instance.shouldPrintMessage(2, "bar"));
        assertEquals(false, instance.shouldPrintMessage(3, "foo"));
        assertEquals(false, instance.shouldPrintMessage(8, "bar"));
        assertEquals(false, instance.shouldPrintMessage(10, "foo"));
        assertEquals(true, instance.shouldPrintMessage(11, "foo"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
