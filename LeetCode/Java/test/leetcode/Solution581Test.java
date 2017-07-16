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
public class Solution581Test {
    
    public Solution581Test() {
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
     * Test of findUnsortedSubarray method, of class Solution581.
     */
    @Test
    public void testFindUnsortedSubarray() {
        System.out.println("findUnsortedSubarray");
        Solution581 instance = new Solution581();

        assertEquals(0, instance.findUnsortedSubarray(new int[]{}));
        assertEquals(0, instance.findUnsortedSubarray(new int[]{1}));
        assertEquals(0, instance.findUnsortedSubarray(new int[]{1,2}));
        assertEquals(2, instance.findUnsortedSubarray(new int[]{2,1}));
        assertEquals(5, instance.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
