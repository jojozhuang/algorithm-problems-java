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
public class Solution087Test {
    
    public Solution087Test() {
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
     * Test of isScramble method, of class Solution087.
     */
    @Test
    public void testIsScramble() {
        System.out.println("isScramble");
        String s1 = "";
        String s2 = "";
        Solution087 instance = new Solution087();
        boolean expResult = true;
        boolean result = instance.isScramble(s1, s2);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.isScramble("great", "rgeat"));
        assertEquals(true, instance.isScramble("great", "rgtae"));
        assertEquals(false, instance.isScramble("great", "rgaat"));
        assertEquals(true, instance.isScramble("great", "rgate"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
