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
public class Solution201Test {
    
    public Solution201Test() {
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
     * Test of rangeBitwiseAnd method, of class Solution201.
     */
    @Test
    public void testRangeBitwiseAnd() {
        System.out.println("rangeBitwiseAnd");
        int m = 0;
        int n = 0;
        Solution201 instance = new Solution201();
        int expResult = 0;
        int result = instance.rangeBitwiseAnd(m, n);
        assertEquals(expResult, result);
        
        assertEquals(4, instance.rangeBitwiseAnd(5, 7));
        assertEquals(2, instance.rangeBitwiseAnd(2, 3));
        assertEquals(0, instance.rangeBitwiseAnd(0, Integer.MAX_VALUE));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
