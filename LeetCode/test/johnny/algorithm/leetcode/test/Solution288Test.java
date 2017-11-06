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

import johnny.algorithm.leetcode.Solution288;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution288Test {
    
    public Solution288Test() {
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
     * Test of isUnique method, of class Solution288.
     */
    @Test
    public void testIsUnique() {
        System.out.println("isUnique");
        Solution288 instance = new Solution288(new String[]{"deer", "door", "cake", "card"});
        assertEquals(false, instance.isUnique("dear"));
        assertEquals(true, instance.isUnique("cart"));
        assertEquals(false, instance.isUnique("cane"));
        assertEquals(true, instance.isUnique("make"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
