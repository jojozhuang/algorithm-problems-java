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
public class Solution191Test {
    
    public Solution191Test() {
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
     * Test of hammingWeight method, of class Solution191.
     */
    @Test
    public void testHammingWeight() {
        System.out.println("hammingWeight");
        int n = 0;
        Solution191 instance = new Solution191();
        int expResult = 0;
        int result = instance.hammingWeight(n);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.hammingWeight(1));
        assertEquals(1, instance.hammingWeight(2));
        assertEquals(2, instance.hammingWeight(3));
        assertEquals(1, instance.hammingWeight(4));
        assertEquals(2, instance.hammingWeight(5));
        assertEquals(2, instance.hammingWeight(6));
        assertEquals(3, instance.hammingWeight(7));
        assertEquals(1, instance.hammingWeight(8));
        assertEquals(2, instance.hammingWeight(9));
        assertEquals(2, instance.hammingWeight(10));
        assertEquals(3, instance.hammingWeight(11));
        assertEquals(31, instance.hammingWeight(2147483647));
        assertEquals(1, instance.hammingWeight(-2147483648));
        //assertEquals(1, instance.hammingWeight(2147483648l));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
