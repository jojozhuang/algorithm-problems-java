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
public class Solution383Test {
    
    public Solution383Test() {
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
     * Test of canConstruct method, of class Solution383.
     */
    @Test
    public void testCanConstruct() {
        System.out.println("canConstruct");
        Solution383 instance = new Solution383();
        assertEquals(true, instance.canConstruct("", ""));
        assertEquals(false, instance.canConstruct("a", ""));
        assertEquals(false, instance.canConstruct("a", "b"));
        assertEquals(false, instance.canConstruct("aa", "ab"));
        assertEquals(true, instance.canConstruct("aa", "aab"));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
