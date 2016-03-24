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
public class Solution246Test {
    
    public Solution246Test() {
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
     * Test of isStrobogrammatic method, of class Solution246.
     */
    @Test
    public void testIsStrobogrammatic() {
        System.out.println("isStrobogrammatic");
        String num = "";
        Solution246 instance = new Solution246();
        boolean expResult = false;
        boolean result = instance.isStrobogrammatic(num);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.isStrobogrammatic("69"));
        assertEquals(true, instance.isStrobogrammatic("88"));
        assertEquals(true, instance.isStrobogrammatic("818"));
        assertEquals(true, instance.isStrobogrammatic("808"));
        assertEquals(false, instance.isStrobogrammatic("169"));
        assertEquals(false, instance.isStrobogrammatic("669"));
        assertEquals(false, instance.isStrobogrammatic("6996"));
        assertEquals(true, instance.isStrobogrammatic("661199"));
        assertEquals(true, instance.isStrobogrammatic("6699"));
        assertEquals(false, instance.isStrobogrammatic("7212"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
