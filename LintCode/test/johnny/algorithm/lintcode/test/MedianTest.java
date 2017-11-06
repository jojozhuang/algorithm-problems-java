/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.lintcode.Median;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class MedianTest {
    
    public MedianTest() {
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
     * Test of median method, of class Median.
     */
    @Test
    public void testMedian() {
        System.out.println("median");
        int[] nums = null;
        Median instance = new Median();
        int expResult = -1;
        int result = instance.median(nums);
        assertEquals(expResult, result);
        
        assertEquals(3, instance.median(new int[] {4, 5, 1, 2, 3}));
        assertEquals(5, instance.median(new int[] {7, 9, 4, 5}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
