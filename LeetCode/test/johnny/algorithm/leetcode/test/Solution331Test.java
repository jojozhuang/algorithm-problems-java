/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution331;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution331Test {
    
    public Solution331Test() {
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
     * Test of isValidSerialization method, of class Solution331.
     */
    @Test
    public void testIsValidSerialization() {
        System.out.println("isValidSerialization");
        String preorder = "";
        Solution331 instance = new Solution331();
        boolean expResult = false;
        boolean result = instance.isValidSerialization(preorder);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.isValidSerialization("#"));
        assertEquals(false, instance.isValidSerialization("1,#"));
        assertEquals(false, instance.isValidSerialization("9,#,#,1"));        
        assertEquals(true, instance.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
        assertEquals(false, instance.isValidSerialization("1,#,#,#,#"));
        assertEquals(true, instance.isValidSerialization("9,#,92,#,#"));
        assertEquals(false, instance.isValidSerialization("#,8,8,3,#,#,0,4,4,#,#,#,#,#,3,7,8,#,7,#,#"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
