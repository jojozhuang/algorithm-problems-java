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
public class Solution020Test {
    
    public Solution020Test() {
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
     * Test of isValid method, of class Solution020.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        String s = "()";
        Solution020 instance = new Solution020();
        boolean expResult = true;
        boolean result = instance.isValid(s);
        /*assertEquals(expResult, result);
        
        assertEquals(false, instance.isValid("("));
        assertEquals(true, instance.isValid("()[]{}"));
        assertEquals(false, instance.isValid("(]"));
        assertEquals(false, instance.isValid("([)]"));*/
        //assertEquals(false, instance.isValid(")}{({))[{{[}"));
        assertEquals(false, instance.isValid("(("));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
