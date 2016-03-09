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
public class Solution190Test {
    
    public Solution190Test() {
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
     * Test of reverseBits method, of class Solution190.
     */
    @Test
    public void testReverseBits() {
        System.out.println("reverseBits");
        int n = 0;
        Solution190 instance = new Solution190();
        int expResult = 0;
        int result = instance.reverseBits(n);
        assertEquals(expResult, result);
        
        assertEquals(964176192, instance.reverseBits(43261596));
        assertEquals(1, instance.reverseBits(2147483647));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
