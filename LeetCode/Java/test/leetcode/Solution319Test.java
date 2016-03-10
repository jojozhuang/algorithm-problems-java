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
public class Solution319Test {
    
    public Solution319Test() {
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
     * Test of bulbSwitch method, of class Solution319.
     */
    @Test
    public void testBulbSwitch() {
        System.out.println("bulbSwitch");
        int n = 0;
        Solution319 instance = new Solution319();
        int expResult = 0;
        int result = instance.bulbSwitch(n);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.bulbSwitch(1));
        assertEquals(1, instance.bulbSwitch(2));
        assertEquals(1, instance.bulbSwitch(3));
        assertEquals(2, instance.bulbSwitch(4));
        assertEquals(2, instance.bulbSwitch(5));
        assertEquals(2, instance.bulbSwitch(6));
        assertEquals(2, instance.bulbSwitch(7));
        assertEquals(2, instance.bulbSwitch(8));
        assertEquals(3, instance.bulbSwitch(9));
        assertEquals(3, instance.bulbSwitch(10));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
