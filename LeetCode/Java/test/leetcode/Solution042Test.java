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
 * @author RZHUANG
 */
public class Solution042Test {
    
    public Solution042Test() {
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
     * Test of trap method, of class Solution042.
     */
    @Test
    public void testTrap() {
        System.out.println("trap");
        int[] height = null;
        Solution042 instance = new Solution042();
        int expResult = 0;
        int result = instance.trap(height);
        assertEquals(expResult, result);
        
        assertEquals(6, instance.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
