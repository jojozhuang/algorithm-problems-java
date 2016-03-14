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
public class Solution227Test {
    
    public Solution227Test() {
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
     * Test of calculate method, of class Solution227.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        String s = "";
        Solution227 instance = new Solution227();
        int expResult = 0;
        int result = instance.calculate(s);
        assertEquals(expResult, result);
        
        assertEquals(7, instance.calculate("3+2*2"));
        assertEquals(1, instance.calculate(" 3/2"));
        assertEquals(5, instance.calculate(" 3+5 / 2 "));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
