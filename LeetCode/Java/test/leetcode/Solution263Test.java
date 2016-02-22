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
public class Solution263Test {
    
    public Solution263Test() {
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
     * Test of isUgly method, of class Solution263.
     */
    @Test
    public void testIsUgly() {
        System.out.println("isUgly");
        int num = 0;
        Solution263 instance = new Solution263();
        boolean expResult = false;
        boolean result = instance.isUgly(num);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.isUgly(1));
        assertEquals(true, instance.isUgly(2));
        assertEquals(true, instance.isUgly(3));
        assertEquals(true, instance.isUgly(5));
        assertEquals(false, instance.isUgly(7));
        assertEquals(true, instance.isUgly(8));
        assertEquals(true, instance.isUgly(9));
        assertEquals(true, instance.isUgly(10));
        assertEquals(false, instance.isUgly(11));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
