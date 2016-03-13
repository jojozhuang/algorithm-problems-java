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
public class Solution150Test {
    
    public Solution150Test() {
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
     * Test of evalRPN method, of class Solution150.
     */
    @Test
    public void testEvalRPN() {
        System.out.println("evalRPN");
        String[] tokens = null;
        Solution150 instance = new Solution150();
        int expResult = 0;
        int result = instance.evalRPN(tokens);
        assertEquals(expResult, result);
        
        assertEquals(3, instance.evalRPN(new String[]{"2", "1", "+"}));
        assertEquals(9, instance.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        assertEquals(6, instance.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
