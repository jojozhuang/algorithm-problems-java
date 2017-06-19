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
 * @author i857285
 */
public class Solution434Test {
    
    public Solution434Test() {
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
     * Test of countSegments method, of class Solution434.
     */
    @Test
    public void testCountSegments() {
        System.out.println("countSegments");
        Solution434 instance = new Solution434();
        assertEquals(0, instance.countSegments(""));
        assertEquals(1, instance.countSegments("a"));
        assertEquals(2, instance.countSegments(" a b "));
        assertEquals(5, instance.countSegments("Hello, my name is John"));
        assertEquals(0, instance.countSegments("   "));
        assertEquals(6, instance.countSegments(", , , ,        a, eaefa"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
