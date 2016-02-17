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
public class Solution038Test {
    
    public Solution038Test() {
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
     * Test of countAndSay method, of class Solution038.
     */
    @Test
    public void testCountAndSay() {
        System.out.println("countAndSay");
        int n = 0;
        Solution038 instance = new Solution038();
        String expResult = "";
        String result = instance.countAndSay(n);
        assertEquals(expResult, result);
        
        assertEquals("1", instance.countAndSay(1));
        assertEquals("11", instance.countAndSay(2));
        assertEquals("21", instance.countAndSay(3));
        assertEquals("1211", instance.countAndSay(4));
        assertEquals("111221", instance.countAndSay(5));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of countAndSay2 method, of class Solution038.
     */
    @Test
    public void testCountAndSay2() {
        System.out.println("countAndSay2");
        int n = 0;
        Solution038 instance = new Solution038();
        String expResult = "";
        String result = instance.countAndSay2(n);
        assertEquals(expResult, result);
        
        assertEquals("1", instance.countAndSay2(1));
        assertEquals("11", instance.countAndSay2(2));
        assertEquals("21", instance.countAndSay2(3));
        assertEquals("1211", instance.countAndSay2(4));
        assertEquals("111221", instance.countAndSay2(5));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
