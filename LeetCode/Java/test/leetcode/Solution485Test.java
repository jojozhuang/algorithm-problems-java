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
public class Solution485Test {
    
    public Solution485Test() {
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
     * Test of findMaxConsecutiveOnes method, of class Solution485.
     */
    @Test
    public void testFindMaxConsecutiveOnes() {
        System.out.println("findMaxConsecutiveOnes");
        Solution485 instance = new Solution485();

        assertEquals(0, instance.findMaxConsecutiveOnes(new int[]{}));
        assertEquals(1, instance.findMaxConsecutiveOnes(new int[]{1}));
        assertEquals(0, instance.findMaxConsecutiveOnes(new int[]{0}));
        assertEquals(1, instance.findMaxConsecutiveOnes(new int[]{0,0,1}));
        assertEquals(1, instance.findMaxConsecutiveOnes(new int[]{1,0,0}));
        assertEquals(2, instance.findMaxConsecutiveOnes(new int[]{0,0,1,1}));
        assertEquals(3, instance.findMaxConsecutiveOnes(new int[]{1,1,1,0,0,0}));
        assertEquals(3, instance.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
        assertEquals(3, instance.findMaxConsecutiveOnes(new int[]{1,1,1,0,1}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
